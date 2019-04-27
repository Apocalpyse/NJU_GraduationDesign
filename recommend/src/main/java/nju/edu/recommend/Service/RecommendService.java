package nju.edu.recommend.Service;

import nju.edu.recommend.Feign.GoodsFeignClient;
import nju.edu.recommend.Feign.OrderFeignClient;
import nju.edu.recommend.Model.GoodsVO;
import nju.edu.recommend.Model.Order;
import nju.edu.recommend.Model.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class RecommendService {

    @Autowired
    OrderFeignClient orderFeignClient;
    @Autowired
    GoodsFeignClient goodsFeignClient;

    /*根据用户消费记录推荐商品
    推荐算法思路
    1 根据品牌推荐，推荐相同品牌的商品
    2 根据商铺推荐，推荐买过的商铺的商品
    3 根据所属分类推荐，推荐分类相同的商品
    所有推荐算法得出的商品列表，返回前端数据前按照商品评分排序，无评分视为最低分
     */


    //从订单模块获取用户所有订单
    List<Order> getOrders(int userid){
        return orderFeignClient.getOrderLists(userid);
    }

    //从商品模块根据id获取商品列表
    List<GoodsVO> getGoodsById(int userid){
        List<Order> orders=this.getOrders(userid);
        //取近10单做分析
        if(orders.size()>=10){
            orders=orders.subList(0,9);
        }
        List<OrderItem> items=new ArrayList<>();
        //先将所有订单包含的所有订单项整理到一个list中
        for (Order order:orders){
            items.addAll(order.getItems());
        }
        //根据订单项筛选出不重复的商品id
        List<String> skuids=new ArrayList<>();
        for(OrderItem orderItem:items){
            if(!skuids.contains(orderItem.getSkuid())){
                skuids.add(orderItem.getSkuid());
            }
        }
        return goodsFeignClient.getGoodsVOS(skuids);
    }


    //从商品模块获取推荐商品，根据品牌名称和其比重
    public List<GoodsVO> getRecommendGoodsListByBrand(int userid){
        List<String> brands=new ArrayList<>();
        List<GoodsVO> goods=this.getGoodsById(userid);
        for(GoodsVO goodsVO:goods){
            brands.add(goodsVO.getBrand());
        }
        //统计出消费记录中包含的商品品牌和出现次数
        ConcurrentHashMap<String,Integer> brandWeights=new ConcurrentHashMap<>();
        for(String brand:brands){
            if(brandWeights.containsKey(brand)){
                brandWeights.replace(brand,brandWeights.get(brand)+1);
            }else {
                brandWeights.put(brand,1);
            }
        }
        //总共推荐10件商品
        //记录每个品牌对应的权重，得出推荐的10件商品中应该有几件
        int total=0;
        Map<String,Integer> queryData=new ConcurrentHashMap<>();
        for(Map.Entry<String,Integer> entry:brandWeights.entrySet()){
             total+=entry.getValue();
        }
        for(Map.Entry<String,Integer> entry:brandWeights.entrySet()){
            queryData.put(entry.getKey(),10*entry.getValue()/total);
        }
        return goodsFeignClient.getGoodsVOSByBrand(queryData);
    }


    public List<GoodsVO> getRecommendGoodsListByStore(int userid){
        List<Integer> stores=new ArrayList<>();
        List<GoodsVO> goods=this.getGoodsById(userid);
        for(GoodsVO goodsVO:goods){
            stores.add(goodsVO.getStoreId());
        }
        ConcurrentHashMap<Integer,Integer> storeWeights=new ConcurrentHashMap<>();
        for(Integer store:stores){
            if(storeWeights.containsKey(store)){
                storeWeights.replace(store,storeWeights.get(store)+1);
            }else {
                storeWeights.put(store,1);
            }
        }
        int total=0;
        Map<Integer,Integer> queryData=new ConcurrentHashMap<>();
        for(Map.Entry<Integer,Integer> entry:storeWeights.entrySet()){
            total+=entry.getValue();
        }
        for(Map.Entry<Integer,Integer> entry:storeWeights.entrySet()){
            queryData.put(entry.getKey(),10*entry.getValue()/total);
        }
        return goodsFeignClient.getGoodsVOSByStores(queryData);
    }

    public List<GoodsVO> getRecommendGoodsListByClassify(int userid){
        List<String> classifies=new ArrayList<>();
        List<GoodsVO> goods=this.getGoodsById(userid);
        for(GoodsVO goodsVO:goods){
            classifies.addAll(goodsVO.getClassifies());
        }
        //统计出消费记录中包含的商品品牌和出现次数
        ConcurrentHashMap<String,Integer> classifyWeights=new ConcurrentHashMap<>();
        for(String classify:classifies){
            if(classifyWeights.containsKey(classify)){
                classifyWeights.replace(classify,classifyWeights.get(classify)+1);
            }else {
                classifyWeights.put(classify,1);
            }
        }
        //总共推荐10件商品
        //记录每个品牌对应的权重，得出推荐的10件商品中应该有几件
        int total=0;
        Map<String,Integer> queryData=new ConcurrentHashMap<>();
        for(Map.Entry<String,Integer> entry:classifyWeights.entrySet()){
            total+=entry.getValue();
        }
        for(Map.Entry<String,Integer> entry:classifyWeights.entrySet()){
            queryData.put(entry.getKey(),10*entry.getValue()/total);
        }
        return goodsFeignClient.getGoodsVOSByBrand(queryData);
    }
}
