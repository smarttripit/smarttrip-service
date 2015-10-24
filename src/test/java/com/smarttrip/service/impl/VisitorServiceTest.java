package com.smarttrip.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.smarttrip.service.IVisitorService;

@RunWith(SpringJUnit4ClassRunner.class)//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml", "classpath:spring-authcode.xml"})
public class VisitorServiceTest {
	
	@Autowired
	IVisitorService visitorService;

	@Test
	public void test_selectByMobileNo() {
		String mobileNo = "15201123847";
		visitorService.selectByMobileNo(mobileNo);
	}

}
