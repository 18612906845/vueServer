package cn.citms.vue.vs.dao;

import cn.citms.vue.vs.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    int insert(User record);

    int insertSelective(User record);

    List<User> selectAllUser();
}