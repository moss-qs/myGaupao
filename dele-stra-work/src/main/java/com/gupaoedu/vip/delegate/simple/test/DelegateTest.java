package com.gupaoedu.vip.delegate.simple.test;

import com.gupaoedu.vip.delegate.simple.Boss;
import com.gupaoedu.vip.delegate.simple.Manager;

public class DelegateTest {

	public static void main(String[] args) {
		new Boss().doWork("后端", new Manager());
	}
}
