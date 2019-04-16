package nju.edu.graduationdesign.Controller;

import nju.edu.graduationdesign.Model.User;
import nju.edu.graduationdesign.Service.RegistryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class RegistryController {

    @Autowired
    RegistryService registryService;

    @GetMapping("/registry")
    public boolean registry(@RequestBody User  user){
        return registryService.registry(user);
    }
}
