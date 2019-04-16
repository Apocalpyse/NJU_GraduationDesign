package nju.edu.graduationdesign.Mapper;

import nju.edu.graduationdesign.Model.Address;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AddressMapper {

  List<Address> findAddressById(int userid);

  boolean updateAddress(Address address);

  boolean insertAddress(Address address);

  boolean deleteAddress(int id);

}
