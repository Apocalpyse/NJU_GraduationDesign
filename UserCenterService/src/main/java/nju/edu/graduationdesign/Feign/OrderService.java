package nju.edu.graduationdesign.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("ORDERSERVICE")
public interface OrderService {

}
