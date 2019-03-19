package com.gupaoedu.proxy.work.test;

import java.lang.reflect.Method;

import com.gupaoedu.proxy.work.People;
import com.gupaoedu.proxy.work.bean.DIdiDaChe;
import com.gupaoedu.proxy.work.bean.XiaoMing;

public class DidiTest {

	public static void main(String[] args) throws Exception {
		DIdiDaChe DIdiDaChe = new DIdiDaChe();
		People xiaoming = (People) DIdiDaChe.getInstance(new XiaoMing());
		xiaoming.daChe();
		
		Object obj = DIdiDaChe.getInstance(new XiaoMing());
		Method method = obj.getClass().getMethod("daChe",null);
        method.invoke(obj);
	}
}
