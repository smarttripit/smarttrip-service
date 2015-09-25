package com.smarttrip.dao;

import com.smarttrip.domain.User;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

public interface UserMapper {
	
    int deleteByPrimaryKey(String id);

    int insert(User record);

    User selectByPrimaryKey(String id);

    List<User> selectByPage(RowBounds rb);

    int updateByPrimaryKey(User record);
}