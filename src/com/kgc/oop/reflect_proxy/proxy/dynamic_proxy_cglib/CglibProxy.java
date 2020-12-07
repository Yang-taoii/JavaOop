package com.kgc.oop.reflect_proxy.proxy.dynamic_proxy_cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author：杨涛
 *      动态代理  cglib
 */
public class CglibProxy implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object obj=null;
        System.out.println("日志....");
        System.out.println("签合同....");
        obj = methodProxy.invokeSuper(o,objects);
        System.out.println("日志结束....");
        System.out.println("收钱....");
        return obj;
    }
}
