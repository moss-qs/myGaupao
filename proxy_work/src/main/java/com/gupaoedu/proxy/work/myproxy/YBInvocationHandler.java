package com.gupaoedu.proxy.work.myproxy;

import java.lang.reflect.Method;

/**
 * 
 * @author yangbo
 */
public interface YBInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
