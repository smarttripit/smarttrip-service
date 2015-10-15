package com.smarttrip.dao;

import com.smarttrip.domain.Route;
import java.util.List;

public interface RouteMapper {
    int deleteByPrimaryKey(String routeId);

    int insert(Route record);

    Route selectByPrimaryKey(String routeId);

    int updateByPrimaryKey(Route record);
}