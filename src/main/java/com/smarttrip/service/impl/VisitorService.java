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
 * IVistorService的实现类. <br/>
 * date: 2015年10月15日 10:19 <br/>
 *
 * @author 1361200381@qq.com
 */
@Service("vistorService")
@Transactional
public class VisitorService implements IVisitorService{
	
	private Logger logger = LoggerFactory.getLogger(VisitorService.class);
	@Autowired
	private VisitorMapper vistorMapper;
	
	/**
	 * 插入.
	 * @see com.smarttrip.service.IVisitorService#insert(com.smarttrip.domain.Vistor)
	 */
	@Override
	public int insert(Visitor vistor) {
		if(vistor == null){
			logger.error("vistor不能为null");
			throw new NullPointerException("vistor不能为null");
		}
		int result = vistorMapper.insert(vistor);
		return result;
	}
	
	/**
	 * 删除.
	 * @see com.smarttrip.service.IVisitorService#deleteByPrimaryKey(java.lang.String)
	 */
	@Override
	public int deleteByPrimaryKey(String vistorId) {
		if(vistorId == null  ||  vistorId.equals("")){
			logger.error("vistorId不能为空");
			throw new NullPointerException("vistorId不能为空");
		}
		int count = vistorMapper.deleteByPrimaryKey(vistorId);
		return count;
	}
	
	/**
	 * 更新.
	 * @see com.smarttrip.service.IVisitorService#updateByPrimaryKey(com.smarttrip.domain.Vistor)
	 */
	@Override
	public int updateByPrimaryKey(Visitor vistor) {
		if(vistor == null){
			logger.error("vistor不能为null");
			throw new NullPointerException("vistor不能为null");
		}
		int count = vistorMapper.updateByPrimaryKey(vistor);
		return count;
	}
	
	/**
	 * 查询.
	 * @see com.smarttrip.service.IVisitorService#selectByPrimaryKey(java.lang.String)
	 */
	@Override
	public Visitor selectByPrimaryKey(String vistorId) {
		if(vistorId == null  ||  vistorId.equals("")){
			logger.error("vistorId不能为空");
			throw new NullPointerException("vistorId不能为空");
		}
		Visitor Vistor = vistorMapper.selectByPrimaryKey(vistorId);
		return Vistor;
	}
}
