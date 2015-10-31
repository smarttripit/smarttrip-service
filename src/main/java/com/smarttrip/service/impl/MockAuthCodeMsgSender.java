package com.smarttrip.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.smarttrip.platform.authcode.msgsender.MsgSender;

public class MockAuthCodeMsgSender implements MsgSender {
	private static Logger logger = LoggerFactory.getLogger(MockAuthCodeMsgSender.class);
	private String smsSign;
	//短信网的账号
	private String pwd;
	private String name;
	
	@Override
	public void sendMsg(String mobileNo, String code) {
		logger.info("mobileNo:" + mobileNo + ";code:" + code);
		
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSmsSign() {
		return smsSign;
	}

	public void setSmsSign(String smsSign) {
		this.smsSign = smsSign;
	}

}
