package com.smarttrip.dao;

import java.util.List;

import com.smarttrip.domain.User;

public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKey(User record);
    
    List<User> selectAll();
}