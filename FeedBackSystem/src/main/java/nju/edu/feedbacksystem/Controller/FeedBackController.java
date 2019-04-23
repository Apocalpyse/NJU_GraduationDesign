package nju.edu.feedbacksystem.Controller;

import nju.edu.feedbacksystem.Model.GoodsReport;
import nju.edu.feedbacksystem.Model.LeaveMessage;
import nju.edu.feedbacksystem.Service.GoodsReportService;
import nju.edu.feedbacksystem.Service.LeaveMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedback")
public class FeedBackController {

    @Autowired
    GoodsReportService goodsReportService;
    @Autowired
    LeaveMessageService leaveMessageService;

    /*
    *
    * 商品举报信息接口
    * 增删改查操作
    *
    * */
    @GetMapping("/goods/report/commit")
    public boolean publishReport(@RequestBody GoodsReport goodsReport){
        return goodsReportService.publishReport(goodsReport);
    }

    @GetMapping("/goods/report/change")
    public boolean changeReport(@RequestBody GoodsReport goodsReport){
        return goodsReportService.updateReports(goodsReport);
    }

    @GetMapping("/goods/report/delete")
    public boolean deleteReport(@RequestParam int id){
        return goodsReportService.cancelReport(id);
    }

    @GetMapping("/goods/report")
    public GoodsReport findOne(@RequestParam int id){
        return goodsReportService.getOneReport(id);
    }

    @GetMapping("/goods/report/user")
    public List<GoodsReport>  findReportByUser(@RequestParam int userid){
        return goodsReportService.getReportsByUserid(userid);
    }

    @GetMapping("/goods/allreport")
    public List<GoodsReport> findReportByGoods(@RequestParam int goodsid){
        return goodsReportService.getReportsByGoodsId(goodsid);
    }

    @GetMapping("/allgoodsreport")
    public List<GoodsReport> findAllReports(){
        return goodsReportService.getALl();
    }


    /*
    * 留言信息接口
    * */

    @GetMapping("/message/commit")
    public boolean publishMessage(@RequestBody LeaveMessage leaveMessage){
        return leaveMessageService.publishLeaveMessage(leaveMessage);
    }

    @GetMapping("/message/change")
    public boolean changeMessage(@RequestBody LeaveMessage leaveMessage){
        return leaveMessageService.changeMessage(leaveMessage);
    }

    @GetMapping("/message/delete")
    public boolean cancelMessage(@RequestParam int  id){
        return leaveMessageService.cancleMessage(id);
    }

    @GetMapping("/message")
    public LeaveMessage findOneMessage(@RequestParam int id){
        return leaveMessageService.findOneById(id);
    }

    @GetMapping("/message/user")
    public List<LeaveMessage> findMessageByUser(@RequestParam int userid){
        return leaveMessageService.findMessageByUser(userid);
    }

    @GetMapping("/message/all")
    public List<LeaveMessage> findALlMessage(){
        return leaveMessageService.getAll();
    }

}
