package nju.edu.graduationdesign.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    long id;
    int userid;
    int storeid;
    int addressid;
    Timestamp time;
    double  money;
    int status;
    int service_score;
    int transport_score;
    List<OrderItem> items;
}
