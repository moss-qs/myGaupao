package com.gupaoedu.proxy.work.bean;

import java.lang.reflect.Method;

import com.gupaoedu.proxy.work.People;
import com.gupaoedu.proxy.work.myproxy.YBClassLoader;
import com.gupaoedu.proxy.work.myproxy.YBInvocationHandler;
import com.gupaoedu.proxy.work.myproxy.YBProxy;

public class DIdiDaChe implements YBInvocationHandler{

	private People people;
	
	
	public Object getInstance(People people) {
		this.people = people;
        Class<?> clazz = people.getClass();
        return YBProxy.newProxyInstance(new YBClassLoader(),clazz.getInterfaces(),this);
	}


	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		before();
		Object invoke = method.invoke(people, args);
		after();
		return invoke;
	}


	private void after() {
		System.out.println("车已约好，请选择");
	}


	private void before() {
		System.out.println("滴滴打车为你服务");
		
	}


	
}
