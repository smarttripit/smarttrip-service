package com.smarttrip.dao;

import com.smarttrip.domain.Routetheme;
import java.util.List;

public interface RoutethemeMapper {
    int deleteByPrimaryKey(String id);

    int insert(Routetheme record);

    Routetheme selectByPrimaryKey(String id);

    List<Routetheme> selectAll();

    int updateByPrimaryKey(Routetheme record);
}