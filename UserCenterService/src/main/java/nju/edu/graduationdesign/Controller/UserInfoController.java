package nju.edu.graduationdesign.Controller;

import nju.edu.graduationdesign.Model.Address;
import nju.edu.graduationdesign.Model.Order;
import nju.edu.graduationdesign.Model.OrderState;
import nju.edu.graduationdesign.Model.User;
import nju.edu.graduationdesign.Service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/my",method = RequestMethod.GET)
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

    @GetMapping("/")
    public User getMyInfo(@RequestParam int id){
        return userInfoService.getUserInfoById(id);
    }

    @GetMapping("/changePassword")
    public boolean changePassword(@RequestParam int id,@RequestParam String oldPw,@RequestParam String newPw){
        return userInfoService.changeUserPassword(id,oldPw, newPw);
    }

    @GetMapping("/changeInfo")
    public boolean changeInfo(@RequestBody User user){
        return userInfoService.changeUserInfo(user);
    }

    @GetMapping("/cancellation")
    public boolean cancelAccount(@RequestParam int id){
        return userInfoService.cancelAccount(id);
    }

    @GetMapping("/getAddress")
    public List<Address> getAddress(@RequestParam int userid){
        return userInfoService.getAddresses(userid);
    }

    @GetMapping("/changeAddress")
    public boolean changeAddress(@RequestBody Address address){
        return userInfoService.changeAddress(address);
    }

    @GetMapping("/addAddress")
    public boolean addAddress(@RequestBody Address address){
        return userInfoService.addAddress(address);
    }

    @GetMapping("/deleteAddress")
    public boolean deleteAddress(@RequestParam int id){
        return userInfoService.deleteAddress(id);
    }

    @RequestMapping("/order")
    public List<Order> getOrders(@RequestParam int id){
        return userInfoService.getOrders(null,id);
    }

    @RequestMapping("/order/unpayed")
    public List<Order> getUnpayed(@RequestParam int id){
        return userInfoService.getOrders(OrderState.unpayed,id);
    }

    @RequestMapping("/order/payed")
    public List<Order> getPayed(@RequestParam int id){
        return userInfoService.getOrders(OrderState.payed,id);
    }

    @RequestMapping("/oder/canceled")
    public List<Order> getCanceled(@RequestParam int id){
        return userInfoService.getOrders(OrderState.canceled,id);
    }

    @RequestMapping("/order/finished")
    public List<Order> getFinished(@RequestParam int id){
        return userInfoService.getOrders(OrderState.finished,id);
    }
}
