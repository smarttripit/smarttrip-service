package com.smarttrip.service.impl;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smarttrip.dao.RouteThemeMapper;
import com.smarttrip.domain.RouteTheme;
import com.smarttrip.service.IRouteThemeService;

/**
 * @author gaoweibupt@gmail.com
 * @version Date：2015年10月14日下午9:28:37
 */
@Service("routeThemeService")
@Transactional
public class RouteThemeService implements IRouteThemeService {
	private Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private RouteThemeMapper routeThemeMapper;
	
	@Override
	public int insert(RouteTheme record) {
		// TODO Auto-generated method stub
		if (record == null){
			logger.error("RouteTheme不能为null");
			throw new NullPointerException("RouteTheme不能为null");
		}
		int count = routeThemeMapper.insert(record);
		return count;
	}

	@Override
	public int deleteByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		if (id == null || id.equals("")){
			logger.error("id不能为null");
			throw new NullPointerException("id不能为null");
		}
		int count = routeThemeMapper.deleteByPrimaryKey(id);
		return count;
	}

	@Override
	public int updateByPrimaryKey(RouteTheme record) {
		// TODO Auto-generated method stub
		if (record == null){
			logger.error("RouteTheme不能为null");
			throw new NullPointerException("RouteTheme不能为null");
		}
		int count = routeThemeMapper.updateByPrimaryKey(record);
		return count;
	}

	@Override
	public RouteTheme selectByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		if (id == null || id.equals("")){
			logger.error("Id不能为null");
			throw new NullPointerException("Id不能为null");
		}
		RouteTheme record = routeThemeMapper.selectByPrimaryKey(id);
		return record;
	}
	
	@Override
	public List<RouteTheme> selectByRouteId(String routeId){
		// TODO Auto-generated method stub
		if (routeId == null || routeId.equals("")){
			logger.error("routeId不能为null");
			throw new NullPointerException("routeId不能为null");
		}
		List<RouteTheme> record = routeThemeMapper.selectByRouteId(routeId);
		return record;
	}
	
	@Override
	public List<RouteTheme> selectByThemeId(String themeId){
		// TODO Auto-generated method stub
		if (themeId == null || themeId.equals("")){
			logger.error("themeId不能为null");
			throw new NullPointerException("themeId不能为null");
		}
		List<RouteTheme> record = routeThemeMapper.selectByThemeId(themeId);
		return record;
	}
	
	@Override
	public List<String> selectRouteId(List<String> themeId){
		return routeThemeMapper.selectRouteId(themeId);
	}
	

	


}
