package nju.edu.graduationdesign.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    //用户id
    private int id;
    //用户邮箱
    private String email;
    //用户名
    private String username;
    //用户账号
    private String account;
    //用户密码
    private String password;
    //手机号
    private String phone;
    //用户头像
    private String avatar;
    //余额
    private double balance;
    //是否有效
    private boolean alive;
    //注册时间
    private Date reg_time;

}
