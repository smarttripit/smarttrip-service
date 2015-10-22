/**
 * Date:2015年7月30日下午11:12:32
 * Copyright (c) 2015, songjiesdnu@163.com All Rights Reserved.
 */
package com.smarttrip.service.impl;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smarttrip.domain.UserProfile;
import com.smarttrip.service.IUserProfileService;

/**
 * Function: TODO ADD FUNCTION. <br/>
 * date: 2015年7月30日 下午11:12:32 <br/>
 *
 * @author songjiesdnu@163.com
 * @version 
 */
@Service("userProfileService")
@Transactional
public class UserProfileService implements IUserProfileService {

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see com.smarttrip.service.IUserProfileService#deleteByPrimaryKey(java.lang.String)
	 */
	@Override
	public int deleteByPrimaryKey(String id) {
		return 0;
	}

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see com.smarttrip.service.IUserProfileService#insert(com.smarttrip.domain.UserProfile)
	 */
	@Override
	public int insert(UserProfile record) {
		return 0;
	}

	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see com.smarttrip.service.IUserProfileService#selectByPrimaryKey(java.lang.String)
	 */
	@Override
	public UserProfile selectByPrimaryKey(String id) {
		return null;
	}


	/**
	 * TODO 简单描述该方法的实现功能（可选）.
	 * @see com.smarttrip.service.IUserProfileService#updateByPrimaryKey(com.smarttrip.domain.UserProfile)
	 */
	@Override
	public int updateByPrimaryKey(UserProfile record) {
		return 0;
	}

}

