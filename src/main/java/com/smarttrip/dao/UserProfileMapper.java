package com.smarttrip.dao;

import com.smarttrip.domain.UserProfile;


public interface UserProfileMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserProfile record);

    UserProfile selectByPrimaryKey(String id);

    int updateByPrimaryKey(UserProfile record);
}