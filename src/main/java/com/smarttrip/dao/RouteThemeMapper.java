package com.smarttrip.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.smarttrip.domain.RouteTheme;

public interface RouteThemeMapper {
    int deleteByPrimaryKey(String id);

    int insert(RouteTheme record);

    RouteTheme selectByPrimaryKey(String id);

    List<RouteTheme> selectAll();

    int updateByPrimaryKey(RouteTheme record);
    
    List<RouteTheme> selectByRouteId(String routeId);
    
    List<RouteTheme> selectByThemeId(String themeId);
    
    List<String> selectRouteId(@Param("themeId")String[] themeId);
}