package com.smarttrip.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smarttrip.dao.VisitorThemeMapper;
import com.smarttrip.domain.VisitorTheme;
import com.smarttrip.service.IVisitorThemeService;

/**
 * IVisitorThemeService的实现类. <br/>
 * date: 2015年10月15日 10:19 <br/>
 *
 * @author 1361200381@qq.com
 */
@Service("visitorThemeService")
@Transactional
public class VisitorThemeService implements IVisitorThemeService{
	
	private Logger logger = LoggerFactory.getLogger(VisitorThemeService.class);
	@Autowired
	private VisitorThemeMapper visitorThemeMapper;
	
	/**
	 * 插入.
	 * @see com.smarttrip.service.IVisitorThemeService#insert(com.smarttrip.domain.VisitorTheme)
	 */
	@Override
	public int insert(VisitorTheme visitorTheme) {
		if(visitorTheme == null){
			logger.error("VisitorTheme不能为null");
			throw new NullPointerException("VisitorTheme不能为null");
		}
		int result = visitorThemeMapper.insert(visitorTheme);
		return result;
	}
	
	/**
	 * 删除.
	 * @see com.smarttrip.service.IVisitorThemeService#deleteByPrimaryKey(java.lang.String)
	 */
	@Override
	public int deleteByPrimaryKey(String visitorThemeId) {
		if(visitorThemeId == null  ||  visitorThemeId.equals("")){
			logger.error("visitorThemeId不能为空");
			throw new NullPointerException("visitorThemeId不能为空");
		}
		int count = visitorThemeMapper.deleteByPrimaryKey(visitorThemeId);
		return count;
	}
	
	/**
	 * 更新.
	 * @see com.smarttrip.service.IVisitorThemeService#updateByPrimaryKey(com.smarttrip.domain.VisitorTheme)
	 */
	@Override
	public int updateByPrimaryKey(VisitorTheme visitorTheme) {
		if(visitorTheme == null){
			logger.error("VisitorTheme不能为null");
			throw new NullPointerException("VisitorTheme不能为null");
		}
		int count = visitorThemeMapper.updateByPrimaryKey(visitorTheme);
		return count;
	}
	
	/**
	 * 查询.
	 * @see com.smarttrip.service.IVisitorThemeService#selectByPrimaryKey(java.lang.String)
	 */
	@Override
	public VisitorTheme selectByPrimaryKey(String visitorThemeId) {
		if(visitorThemeId == null  ||  visitorThemeId.equals("")){
			logger.error("visitorThemeId不能为空");
			throw new NullPointerException("visitorThemeId不能为空");
		}
		VisitorTheme visitorTheme = visitorThemeMapper.selectByPrimaryKey(visitorThemeId);
		return visitorTheme;
	}
}
