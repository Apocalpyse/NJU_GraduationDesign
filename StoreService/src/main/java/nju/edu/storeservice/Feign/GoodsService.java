package nju.edu.storeservice.Feign;

import nju.edu.storeservice.Model.GoodsVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
@FeignClient(value = "GOODSSERVICE",fallback = GoodsServiceFallback.class)
public interface GoodsService {

    //获取商铺所有的商品
    @GetMapping("/getGoodsBySellerId")
    List<GoodsVO> getStoreGoods(@RequestParam int id);

    //上架商品
    @GetMapping("/addNewGoods")
    boolean publishGoods(@RequestBody GoodsVO goodsVO);

    //修改某个商品的信息
    @GetMapping("/changeGoods")
    boolean changeGoods(@RequestBody GoodsVO goodsVO);

    //下架商品
    @GetMapping("/cancelGoods")
    boolean cancelGoods(@RequestParam int goodsId);
}
