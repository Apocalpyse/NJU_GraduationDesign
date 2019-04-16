package nju.edu.graduationdesign.Service;

import nju.edu.graduationdesign.Mapper.UserMapper;
import nju.edu.graduationdesign.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistryService {

    @Autowired
    UserMapper userMapper;

    public boolean registry(User user){
        User u=userMapper.findUserByAccount(user.getAccount());
        if(u==null){
            return userMapper.saveUser(user);
        }else {
            return false;
        }
    }

}
