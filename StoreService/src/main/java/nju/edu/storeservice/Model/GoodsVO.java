package nju.edu.storeservice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsVO {
    //id
    int goodsId;
    //描述
    String description;
    //得分
    String goodsScore;
    //
    String brand;
    //描述
    String brandDescription;
    //分类
    List<String> classifies;
    //图片url
    List<String> picUrls;
    //商品名称
    String goodsName;
    //对应商店id
    int storeId;
    //价格
    double price;
    //
    Map<String,Map<String,Standard>> standards;
    //参数
    Map<String,String> attributes;

}
