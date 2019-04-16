package nju.edu.graduationdesign.Service;

import nju.edu.graduationdesign.Mapper.UserMapper;
import nju.edu.graduationdesign.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    UserMapper userMapper;

    public boolean login(String account,String password){
        String pw=userMapper.findPasswordByAccount(account);
        if(pw==null){
            return false;
        }else {
            return pw.equals(password);
        }
    }

    public User findAllInfoByAccount(String account){
        return userMapper.findUserByAccount(account);
    }

}
