package nju.edu.graduationdesign.Controller;

import nju.edu.graduationdesign.Model.User;
import nju.edu.graduationdesign.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/login")
    public boolean login(@RequestParam String account, @RequestParam String password, HttpSession httpSession){
        if(loginService.login(account, password)){
            User user=loginService.findAllInfoByAccount(account);
            if(user.isAlive()){
                httpSession.setAttribute("account",account);
                httpSession.setAttribute("id",user.getId());
            }else {
                return false;
            }
            return true;
        }else
            return false;
    }

}
