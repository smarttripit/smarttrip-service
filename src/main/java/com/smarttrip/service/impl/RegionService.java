package com.smarttrip.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smarttrip.dao.RegionMapper;
import com.smarttrip.domain.Region;
import com.smarttrip.service.IRegionService;

/**
 * @author gaoweibupt@gmail.com
 * @version Date：2015年10月14日下午9:26:46
 * 
 * IRegionService的实现类
 */
@Service("regionService")
@Transactional
public class RegionService implements IRegionService {

	private Logger logger = LoggerFactory.getLogger(RegionService.class);

	@Autowired
	private RegionMapper regionMapper;
	
	/**
	 * 插入
	 * 
	 */
	@Override
	public int insert(Region record) {
		// TODO Auto-generated method stub
		if (record == null){
			logger.error("Region不能为null");
			throw new NullPointerException("Region不能为null");
		}
		int result = regionMapper.insert(record);
		return result;
	}

	@Override
	public int deleteByPrimaryKey(String regionId) {
		// TODO Auto-generated method stub
		if (regionId == null || regionId.equals("")){
			logger.error("regionId不能为空");
			throw new NullPointerException("regionId不能为空");
		}
		int count = regionMapper.deleteByPrimaryKey(regionId);
		return count;
	}

	@Override
	public int updateByPrimaryKey(Region record) {
		// TODO Auto-generated method stub
		if (record == null){
			logger.error("Region不能为null");
			throw new NullPointerException("Region不能为null");
		}
		int count = regionMapper.updateByPrimaryKey(record);
		return count;
	}

	@Override
	public Region selectByPrimaryKey(String regionId) {
		// TODO Auto-generated method stub
		if (regionId == null || regionId.equals("")){
			logger.error("regionId不能为空");
			throw new NullPointerException("regionId不能为空");
		}
		Region record = regionMapper.selectByPrimaryKey(regionId);
		return record;
	}
	
	@Override
	public List<Region> selectByFirstRegion(String city){
		// TODO Auto-generated method stub
		if (city == null || city.equals("")){
			logger.error("city不能为空");
			throw new NullPointerException("city不能为空");
		}
		List<Region> record = regionMapper.selectByFirstRegion(city);
		return record;
	}

	@Override
	public List<String> selectRegionId(String firstRegion, List<String> secondRegion){
		if (firstRegion.equals("") || firstRegion== null){
			throw new NullPointerException("输入城市不能为空");
		}
		return regionMapper.selectRegionId(firstRegion, secondRegion);
	}
}
