package nju.edu.graduationdesign.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    //地址的id
    private int id;
    //用户id
    private int userid;
    //地区
    private String region;
    //详细地址
    private String address;
    //收货人
    private String receiver;
    //电话
    private String phone;
    //是否是默认地址
    private boolean is_default;
}
