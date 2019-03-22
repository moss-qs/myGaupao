package com.gupaoedu.vip.strategy.simple;

public abstract class Payment {
	
	//支付类型
	public abstract String getName();
	//查询余额
	protected abstract double queryBalance(String uid);
	//扣款
	public void pay(String uid,double amount){
		if(queryBalance(uid) < amount){
			System.out.println("余额不足，扣款失败!");
			return ;
		}
		System.out.println("支付成功！");
	}
}
