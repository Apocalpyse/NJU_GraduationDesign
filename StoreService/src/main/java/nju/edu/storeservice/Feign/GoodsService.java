package nju.edu.storeservice.Feign;

import nju.edu.storeservice.Model.GoodsVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@FeignClient(value = "GOODSSERVICE",fallback = GoodsServiceFallback.class)
public interface GoodsService {

    //获取商铺所有的商品
    @RequestMapping(value = "/getGoodsBySellerId",method = RequestMethod.GET)
    List<GoodsVO> getStoreGoods(@RequestParam int id);

    //上架商品
    @RequestMapping(value = "/addNewGoods",method = RequestMethod.GET)
    boolean publishGoods(@RequestBody GoodsVO goodsVO);

    //修改某个商品的信息
    @RequestMapping(value = "/changeGoods",method = RequestMethod.GET)
    boolean changeGoods(@RequestBody GoodsVO goodsVO);

    //下架商品
    @RequestMapping(value = "/cancelGoods",method = RequestMethod.GET)
    boolean cancelGoods(@RequestParam int goodsId);
}
