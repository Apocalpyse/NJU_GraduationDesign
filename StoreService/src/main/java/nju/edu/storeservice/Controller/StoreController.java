package nju.edu.storeservice.Controller;

import nju.edu.storeservice.Feign.GoodsService;
import nju.edu.storeservice.Model.GoodsVo;
import nju.edu.storeservice.Model.StoreVO;
import nju.edu.storeservice.Service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StoreController {


    @Autowired
    StoreService storeService;
    @Autowired
    GoodsService goodsService;

    @GetMapping("/store/registry")
    public boolean registryStore(@RequestBody StoreVO storeVO){
        return storeService.registry(storeVO);
    }

    @GetMapping("/store")
    public StoreVO getStoreInfo(@RequestParam int userid){
        return storeService.getById(userid);
    }

    @GetMapping("/store/changeInfo")
    public boolean changeStoreInfo(@RequestBody StoreVO storeVO){
        return storeService.changeStoreInfo(storeVO);
    }

    @GetMapping("/store/Goods")
    public List<GoodsVo> getGoods(@RequestParam int id){
        return goodsService.getGoodsBySellerID(id);
    }

    @GetMapping("/store/publishGoods")
    public boolean publishGood(@RequestBody GoodsVo goodsVO){
        return storeService.publishGoods(goodsVO);
    }

    @GetMapping("/store/cancelGoods")
    public boolean cancelGood(@RequestParam int goodId){
        return storeService.cancelGoods(goodId);
    }

    @GetMapping("/store/changeGoods")
    public boolean modifyGood(@RequestBody GoodsVo goodsVO){
        return storeService.changeGoods(goodsVO);
    }

    @GetMapping("/store/getStoreVOs")
    public List<StoreVO> getStoreVOs(@RequestParam List<Integer> ids){
        List<StoreVO> storeVOS=new ArrayList<>();
        for(int i:ids){
            storeVOS.add(storeService.getById(i));
        }
        return storeVOS;
    }


}
