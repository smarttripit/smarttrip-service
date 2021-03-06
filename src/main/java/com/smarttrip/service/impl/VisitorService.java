package com.smarttrip.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
	
	@Override
	public Visitor selectByMobileNo(String mobileNo) {
		if(mobileNo == null  ||  mobileNo.equals("")){
			logger.error("mobileNo不能为空");
			throw new NullPointerException("mobileNo不能为空");
		}
		Visitor Visitor = visitorMapper.selectByMobileNo(mobileNo);
		return Visitor;
	}
	
	@Override
	public Visitor selectByEmail(String email) {
		if(email == null  ||  email.equals("")){
			logger.error("email不能为空");
			throw new NullPointerException("email不能为空");
		}
		Visitor Visitor = visitorMapper.selectByEmail(email);
		return Visitor;
	}
	
	@Override
	public Visitor selectByName(String name) {
		if(name == null  ||  name.equals("")){
			logger.error("name不能为空");
			throw new NullPointerException("name不能为空");
		}
		Visitor Visitor = visitorMapper.selectByName(name);
		return Visitor;
	}

	@Override
	public int updateStatusByVisitorId(String visitorId, String status) {
		if(visitorId == null  ||  visitorId.equals("")||status ==null||status.equals("")){
			logger.error("visitorId或status不能为空");
			throw new NullPointerException("visitorId或status不能为空");
		}
		int count = visitorMapper.updateStatusByVisitorId(visitorId,status);
		return count;
		}

	@Override
	public  PageInfo<Visitor> selectVisitorByPage(int page, int rows, String name,
			String mobileNo, String email) {
		if (!(name == null || name.equals(""))){
			name = "%"+name+"%";
		}
		PageHelper.startPage(page, rows);
		List<Visitor> list = visitorMapper.selectAllByConditions(name,mobileNo,email);
		PageInfo<Visitor> pageInfo = new PageInfo<Visitor>(list); 
		return pageInfo;
	}

	
	}

