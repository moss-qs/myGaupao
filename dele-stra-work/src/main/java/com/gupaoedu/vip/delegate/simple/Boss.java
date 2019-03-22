package com.gupaoedu.vip.delegate.simple;

/**
 * 老板委派项目经理做任务
 * @author yangbo
 *
 */
public class Boss {

	public void doWork(String work, Manager manager){
		manager.doWork(work);
	}
}
