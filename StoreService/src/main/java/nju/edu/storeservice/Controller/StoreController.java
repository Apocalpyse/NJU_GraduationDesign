package nju.edu.storeservice.Controller;

import nju.edu.storeservice.Model.Goods;
import nju.edu.storeservice.Model.Store;
import nju.edu.storeservice.Service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StoreController {


    @Autowired
    StoreService storeService;

    @GetMapping("/store/registry")
    public boolean registryStore(@RequestBody Store store){
        return storeService.registry(store);
    }

    @GetMapping("/store")
    public Store getStoreInfo(@RequestParam int userid){
        return storeService.getById(userid);
    }

    @GetMapping("/store/changeInfo")
    public boolean changeStoreInfo(@RequestBody Store store){
        return storeService.changeStoreInfo(store);
    }

    @GetMapping("/store/Goods")
    public List<Goods> getGoods(@RequestParam int id){
        return storeService.getGoods(id);
    }

    @GetMapping("/store/publishGoods")
    public boolean publishGood(@RequestBody Goods goods){
        return storeService.publishGoods(goods);
    }

    @GetMapping("/store/cancelGoods")
    public boolean cancelGood(@RequestParam int goodId){
        return storeService.cancelGoods(goodId);
    }

    @GetMapping("/store/changeGoods")
    public boolean modifyGood(@RequestBody Goods goods){
        return storeService.changeGoods(goods);
    }

}
