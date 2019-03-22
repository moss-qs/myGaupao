package com.gupaoedu.vip.strategy.simple;

public class UnionPay extends Payment {

	@Override
	public String getName() {
		return "银联支付";
	}

	@Override
	protected double queryBalance(String uid) {
		return 400;
	}

}
