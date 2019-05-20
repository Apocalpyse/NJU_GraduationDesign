package nju.edu.graduationdesign.Controller;

import nju.edu.graduationdesign.Model.User;
import nju.edu.graduationdesign.Service.RegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistryController {

    @Autowired
    RegistryService registryService;

    @RequestMapping(value = "/registry",method = RequestMethod.GET)
    public boolean registry(@RequestBody User  user){
        return registryService.registry(user);
    }
}
