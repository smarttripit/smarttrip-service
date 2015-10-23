package com.smarttrip.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smarttrip.dao.ThemeMapper;
import com.smarttrip.domain.Theme;
import com.smarttrip.service.IThemeService;

/**
 * IThemeService的实现类. <br/>
 * date: 2015年10月15日 10:19 <br/>
 *
 * @author 1361200381@qq.com
 */
@Service("themeService")
@Transactional
public class ThemeService implements IThemeService{
	
	private Logger logger = LoggerFactory.getLogger(ThemeService.class);
	@Autowired
	private ThemeMapper themeMapper;
	
	/**
	 * 插入.
	 * @see com.smarttrip.service.IThemeService#insert(com.smarttrip.domain.Theme)
	 */
	@Override
	public int insert(Theme theme) {
		if(theme == null){
			logger.error("theme不能为null");
			throw new NullPointerException("theme不能为null");
		}
		int result = themeMapper.insert(theme);
		return result;
	}
	
	/**
	 * 删除.
	 * @see com.smarttrip.service.IThemeService#deleteByPrimaryKey(java.lang.String)
	 */
	@Override
	public int deleteByPrimaryKey(String themeId) {
		if(themeId == null  ||  themeId.equals("")){
			logger.error("themeId不能为空");
			throw new NullPointerException("themeId不能为空");
		}
		int count = themeMapper.deleteByPrimaryKey(themeId);
		return count;
	}
	
	/**
	 * 更新.
	 * @see com.smarttrip.service.IThemeService#updateByPrimaryKey(com.smarttrip.domain.Theme)
	 */
	@Override
	public int updateByPrimaryKey(Theme theme) {
		if(theme == null){
			logger.error("theme不能为null");
			throw new NullPointerException("theme不能为null");
		}
		int count = themeMapper.updateByPrimaryKey(theme);
		return count;
	}
	
	/**
	 * 查询.
	 * @see com.smarttrip.service.IThemeService#selectByPrimaryKey(java.lang.String)
	 */
	@Override
	public Theme selectByPrimaryKey(String themeId) {
		if(themeId == null  ||  themeId.equals("")){
			logger.error("themeId不能为空");
			throw new NullPointerException("themeId不能为空");
		}
		Theme Theme = themeMapper.selectByPrimaryKey(themeId);
		return Theme;
	}
	
	/**
	 * 查询
	 * @see com.smarttrip.service.IThemeService#selectAll()
	 * */
	@Override
	public List<Theme> selectAll(){
		return themeMapper.selectAll();
	}
	
	@Override
	public Theme selectByThemeName(String themeName) {
		if(themeName == null  ||  themeName.equals("")){
			logger.error("themeName不能为空");
			throw new NullPointerException("themeId不能为空");
		}
		Theme Theme = themeMapper.selectByPrimaryKey(themeName);
		return Theme;
	}
	
}
