package com.smarttrip.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smarttrip.dao.RegionMapper;
import com.smarttrip.dao.RouteMapper;
import com.smarttrip.dao.RouteThemeMapper;
import com.smarttrip.dao.ThemeMapper;
import com.smarttrip.domain.Region;
import com.smarttrip.domain.Route;
import com.smarttrip.domain.RouteTheme;
import com.smarttrip.domain.Theme;
import com.smarttrip.service.IRouteService;

/**
 * @author gaoweibupt@gmail.com
 * @version Date：2015年10月14日下午9:27:26
 */
@Service("routeService")
@Transactional
public class RouteService implements IRouteService {

	private Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private RouteMapper routeMapper;
	
	@Autowired
	private RegionMapper regionMapper;
	
	@Autowired 
	private ThemeMapper themeMapper;
	
	@Autowired
	private RouteThemeMapper routeThemeMapper;
	
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
	public List<Route> selectTop3ByDisplayOrder(){
		//获取主页的三条线路
		return routeMapper.selectTop3ByDisplayOrder();
	}
	
	@Override
	public List<Integer> selectPeriods(){
		return routeMapper.selectPeriods();
	}

	@Override
	public List<Route> selectByRegionId(String regionId){
		if (regionId == null || regionId.equals("")){
			logger.error("regionId不能为null");
			throw new NullPointerException("regionId不能为null");
		}
		List<Route> record = routeMapper.selectByRegionId(regionId);
		return record;
	}
//	/**
//	 * 按照给定条件查找路线
//	 * <p>每种条件只有一种类型<br>
//	 * 
//	 * 重写：需要些在controller层里面
//	 * 
//	 * 
//	 * 
//	 * */
//	@Override
//	public 	List<Route> selectByConditions(String firstRegion, String secondRegion, String themeName, int period){
//		//仅含有天数信息
//		if (firstRegion == null && secondRegion == null && themeName == null){
//			if (period <= 0){
//				logger.error("查询条件无效");
//				throw new NullPointerException("查询条件无效");
//			}
//			else{
//				List<Route> record = routeMapper.selectByPeriod(period);
//				return record;
//			}
//		}
//		//仅含有城市或区县信息
//		else if (themeName == null && period ==0){
//			List<Region> regions = new ArrayList<>();
//			if (firstRegion != null && secondRegion == null){
//				regions = regionMapper.selectByFirstRegion(firstRegion);	
//				List<Route> result = new ArrayList<>();
//				for (int i = 0; i < regions.size(); i++){
//					List<Route> routes = this.selectByRegionId(regions.get(i).getRegionId());
//					result.addAll(routes);
//				}
//				//返回某城市的路线
//				return result;
//			}
//			else{
//				Region region = regionMapper.selectBySecondRegion(secondRegion);
//				if (region.getFirstRegion().equals(firstRegion)){
//					regions.add(regionMapper.selectBySecondRegion(secondRegion));
//				}else{
//					logger.error("该区县不在该城市中");
//					throw new NullPointerException("该区县不在该城市中");
//				}
//				//返回某区县的路线 
//				return this.selectByRegionId(region.getRegionId());
//			}
//		}
//		//仅含有主题信息或同时含有天数信息
//		else if (firstRegion == null && secondRegion == null){
//			Theme theme = themeMapper.selectByThemeName(themeName);
//			List<Route> result = new ArrayList<>();
//			List<RouteTheme> routeThemes = routeThemeMapper.selectByThemeId(theme.getThemeId());
//			for (int i = 0; i < routeThemes.size(); i++){
//				Route route = routeMapper.selectByPrimaryKey(routeThemes.get(i).getRouteId());
//				if (period == 0 || period == route.getPeriod()){
//					result.add(route);
//				}
//			}
//			return result;
//		}
//		//含有区县信息及主题信息或同时含有天数信息
//		else if ((firstRegion != null || secondRegion != null) && themeName != null){
//			List<Region> regions = new ArrayList<>();
//			List<Route> result = new ArrayList<>();
//			if (secondRegion != null){
//				Region record = regionMapper.selectBySecondRegion(secondRegion);
//				if (record != null)regions.add(record);
//			}
//			else if (firstRegion != null && secondRegion == null){
//				regions = regionMapper.selectByFirstRegion(firstRegion);
//			}
//			
//			if (period != 0){
//				for (int i = 0; i < regions.size(); i++){
//					List<Route> record = routeMapper.selectByRegionIdAndPeriod(regions.get(i).getRegionId(), period);
//					if (record != null)result.addAll(record);
//				}
//			}
//			else{
//				for (int i = 0; i < regions.size(); i++){
//					List<Route> record = routeMapper.selectByRegionId(regions.get(i).getRegionId());
//					if (record != null)result.addAll(record);
//				}
//			}
//			return result;
//		}
//		else{
//			return null;
//		}
//	}
	
	@Override
	public List<Route> selectByConditions(List<String> regionId, List<String> routeId, int[] period, int pageNum, int pageSize, String sortField){
		if (pageNum < 0 || pageSize <= 0){
			logger.error("页数不合法");
			throw new NullPointerException("页数不合法");
		}
		int left = pageNum * pageSize;
		int right = left + pageSize;
		return routeMapper.selectByConditions(regionId, routeId, period, left, right, sortField);
	}

}
