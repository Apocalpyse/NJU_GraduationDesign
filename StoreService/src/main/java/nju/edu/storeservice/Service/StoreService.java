package nju.edu.storeservice.Service;

import nju.edu.storeservice.Feign.GoodsService;
import nju.edu.storeservice.Mapper.StoreMapper;
import nju.edu.storeservice.Model.GoodsVo;
import nju.edu.storeservice.Model.StoreVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    @Autowired
    StoreMapper storeMapper;
    @Autowired
    GoodsService goodsService;

    public boolean registry(StoreVO storeVO){
         return storeMapper.insertStore(storeVO);
    }

    public StoreVO getById(int id){
        return storeMapper.findStoreById(id);
    }

    public boolean changeStoreInfo(StoreVO storeVO){
        return storeMapper.updateStore(storeVO);
    }

    public List<GoodsVo> getGoods(int id){
        return goodsService.getGoodsBySellerID(id);
    }

    public boolean publishGoods(GoodsVo goodsVO){
        return goodsService.publishGoods(goodsVO);
    }

    public boolean cancelGoods(int id){
        return goodsService.cancelGoods(id);
    }

    public boolean changeGoods(GoodsVo goodsVO){
        return goodsService.changeGoods(goodsVO);
    }
}
