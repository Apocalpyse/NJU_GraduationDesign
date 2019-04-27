package nju.edu.storeservice.Feign;

import nju.edu.storeservice.Model.GoodsVO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GoodsServiceFallback implements GoodsService {

    @Override
    public List<GoodsVO> getStoreGoods(int id) {
        return null;
    }

    @Override
    public boolean publishGoods(GoodsVO goodsVO) {
        return false;
    }

    @Override
    public boolean changeGoods(GoodsVO goodsVO) {
        return false;
    }

    @Override
    public boolean cancelGoods(int goodsId) {
        return false;
    }
}
