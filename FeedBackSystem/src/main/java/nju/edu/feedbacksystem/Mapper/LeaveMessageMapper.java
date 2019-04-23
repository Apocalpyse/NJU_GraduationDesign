package nju.edu.feedbacksystem.Mapper;

import nju.edu.feedbacksystem.Model.LeaveMessage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface LeaveMessageMapper {

    boolean insertLeaveMessage(LeaveMessage leaveMessage);

    boolean deleteLeaveMessage(int id);

    boolean updateLeaveMessage(LeaveMessage leaveMessage);

    LeaveMessage findLeaveMessageById(int id);

    List<LeaveMessage> findAllLeaveMessage();

    List<LeaveMessage> findLeaveMessageByUserId(int userid);
    
}
