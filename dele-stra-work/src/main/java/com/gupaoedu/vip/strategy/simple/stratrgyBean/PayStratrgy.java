package com.gupaoedu.vip.strategy.simple.stratrgyBean;

import java.util.HashMap;
import java.util.Map;


import com.gupaoedu.vip.strategy.simple.JDPay;
import com.gupaoedu.vip.strategy.simple.Payment;
import com.gupaoedu.vip.strategy.simple.UnionPay;
import com.gupaoedu.vip.strategy.simple.ZhiFuBaoPay;

public class PayStratrgy {

	private PayStratrgy() {}

	private static Map<String,Payment> map = new HashMap<String,Payment>();
	
	public static final String JD_PAY = "jdPay";
	public static final String UNION_PAY = "UnionPay";
	public static final String ZHIFUBAO_PAY = "ZhiFuBaoPay";
	public static final String DEFAULT_PAY = ZHIFUBAO_PAY;
	
	static{
		map.put(JD_PAY, new JDPay());
		map.put(UNION_PAY, new UnionPay());
		map.put(ZHIFUBAO_PAY, new ZhiFuBaoPay());
	}
	
	public static Payment pay(String payKey){
		if(map.containsKey(payKey)){
			return map.get(payKey);
		}
		return map.get(DEFAULT_PAY);
	}
}
