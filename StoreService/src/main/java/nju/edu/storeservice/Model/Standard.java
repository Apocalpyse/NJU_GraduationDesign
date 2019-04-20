package nju.edu.storeservice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Standard {

    String standardName;
    String standardValue;
    double moneyChange;
    String picUrl;

}
