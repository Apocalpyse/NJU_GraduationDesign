package nju.edu.recommend.Feign;

import nju.edu.recommend.Model.GoodsVO;

import java.util.List;
import java.util.Map;

public class GoodsFallBack implements GoodsFeignClient {
    @Override
    public List<GoodsVO> getGoodsVOS(List<String> ids) {
        return null;
    }

    @Override
    public List<GoodsVO> getGoodsVOSByBrand(Map<String, Integer> queryData) {
        return null;
    }

    @Override
    public List<GoodsVO> getGoodsVOSByStores(Map<Integer, Integer> queryData) {
        return null;
    }

    @Override
    public List<GoodsVO> getGoodsVOSByClassify(Map<String, Integer> queryData) {
        return null;
    }
}
