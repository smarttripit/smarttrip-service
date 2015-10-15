package com.smarttrip.service.impl;

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

	private Logger logger = LoggerFactory.getLogger(UserService.class);

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

}
