package nju.edu.recommend.Feign;

import nju.edu.recommend.Model.Order;

import java.util.List;

public class OrderFallBack implements OrderFeignClient {
    @Override
    public List<Order> getOrderLists(int userid) {
        return null;
    }
}
