package nju.edu.storeservice.Service;

import nju.edu.storeservice.Feign.GoodsService;
import nju.edu.storeservice.Mapper.StoreMapper;
import nju.edu.storeservice.Model.Goods;
import nju.edu.storeservice.Model.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    @Autowired
    StoreMapper storeMapper;
    @Autowired
    GoodsService goodsService;

    public boolean registry(Store store){
         return storeMapper.insertStore(store);
    }

    public Store getById(int id){
        return storeMapper.findStoreById(id);
    }

    public boolean changeStoreInfo(Store store){
        return storeMapper.updateStore(store);
    }

    public List<Goods> getGoods(int id){
        return goodsService.getStoreGoods(id);
    }

    public boolean publishGoods(Goods goods){
        return goodsService.publishGoods(goods);
    }

    public boolean cancelGoods(int id){
        return goodsService.cancelGoods(id);
    }

    public boolean changeGoods(Goods goods){
        return goodsService.changeGoods(goods);
    }
}
