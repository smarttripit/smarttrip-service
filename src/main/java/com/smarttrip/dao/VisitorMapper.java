package com.smarttrip.dao;

import com.smarttrip.domain.Visitor;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface VisitorMapper {
    int deleteByPrimaryKey(String visitorId);

    int insert(Visitor record);

    Visitor selectByPrimaryKey(String visitorId);

    List<Visitor> selectAll();

    int updateByPrimaryKey(Visitor record);

	Visitor selectByMobileNo(String mobileNo);

	Visitor selectByEmail(String email);

	Visitor selectByName(String name);

	int updateStatusByVisitorId(@Param("visitorId")String visitorId, @Param("status")String status);

	List<Visitor> selectAllByConditions(@Param("name")String name, @Param("mobileNo")String mobileNo,
			@Param("email")String email);

}