package com.smarttrip.service.impl;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.smarttrip.service.IPhoneAuthCodeService;

@RunWith(SpringJUnit4ClassRunner.class)//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml", "classpath:spring-authcode.xml"})
public class PhoneAuthCodeServiceTest {
	
	@Autowired
	IPhoneAuthCodeService phoneAuthCodeService;

	@Test
	public void testSend() {
		String mobileNo = "13120331797";
		Map<String, String> rtn = phoneAuthCodeService.send(mobileNo);
		assertEquals(rtn.get("result"), "success");
	}
	
	@Test
	public void testVerify_wrong(){
		String mobileNo = "13120331797";
		phoneAuthCodeService.send(mobileNo);
		String userCode = "123456";
		Map<String, String> result = phoneAuthCodeService.verify(mobileNo, userCode);
		assertEquals(result.get("result"), "wrong");
	}
}
