package nju.edu.recommend.Model;

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
    //品牌
    String brand;
    //品牌描述
    String brandDescription;
    //商品所属分类
    List<String> classifies;
    //图片url
    List<String> picUrls;
    //商品名称
    String goodsName;
    //对应商店id
    int storeId;
    //价格
    double price;
    //属性值、属性名称
    Map<String,Map<String,Standard>> standards;
    //参数
    Map<String,String> attributes;

}
