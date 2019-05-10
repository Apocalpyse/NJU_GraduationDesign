package nju.edu.storeservice.Mapper;

import nju.edu.storeservice.Model.StoreVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StoreMapper {

    boolean insertStore(StoreVO storeVO);

    boolean deleteStore(int userid);

    boolean updateStore(StoreVO storeVO);

    StoreVO findStoreById(int userid);

    List<StoreVO> findAllStores();

}
