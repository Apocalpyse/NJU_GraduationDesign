package nju.edu.recommend.Feign;

import nju.edu.recommend.Model.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
@FeignClient(value = "ORDERSERVICE",fallback =OrderFallBack.class )
public interface OrderFeignClient {

    @RequestMapping(value = "/getOrders",method = RequestMethod.GET)
    List<Order> getOrderLists(@RequestParam int userid);

}
