package nju.edu.graduationdesign.Service;

import nju.edu.graduationdesign.Mapper.AddressMapper;
import nju.edu.graduationdesign.Mapper.UserMapper;
import nju.edu.graduationdesign.Model.Address;
import nju.edu.graduationdesign.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    AddressMapper  addressMapper;

    //根据id获取用户信息
    public User getUserInfoById(int id){
        return userMapper.findUserById(id);
    }

    //用户修改密码
    public boolean changeUserPassword(int id,String oldPw,String newPw){
        User user=userMapper.findUserById(id);
        if(user.getPassword().equals(oldPw)){
            user.setPassword(newPw);
            userMapper.updateUser(user);
            return true;
        }else {
            return false;
        }
    }

    //修改用户信息
    public boolean changeUserInfo(User user){
        return userMapper.updateUser(user);
    }

    //账号撤销
    //只将账号设为不活跃状态，不删除数据
    //撤销的账号不可恢复，不可登录
    public boolean cancelAccount(int id){
        User user=userMapper.findUserById(id);
        user.setAlive(false);
        return userMapper.updateUser(user);
    }

    //获取用户地址
    public List<Address> getAddresses(int userid){
        return addressMapper.findAddressById(userid);
    }

    //修改用户地址
    public boolean changeAddress(Address address){
        return addressMapper.updateAddress(address);
    }

    //添加用户地址
    public boolean addAddress(Address address){
        return addressMapper.insertAddress(address);
    }
    //删除用户地址
    public boolean deleteAddress(int id){
        return addressMapper.deleteAddress(id);
    }
}
