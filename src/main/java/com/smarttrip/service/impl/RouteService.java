package com.smarttrip.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.smarttrip.dao.RouteMapper;
import com.smarttrip.dao.RouteThemeMapper;
import com.smarttrip.dao.ThemeMapper;
import com.smarttrip.domain.ClassicalRoute;
import com.smarttrip.domain.Route;
import com.smarttrip.domain.RouteTheme;
import com.smarttrip.service.IRouteService;

/**
 * @author gaoweibupt@gmail.com
 * @version Date：2015年10月14日下午9:27:26
 */

public class RouteService implements IRouteService {

	private Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private RouteMapper routeMapper;
	private RouteThemeMapper routeThemeMapper;
	private ThemeMapper themeMapper;
	
	@Override
	public Route selectByPrimaryKey(String routeId) {
		// TODO Auto-generated method stub
		if (routeId == null || routeId.equals("")){
			logger.error("routrId不能为null");
			throw new NullPointerException("routeId不能为null");
		}
		Route record = routeMapper.selectByPrimaryKey(routeId);
		return record;
	}

	@Override
	public int insert(Route record) {
		// TODO Auto-generated method stub
		if (record == null){
			logger.error("Route不能为null");
			throw new NullPointerException("Route不能为null");
		}
		int count = routeMapper.insert(record);
		return count;
	}

	@Override
	public int deleteByPrimaryKey(String routeId) {
		// TODO Auto-generated method stub
		if (routeId == null || routeId.equals("")){
			logger.error("routeId不能为null");
			throw new NullPointerException("routeId不能为空");
		}
		int count = routeMapper.deleteByPrimaryKey(routeId);
		return count;
	}

	@Override
	public int updateByPrimaryKey(Route record) {
		// TODO Auto-generated method stub
		if (record == null){
			logger.error("Route不能为null");
			throw new NullPointerException("Route不能为null");
		}
		int count = routeMapper.updateByPrimaryKey(record);
		return count;
	}

	@Override
	public List<Route> selectByName(String name){
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClassicalRoute> selectTop3ByDisplayOrder(){
		List<ClassicalRoute> classicalRouteList = new ArrayList<ClassicalRoute>();
		//获取主页的三条线路
		List<Route> route = routeMapper.selectTop3ByDisplayOrder();
		//分别获取三条线路的主题，并最后封装成classicalRoute类型
		for (int i = 0; i < route.size(); i++){
			List<RouteTheme> routeTheme = routeThemeMapper.selectByRouteId(route.get(i).getRouteId());
			List<String> routeThemeName = new ArrayList<String>();
			for (int j = 0; j < routeTheme.size(); j++){
				routeThemeName.add(themeMapper.selectByPrimaryKey(routeTheme.get(j).getRouteId()).getName());
			}
			ClassicalRoute classicalRoute = new ClassicalRoute();
			classicalRoute.setRoute(route.get(i));
			classicalRoute.setRouteTheme(routeThemeName);
			classicalRouteList.add(classicalRoute);
		}
		return classicalRouteList;
	}
	

}
