package com.smarttrip.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smarttrip.dao.VisitorMapper;
import com.smarttrip.domain.Visitor;
import com.smarttrip.service.IVisitorService;

/**
 * IVisitorService的实现类. <br/>
 * date: 2015年10月15日 10:19 <br/>
 *
 * @author 1361200381@qq.com
 */
@Service("visitorService")
@Transactional
public class VisitorService implements IVisitorService{
	
	private Logger logger = LoggerFactory.getLogger(VisitorService.class);
	@Autowired
	private VisitorMapper visitorMapper;
	
	/**
	 * 插入.
	 * @see com.smarttrip.service.IVisitorService#insert(com.smarttrip.domain.Visitor)
	 */
	@Override
	public int insert(Visitor visitor) {
		if(visitor == null){
			logger.error("visitor不能为null");
			throw new NullPointerException("visitor不能为null");
		}
		int result = visitorMapper.insert(visitor);
		return result;
	}
	
	/**
	 * 删除.
	 * @see com.smarttrip.service.IVisitorService#deleteByPrimaryKey(java.lang.String)
	 */
	@Override
	public int deleteByPrimaryKey(String visitorId) {
		if(visitorId == null  ||  visitorId.equals("")){
			logger.error("visitorId不能为空");
			throw new NullPointerException("visitorId不能为空");
		}
		int count = visitorMapper.deleteByPrimaryKey(visitorId);
		return count;
	}
	
	/**
	 * 更新.
	 * @see com.smarttrip.service.IVisitorService#updateByPrimaryKey(com.smarttrip.domain.Visitor)
	 */
	@Override
	public int updateByPrimaryKey(Visitor visitor) {
		if(visitor == null){
			logger.error("visitor不能为null");
			throw new NullPointerException("visitor不能为null");
		}
		int count = visitorMapper.updateByPrimaryKey(visitor);
		return count;
	}
	
	/**
	 * 查询.
	 * @see com.smarttrip.service.IVisitorService#selectByPrimaryKey(java.lang.String)
	 */
	@Override
	public Visitor selectByPrimaryKey(String visitorId) {
		if(visitorId == null  ||  visitorId.equals("")){
			logger.error("visitorId不能为空");
			throw new NullPointerException("visitorId不能为空");
		}
		Visitor Visitor = visitorMapper.selectByPrimaryKey(visitorId);
		return Visitor;
	}
}
