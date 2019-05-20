package nju.edu.storeservice.Feign;

import nju.edu.storeservice.Model.Goods;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GoodsServiceFallback implements GoodsService {

    @Override
    public List<Goods> getGoodsBySellerID(int id) {
        return null;
    }

    @Override
    public boolean publishGoods(Goods goods) {
        return false;
    }

    @Override
    public boolean changeGoods(Goods goods) {
        return false;
    }

    @Override
    public boolean cancelGoods(int goodsId) {
        return false;
    }
}
