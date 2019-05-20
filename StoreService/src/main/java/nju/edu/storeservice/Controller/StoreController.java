package nju.edu.storeservice.Controller;

import nju.edu.storeservice.Feign.GoodsService;
import nju.edu.storeservice.Model.Goods;
import nju.edu.storeservice.Model.Store;
import nju.edu.storeservice.Service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StoreController {


    @Autowired
    StoreService storeService;
    @Autowired
    GoodsService goodsService;

    @RequestMapping(value = "/store",method = RequestMethod.GET)
    public Store getStoreInfo(@RequestParam int userid){
        return storeService.getById(userid);
    }

    @RequestMapping(value = "/store/registry",method = RequestMethod.GET)
    public boolean registryStore(@RequestBody Store store){
        return storeService.registry(store);
    }


    @RequestMapping(value = "/store/changeInfo",method = RequestMethod.GET)
    public boolean changeStoreInfo(@RequestBody Store store){
        return storeService.changeStoreInfo(store);
    }

    @RequestMapping(value = "/store/goods",method = RequestMethod.GET)
    public List<Goods> getGoods(@RequestParam int id){
        return goodsService.getGoodsBySellerID(id);
    }

    @RequestMapping(value = "/store/publishGoods",method = RequestMethod.GET)
    public boolean publishGood(@RequestBody Goods goods){
        return storeService.publishGoods(goods);
    }

    @RequestMapping(value = "/store/cancelGoods",method = RequestMethod.GET)
    public boolean cancelGood(@RequestParam int goodId){
        return storeService.cancelGoods(goodId);
    }

    @RequestMapping(value = "/store/changeGoods",method = RequestMethod.GET)
    public boolean modifyGood(@RequestBody Goods goods){
        return storeService.changeGoods(goods);
    }

    @RequestMapping(value = "/store/getStores",method = RequestMethod.GET)
    public List<Store> getStores(@RequestParam List<Integer> ids){
        List<Store> stores =new ArrayList<>();
        for(int i:ids){
            stores.add(storeService.getById(i));
        }
        return stores;
    }


}
