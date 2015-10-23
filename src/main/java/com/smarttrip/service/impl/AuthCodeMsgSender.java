package com.smarttrip.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.smarttrip.platform.authcode.msgsender.MsgSender;

public class AuthCodeMsgSender implements MsgSender {
	private static Logger logger = LoggerFactory.getLogger(AuthCodeMsgSender.class);

	private static String SIGN = "香油网络";
	
	@Override
	public void sendMsg(String mobileNo, String code) {
		logger.debug("mobileNo:" + mobileNo + ";code:" + code);
		try{
			//发送内容
			String content = "验证码"+code+"，您正在注册香油账号，请尽快验证，请不要向任何人泄露。"; 
			String sign = SIGN;
			
			// 创建StringBuffer对象用来操作字符串
			StringBuffer sb = new StringBuffer("http://web.duanxinwang.cc/asmx/smsservice.aspx?");

			// 向StringBuffer追加用户名
			sb.append("name=dxwjasonzhang");

			// 向StringBuffer追加密码（登陆网页版，在管理中心--基本资料--接口密码，是28位的）
			sb.append("&pwd=27E59B382F6E619C7D546C0F38E8");

			// 向StringBuffer追加手机号码
			sb.append("&mobile=" + mobileNo);

			// 向StringBuffer追加消息内容转URL标准码
			sb.append("&content="+URLEncoder.encode(content,"UTF-8"));
			
			//追加发送时间，可为空，为空为及时发送
			sb.append("&stime=");
			
			//加签名
			sb.append("&sign="+URLEncoder.encode(sign,"UTF-8"));
			
			//type为固定值pt  extno为扩展码，必须为数字 可为空
			sb.append("&type=pt&extno=");
			// 创建url对象
			//String temp = new String(sb.toString().getBytes("GBK"),"UTF-8");
			logger.debug("短信发送请求报文：" + sb.toString());
			URL url = new URL(sb.toString());

			// 打开url连接
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			// 设置url请求方式 ‘get’ 或者 ‘post’
			connection.setRequestMethod("POST");

			// 发送
			InputStream is =url.openStream();

			//转换返回值
			String returnStr = this.convertStreamToString(is);
			
			// 返回结果为‘0，20140009090990,1，提交成功’ 发送成功   具体见说明文档
			logger.debug("短信发送响应报文：" + returnStr);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 转换返回值类型为UTF-8格式.
	 * @param is
	 * @return
	 */
	public static String convertStreamToString(InputStream is) {    
        StringBuilder sb1 = new StringBuilder();    
        byte[] bytes = new byte[4096];  
        int size = 0;  
        
        try {    
        	while ((size = is.read(bytes)) > 0) {  
                String str = new String(bytes, 0, size, "UTF-8");  
                sb1.append(str);  
            }  
        } catch (IOException e) {    
            e.printStackTrace();    
        } finally {    
            try {    
                is.close();    
            } catch (IOException e) {    
               e.printStackTrace();    
            }    
        }    
        return sb1.toString();    
    }

}
