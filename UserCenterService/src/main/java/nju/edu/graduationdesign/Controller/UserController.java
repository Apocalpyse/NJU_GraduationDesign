package nju.edu.graduationdesign.Controller;

import nju.edu.graduationdesign.Service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserInfoService userInfoService;

    @RequestMapping(value = "/getUserNameList",method = RequestMethod.GET)
    public List<String> getUserNameList(@RequestParam List<Integer> userids){
        List<String> results=new ArrayList<>();
        for (int userid:userids){
            results.add(userInfoService.getUserInfoById(userid).getUsername());
        }
        return results;
    }
}
