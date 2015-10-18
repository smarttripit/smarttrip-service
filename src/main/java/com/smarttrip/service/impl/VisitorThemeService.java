package com.smarttrip.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smarttrip.dao.VistorThemeMapper;
import com.smarttrip.domain.VistorTheme;
import com.smarttrip.service.IVistorThemeService;

/**
 * IVistorThemeService的实现类. <br/>
 * date: 2015年10月15日 10:19 <br/>
 *
 * @author 1361200381@qq.com
 */
@Service("vistorThemeService")
@Transactional
public class VistorThemeService implements IVistorThemeService{
	
	private Logger logger = LoggerFactory.getLogger(VistorThemeService.class);
	@Autowired
	private VistorThemeMapper vistorThemeMapper;
	
	/**
	 * 插入.
	 * @see com.smarttrip.service.IVistorThemeService#insert(com.smarttrip.domain.VistorTheme)
	 */
	@Override
	public int insert(VistorTheme vistorTheme) {
		if(vistorTheme == null){
			logger.error("VistorTheme不能为null");
			throw new NullPointerException("VistorTheme不能为null");
		}
		int result = vistorThemeMapper.insert(vistorTheme);
		return result;
	}
	
	/**
	 * 删除.
	 * @see com.smarttrip.service.IVistorThemeService#deleteByPrimaryKey(java.lang.String)
	 */
	@Override
	public int deleteByPrimaryKey(String vistorThemeId) {
		if(vistorThemeId == null  ||  vistorThemeId.equals("")){
			logger.error("vistorThemeId不能为空");
			throw new NullPointerException("vistorThemeId不能为空");
		}
		int count = vistorThemeMapper.deleteByPrimaryKey(vistorThemeId);
		return count;
	}
	
	/**
	 * 更新.
	 * @see com.smarttrip.service.IVistorThemeService#updateByPrimaryKey(com.smarttrip.domain.VistorTheme)
	 */
	@Override
	public int updateByPrimaryKey(VistorTheme vistorTheme) {
		if(vistorTheme == null){
			logger.error("VistorTheme不能为null");
			throw new NullPointerException("VistorTheme不能为null");
		}
		int count = vistorThemeMapper.updateByPrimaryKey(vistorTheme);
		return count;
	}
	
	/**
	 * 查询.
	 * @see com.smarttrip.service.IVistorThemeService#selectByPrimaryKey(java.lang.String)
	 */
	@Override
	public VistorTheme selectByPrimaryKey(String vistorThemeId) {
		if(vistorThemeId == null  ||  vistorThemeId.equals("")){
			logger.error("vistorThemeId不能为空");
			throw new NullPointerException("vistorThemeId不能为空");
		}
		VistorTheme vistorTheme = vistorThemeMapper.selectByPrimaryKey(vistorThemeId);
		return vistorTheme;
	}
}
