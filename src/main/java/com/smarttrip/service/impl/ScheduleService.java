package com.smarttrip.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smarttrip.dao.ScheduleMapper;
import com.smarttrip.domain.Schedule;
import com.smarttrip.service.IScheduleService;

/**
 * @author gaoweibupt@gmail.com
 * @version Date：2015年10月14日下午9:29:33
 */
@Service("scheduleService")
@Transactional
public class ScheduleService implements IScheduleService {
	private Logger logger = LoggerFactory.getLogger(ScheduleService.class);

	@Autowired
	private ScheduleMapper scheduleMapper;
	
	@Override
	public int insert(Schedule record) {
		// TODO Auto-generated method stub
		if (record == null){
			logger.error("Schedule不能为null");
			throw new NullPointerException("Schedule不能为null");
		}
		int count = scheduleMapper.insert(record);
		return count;
	}

	@Override
	public int deleteByPrimaryKey(String scheduleId) {
		// TODO Auto-generated method stub
		if (scheduleId == null || scheduleId.equals("")){
			logger.equals("scheduleId不能为null");
			throw new NullPointerException("scheduleId不能为null");
		}
		int count = scheduleMapper.deleteByPrimaryKey(scheduleId);
		return count;
	}

	@Override
	public int updateByPrimaryKey(Schedule record) {
		// TODO Auto-generated method stub
		if (record == null){
			logger.error("Schedule不能为null");
			throw new NullPointerException("Schedule不能为null");
		}
		int count = scheduleMapper.updateByPrimaryKey(record);
		return count;
	}

	@Override
	public Schedule selectByPrimaryKey(String scheduleId) {
		// TODO Auto-generated method stub
		if (scheduleId == null || scheduleId.equals("")){
			logger.error("scheduleId不能为null");
			throw new NullPointerException("schedulId不能为null");
		}
		Schedule record = scheduleMapper.selectByPrimaryKey(scheduleId);
		return record;
	}
	
	@Override
	public List<Schedule> selectByRouteId(String routeId){
		if (routeId == null || routeId.equals("")){
			logger.error("routeId不能为空");
			throw new NullPointerException("routeId不能为空");
		}
		return scheduleMapper.selectByRouteId(routeId);
	}

}
