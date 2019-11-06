package me.zhengjie.modules.yueba.utils.sms;

import me.zhengjie.modules.monitor.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;

public class XUSmsUtils {

	private static String sms_sign = "【嗨用呗】";

	/**
	 * @param phone
	 * @param sign
	 * @return 发送验证码
	 */
	public static String getSms(String phone, String sign,RedisService redisService) {
		try {
			SmsUserNameUtils sms = new SmsUserNameUtils(sign);
			String code = mRandom(1000, 9999) + "";
			String text = "亲爱的用户，您的验证码是" + code + "，有效时间为10分钟，请尽快验证";
			String doSendsms = new Post(sms.getUserName(), sms.getPassword()).doSendsms(phone, text);
			if ("0".equals(doSendsms)) {
				// 存储验证码
				redisService.saveCodeByTime(phone,code,1l);
			}
			return doSendsms;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "1";
	}

	/**
	 * @param phone
	 * @param sign
	 * @param text
	 * @return 发送文本
	 */
	public static String getSms(String phone, String sign, String text) {
		try {
			SmsUserNameUtils sms = new SmsUserNameUtils(sms_sign);
			String doSendsms = new Post(sms.getUserName(), sms.getPassword()).doSendsms(phone, text);
			return doSendsms;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "1";
	}

	/**
	 * a 到b 之间的随机数
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int mRandom(int a, int b) {
		b = b + 1;
		int c = 0;
		Random r = new Random();
		if (a == b) {
			c = a;
		} else if (a > b) {
			c = b + r.nextInt(a - b);
		} else {
			c = a + r.nextInt(b - a);
		}
		return c;
	}
	
	public static void main(String[] args) {
		String sendCode = XUSmsUtils.getSms("18222390125", "【嗨用呗】", SmsTextUtils.pay2.getText());
		System.out.println("VIP融资咨询服务短信     sendCode={}"+sendCode);
	}
}
