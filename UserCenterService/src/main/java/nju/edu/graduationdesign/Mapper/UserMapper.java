package nju.edu.graduationdesign.Mapper;

import nju.edu.graduationdesign.Model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    User findUserById(int id);

    User findUserByAccount(String account);

    String findPasswordByAccount(String account);

    boolean saveUser(User user);

    boolean updateUser(User user);
}
