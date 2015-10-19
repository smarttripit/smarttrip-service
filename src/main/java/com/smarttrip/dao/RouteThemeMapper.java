package com.smarttrip.dao;

import com.smarttrip.domain.RouteTheme;
import java.util.List;

public interface RouteThemeMapper {
    int deleteByPrimaryKey(String id);

    int insert(RouteTheme record);

    RouteTheme selectByPrimaryKey(String id);

    List<RouteTheme> selectAll();

    int updateByPrimaryKey(RouteTheme record);
    
    List<RouteTheme> selectByRouteId(String routeId);
}