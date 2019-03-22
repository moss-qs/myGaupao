package com.gupaoedu.vip.strategy.simple;

public class ZhiFuBaoPay extends Payment {

	@Override
	public String getName() {
		return "支付宝支付";
	}

	@Override
	protected double queryBalance(String uid) {
		return 1000;
	}

}
