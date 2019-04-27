package nju.edu.recommend.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {
    long orderid;
    String skuid;
    double price;
    int number;
    int score;
}
