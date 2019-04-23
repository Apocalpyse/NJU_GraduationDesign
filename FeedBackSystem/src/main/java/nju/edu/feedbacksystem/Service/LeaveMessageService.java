package nju.edu.feedbacksystem.Service;

import nju.edu.feedbacksystem.Mapper.LeaveMessageMapper;
import nju.edu.feedbacksystem.Model.LeaveMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveMessageService {

    @Autowired
    LeaveMessageMapper leaveMessageMapper;

    //发布留言
    public boolean publishLeaveMessage(LeaveMessage  leaveMessage){
        return leaveMessageMapper.insertLeaveMessage(leaveMessage);
    }

    //删除留言
    public boolean cancleMessage(int id){
        return leaveMessageMapper.deleteLeaveMessage(id);
    }
    //修改留言
    public boolean changeMessage(LeaveMessage  leaveMessage){
        return leaveMessageMapper.updateLeaveMessage(leaveMessage);
    }
    //根据id获取一个留言信息
    public LeaveMessage findOneById(int id){
        return leaveMessageMapper.findLeaveMessageById(id);
    }
    //获取一个用户全部留言
    public List<LeaveMessage> findMessageByUser(int userid){
        return leaveMessageMapper.findLeaveMessageByUserId(userid);
    }

    public List<LeaveMessage> getAll(){
        return leaveMessageMapper.findAllLeaveMessage();
    }
}
