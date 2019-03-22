package com.gupaoedu.vip.strategy.simple.order;

import com.gupaoedu.vip.strategy.simple.Payment;
import com.gupaoedu.vip.strategy.simple.stratrgyBean.PayStratrgy;

public class Order {

	private String uid;
	private String orderId;
	private double amount;
	
	public Order(String uid, String orderId, double amount) {
		super();
		this.uid = uid;
		this.orderId = orderId;
		this.amount = amount;
	}
	
	public void pay(){
		pay(PayStratrgy.DEFAULT_PAY);
	}

	private void pay(String key) {
		Payment pay = PayStratrgy.pay(key);
		System.out.println("欢迎使用" + pay.getName());
		pay.pay(uid, amount);
	}
}
