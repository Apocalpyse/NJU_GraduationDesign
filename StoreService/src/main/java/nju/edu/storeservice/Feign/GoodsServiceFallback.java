package nju.edu.storeservice.Feign;

import nju.edu.storeservice.Model.GoodsVo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GoodsServiceFallback implements GoodsService {

    @Override
    public List<GoodsVo> getGoodsBySellerID(int id) {
        return null;
    }

    @Override
    public boolean publishGoods(GoodsVo goodsVO) {
        return false;
    }

    @Override
    public boolean changeGoods(GoodsVo goodsVO) {
        return false;
    }

    @Override
    public boolean cancelGoods(int goodsId) {
        return false;
    }
}
