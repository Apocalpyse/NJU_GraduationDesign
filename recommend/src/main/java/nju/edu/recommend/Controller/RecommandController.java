package nju.edu.recommend.Controller;

import nju.edu.recommend.Model.GoodsVO;
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
    public List<GoodsVO> getRecommendGoodsByBrand(@RequestParam int userid){
        return recommendService.getRecommendGoodsListByBrand(userid);
    }

    @RequestMapping(value = "/price",method = RequestMethod.GET)
    public List<GoodsVO> getRecommendGoodsByPrice(@RequestParam int userid){
        return recommendService.getRecommendGoodsListByStore(userid);
    }

    @RequestMapping(value = "/classify",method = RequestMethod.GET)
    public List<GoodsVO> getRecommendGoodsByClassify(@RequestParam int userid){
        return recommendService.getRecommendGoodsListByClassify(userid);
    }
}
