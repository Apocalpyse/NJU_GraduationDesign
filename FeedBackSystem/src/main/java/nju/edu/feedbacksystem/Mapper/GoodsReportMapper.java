package nju.edu.feedbacksystem.Mapper;

import nju.edu.feedbacksystem.Model.GoodsReport;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface GoodsReportMapper {

    boolean insertGoodsReport(GoodsReport goodsReport);

    boolean deleteGoodsReport(int id);

    boolean updateGoodsReport(GoodsReport goodsReport);

    GoodsReport findGoodsReportById(int id);

    List<GoodsReport> findAllGoodsReport();

    List<GoodsReport> findGoodsReportByUserId(int userid);

    List<GoodsReport>  findGoodsReportByGoodsId(int goodsid);

}
