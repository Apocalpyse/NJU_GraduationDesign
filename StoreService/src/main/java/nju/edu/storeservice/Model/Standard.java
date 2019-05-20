package nju.edu.storeservice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: demo
 * @Description:
 * @author: Mr.gao
 * @create: 2019-04-16 14:56
 * @email: 630268696@qq.com
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Standard {
    //存储属性值与属性名称 再加上价格变动量
    String standardName;
    String standardValue;
    double moneyChange;
    String picUrl;

}
