package nju.edu.recommend.Feign;

import nju.edu.recommend.Model.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Component
@FeignClient(value = "GOODSSERVICE",fallback = GoodsFallBack.class)
public interface GoodsFeignClient {

    @RequestMapping(value = "/getGoodsList",method = RequestMethod.GET)
    List<Goods> getGoodsVOS(@RequestBody List<String> ids);

    @RequestMapping(value = "/brand",method = RequestMethod.GET)
    List<Goods> getGoodsVOSByBrand(@RequestBody Map<String,Integer> queryData);

    @RequestMapping(value = "/store",method = RequestMethod.GET)
    List<Goods> getGoodsVOSByStores(@RequestBody Map<Integer,Integer> queryData);

    @RequestMapping(value = "/classify",method = RequestMethod.GET)
    List<Goods> getGoodsVOSByClassify(@RequestBody Map<String,Integer> queryData);
}
