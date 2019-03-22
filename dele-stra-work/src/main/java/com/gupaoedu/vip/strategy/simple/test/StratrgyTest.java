package com.gupaoedu.vip.strategy.simple.test;

import com.gupaoedu.vip.strategy.simple.order.Order;

public class StratrgyTest {

	public static void main(String[] args) {
		Order order = new Order("1","34523342355456564",100);
		order.pay();
	}
}
