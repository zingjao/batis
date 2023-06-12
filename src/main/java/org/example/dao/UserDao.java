package org.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.example.user.User;

@Mapper
public interface UserDao {
    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
}
