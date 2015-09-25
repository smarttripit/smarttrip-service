package com.smarttrip.dao;

import com.smarttrip.domain.UserProfile;

import java.util.List;

public interface UserProfileMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserProfile record);

    UserProfile selectByPrimaryKey(String id);

    List<UserProfile> selectAll();

    int updateByPrimaryKey(UserProfile record);
}