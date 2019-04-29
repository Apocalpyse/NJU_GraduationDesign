package nju.edu.graduationdesign.Feign;

import nju.edu.graduationdesign.Model.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("ORDERSERVICE")
public interface OrderFeignClient {

    @RequestMapping(value = "/getOrders",method = RequestMethod.GET)
    List<Order> getOrderLists(@RequestParam int userid);

    @RequestMapping(value = "/getOrders/unpayed",method = RequestMethod.GET)
    List<Order> getUnpayedOrders(@RequestParam int userid);

    @RequestMapping(value = "/getOrders/payed",method = RequestMethod.GET)
    List<Order> getPayedOrders(@RequestParam int userid);

    @RequestMapping(value = "/getOrders/canceled",method = RequestMethod.GET)
    List<Order> getCanceledOrders(@RequestParam int userid);

    @RequestMapping(value = "/getOrders/finished",method = RequestMethod.GET)
    List<Order> getFinishedOrders(@RequestParam int userid);
}
