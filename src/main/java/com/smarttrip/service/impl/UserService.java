/**
 * Date:2015年7月30日下午11:20:52
 * Copyright (c) 2015, songjiesdnu@163.com All Rights Reserved.
 */
package com.smarttrip.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smarttrip.dao.UserMapper;
import com.smarttrip.domain.User;
import com.smarttrip.service.IUserService;
import com.smarttrip.util.MD5Utils;
import com.smarttrip.util.UUIDUtils;

/**
 * IUserService的实现类. <br/>
 * date: 2015年7月30日 下午11:18:04 <br/>
 *
 * @author songjiesdnu@163.com
 */
@Service("userService")
@Transactional
public class UserService implements IUserService {
	private Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 查询.
	 * @see com.smarttrip.service.IUserService#selectByPrimaryKey(java.lang.String)
	 */
	@Override
	public User selectByPrimaryKey(String userId) {
		if(userId == null  ||  userId.equals("")){
			logger.error("userId不能为空");
			throw new NullPointerException("userId不能为空");
		}
		User user = userMapper.selectByPrimaryKey(userId);
		return user;
	}

	/**
	 * 删除.
	 * @see com.smarttrip.service.IUserService#deleteByPrimaryKey(java.lang.String)
	 */
	@Override
	public int deleteByPrimaryKey(String userId) {
		if(userId == null  ||  userId.equals("")){
			logger.error("userId不能为空");
			throw new NullPointerException("userId不能为空");
		}
		int count = userMapper.deleteByPrimaryKey(userId);
		return count;
	}

	/**
	 * 插入.
	 * @see com.smarttrip.service.IUserService#insert(com.smarttrip.domain.User)
	 */
	@Override
	public int insert(User user) {
		if(user == null){
			logger.error("User不能为null");
			throw new NullPointerException("User不能为null");
		}
		int result = userMapper.insert(user);
		return result;
	}

	/**
	 * 更新.
	 * @see com.smarttrip.service.IUserService#updateByPrimaryKey(com.smarttrip.domain.User)
	 */
	@Override
	public int updateByPrimaryKey(User user) {
		if(user == null){
			logger.error("User不能为null");
			throw new NullPointerException("User不能为null");
		}
		int count = userMapper.updateByPrimaryKey(user);
		return count;
	}


	/**
	 * 检查用户密码是否正确
	 * */
	@Override
	public boolean checkPwd(User user,String pwd) {
		if (user == null){
			logger.debug("用户不存在");
			return false;
		}
		if (pwd == null || pwd==""){
			logger.debug("密码为空");
		}

		String salt = user.getSalt();
		String password = MD5Utils.encrypt(pwd + salt);
		
		if (user.getPassword().equals(password))return true;
		else return false;
	}

	@Override
	public List<User> selectByPage(RowBounds rb) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User selectByMobile(String mobile) {
		// TODO Auto-generated method stub
		return null;
	}
}