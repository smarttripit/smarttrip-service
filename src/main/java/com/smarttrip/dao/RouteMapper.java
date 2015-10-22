package com.smarttrip.dao;

import com.smarttrip.domain.Route;
import java.util.List;

public interface RouteMapper {
    int deleteByPrimaryKey(String routeId);

    int insert(Route record);

    Route selectByPrimaryKey(String routeId);

    List<Route> selectAll();

    int updateByPrimaryKey(Route record);
    
    List<Route> selectTop3ByDisplayOrder();
    
    List<Integer> selectPeriods();
    
    List<Route> selectByPeriod(int period);
    
    List<Route> selectByRegionId(String regionId);
    
    List<Route> selectByRegionIdAndPeriod(String regionId, int period);
}