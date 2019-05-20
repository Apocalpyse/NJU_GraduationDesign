package nju.edu.recommend.Feign;

import nju.edu.recommend.Model.Goods;

import java.util.List;
import java.util.Map;

public class GoodsFallBack implements GoodsFeignClient {
    @Override
    public List<Goods> getGoodsVOS(List<String> ids) {
        return null;
    }

    @Override
    public List<Goods> getGoodsVOSByBrand(Map<String, Integer> queryData) {
        return null;
    }

    @Override
    public List<Goods> getGoodsVOSByStores(Map<Integer, Integer> queryData) {
        return null;
    }

    @Override
    public List<Goods> getGoodsVOSByClassify(Map<String, Integer> queryData) {
        return null;
    }
}
