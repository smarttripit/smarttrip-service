package com.smarttrip.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smarttrip.platform.authcode.domain.AuthCodeSendResult;
import com.smarttrip.platform.authcode.domain.AuthCodeVerifyResult;
import com.smarttrip.platform.authcode.handler.AuthCodeHandler;
import com.smarttrip.service.IPhoneAuthCodeService;

@Service("phoneAuthCodeService")
public class PhoneAuthCodeService implements IPhoneAuthCodeService{
	private static Logger logger = LoggerFactory.getLogger(PhoneAuthCodeService.class);
	@Autowired
	AuthCodeHandler authCodeHandler;
	
	@Override
	public Map<String, String> send(String mobileNo) {
		AuthCodeSendResult authCodeSendResult = authCodeHandler.send(mobileNo);
		Map<String, String> rtn = new HashMap<String, String>();
		rtn.put("result", authCodeSendResult.getResult());
		rtn.put("sendId", authCodeSendResult.getSendId());
		rtn.put("tipCode", authCodeSendResult.getTipCode());
		rtn.put("tipMsg",authCodeSendResult.getTipMsg());
		return rtn;
	}

	@Override
	public Map<String, String> verify(String mobileNo, String userCode) {
		logger.debug("mobileNo:" + mobileNo + ";userCode:" + userCode);
		AuthCodeVerifyResult authCodeVerifyResult = authCodeHandler.verify(mobileNo, userCode);
		String result = authCodeVerifyResult.getResult();
		String msg = authCodeVerifyResult.getMsg();
		Map<String, String> rtn = new HashMap<String, String>();
		rtn.put("result", result);
		rtn.put("msg", msg);
		return rtn;
	}

}
