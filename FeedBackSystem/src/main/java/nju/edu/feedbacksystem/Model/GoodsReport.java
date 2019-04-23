package nju.edu.feedbacksystem.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsReport {
    private int id;
    private int userid;
    private String username;
    private int goodsId;
    private String goodsName;
    private String description;
    private Date date;
    private String reply;
}
