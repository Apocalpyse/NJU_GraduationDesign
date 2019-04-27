package nju.edu.recommend.Feign;

import nju.edu.recommend.Model.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
@FeignClient(value = "ORDERSERVICE",fallback =OrderFallBack.class )
public interface OrderFeignClient {

    @GetMapping("/getOrders")
    List<Order> getOrderLists(@RequestParam int userid);

}
