package com.gupaoedu.vip.delegate.simple;

import java.util.HashMap;
import java.util.Map;

import com.gupaoedu.vip.delegate.simple.bean.EmployeeA;
import com.gupaoedu.vip.delegate.simple.bean.EmployeeB;

public class Manager implements Employee {

	private Map<String,Employee> map = new HashMap<String,Employee>();
	
	public Manager() {
		map.put("后端", new EmployeeA());
		map.put("前端", new EmployeeB());
	}

	public void doWork(String work) {
		try {
			map.get(work).doWork(work);
		} catch (Exception e) {
			System.out.println("老板是你吗？");
		}
	}

}
