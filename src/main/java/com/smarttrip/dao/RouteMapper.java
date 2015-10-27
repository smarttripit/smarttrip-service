package com.smarttrip.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.smarttrip.domain.Route;

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
    
    List<Route> selectByConditions(@Param("regionId")List<String> regionId, @Param("routeId")List<String> routeId, @Param("period")int[] period, @Param("left")int left, @Param("right")int right, @Param("sortField")String sortField);

    int updateStatusByRouteId(@Param("routeId")String routeId, @Param("status")char status);
}