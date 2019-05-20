package nju.edu.recommend.Controller;

import nju.edu.recommend.Model.Goods;
import nju.edu.recommend.Service.RecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recommend")
public class RecommandController {

    @Autowired
    RecommendService recommendService;

    @RequestMapping(value = "/brand",method = RequestMethod.GET)
    public List<Goods> getRecommendGoodsByBrand(@RequestParam int userid){
        return recommendService.getRecommendGoodsListByBrand(userid);
    }

    @RequestMapping(value = "/price",method = RequestMethod.GET)
    public List<Goods> getRecommendGoodsByPrice(@RequestParam int userid){
        return recommendService.getRecommendGoodsListByStore(userid);
    }

    @RequestMapping(value = "/classify",method = RequestMethod.GET)
    public List<Goods> getRecommendGoodsByClassify(@RequestParam int userid){
        return recommendService.getRecommendGoodsListByClassify(userid);
    }
}
