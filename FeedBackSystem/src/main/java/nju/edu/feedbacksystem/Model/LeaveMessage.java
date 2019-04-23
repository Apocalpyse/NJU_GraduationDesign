package nju.edu.feedbacksystem.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LeaveMessage {
   private int id;
   private int userid;
   private String username;
   private String description;
   private Date date;
   private String reply;
}
