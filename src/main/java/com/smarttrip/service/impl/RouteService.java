package com.smarttrip.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.smarttrip.dao.RouteMapper;
import com.smarttrip.domain.Route;
import com.smarttrip.service.IRouteService;

/**
 * @author gaoweibupt@gmail.com
 * @version Date：2015年10月14日下午9:27:26
 */

public class RouteService implements IRouteService {

	private Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private RouteMapper routeMapper;
	
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


}
