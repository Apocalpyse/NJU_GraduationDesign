package nju.edu.feedbacksystem.Service;

import nju.edu.feedbacksystem.Mapper.GoodsReportMapper;
import nju.edu.feedbacksystem.Model.GoodsReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsReportService {

    @Autowired
    GoodsReportMapper goodsReportMapper;

    //用户发布一个举报信息
    public boolean publishReport(GoodsReport goodsReport){
        return goodsReportMapper.insertGoodsReport(goodsReport);
    }

    //根据id获取某条举报信息
    public GoodsReport getOneReport(int id){
        return goodsReportMapper.findGoodsReportById(id);
    }

    //获取用户的所有举报信息
    public List<GoodsReport> getReportsByUserid(int userid){
        return goodsReportMapper.findGoodsReportByUserId(userid);
    }

    //获取关于某个商品的举报信息
    public List<GoodsReport> getReportsByGoodsId(int goodsid){
        return goodsReportMapper.findGoodsReportByGoodsId(goodsid);
    }

    //用户修改自己的举报信息的描述
    public boolean updateReports(GoodsReport goodsReport){
        return goodsReportMapper.updateGoodsReport(goodsReport);
    }

    //用户撤销发布的举报信息
    public boolean cancelReport(int id){
        return goodsReportMapper.deleteGoodsReport(id);
    }

    public List<GoodsReport> getALl(){
        return goodsReportMapper.findAllGoodsReport();
    }

}
