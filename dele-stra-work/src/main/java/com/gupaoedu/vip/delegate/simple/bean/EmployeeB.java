package com.gupaoedu.vip.delegate.simple.bean;

import com.gupaoedu.vip.delegate.simple.Employee;

public class EmployeeB implements Employee {

	public void doWork(String work) {
		System.out.println("我负责" + work);
	}

}
