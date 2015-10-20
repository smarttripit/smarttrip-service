package com.smarttrip.dao;

import com.smarttrip.domain.Visitor;
import java.util.List;

public interface VisitorMapper {
    int deleteByPrimaryKey(String visitorId);

    int insert(Visitor record);

    Visitor selectByPrimaryKey(String visitorId);

    List<Visitor> selectAll();

    int updateByPrimaryKey(Visitor record);

	Visitor selectByMobileNo(String mobileNo);

	Visitor selectByEmail(String email);

	Visitor selectByName(String name);
}