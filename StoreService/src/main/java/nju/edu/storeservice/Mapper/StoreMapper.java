package nju.edu.storeservice.Mapper;

import nju.edu.storeservice.Model.Store;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StoreMapper {

    boolean insertStore(Store store);

    boolean deleteStore(int userid);

    boolean updateStore(Store store);

    Store findStoreById(int userid);

    List<Store> findAllStores();

}
