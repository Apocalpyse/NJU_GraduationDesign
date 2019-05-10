package nju.edu.graduationdesign.Service;

import nju.edu.graduationdesign.Mapper.UserMapper;
import nju.edu.graduationdesign.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RegistryService {

    @Autowired
    UserMapper userMapper;

    public boolean registry(User user){
        user.setReg_time(new Date());
        User u=userMapper.findUserByAccount(user.getAccount());
        if(u==null){
            user.setReg_time(new Date());
            return userMapper.saveUser(user);
        }else {
            return false;
        }
    }

}
