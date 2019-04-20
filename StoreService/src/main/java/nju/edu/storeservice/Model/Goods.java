package nju.edu.storeservice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {

    int goodsId;

    String description;

    String goodsScore;

    String brand;

    String brandDescription;

    List<String> classifies;

    List<String> picUrls;

    String goodsName;

    int storeId;

    double price;

    Map<String,Map<String,Standard>> standards;

    Map<String,String> attributes;

}
