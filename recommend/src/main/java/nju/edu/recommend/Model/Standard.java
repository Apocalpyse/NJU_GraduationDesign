package nju.edu.recommend.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Standard {

    //属性名称
    String standardName;
    //属性值
    String standardValue;
    //对应的价格变动（相较与原价）
    double moneyChange;
    //对应的图片url
    String picUrl;

}
