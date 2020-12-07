package com.kgc.oop.reflect_proxy.proxy.dynamic_proxy_jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author：杨涛
 *      动态代理模式
 *        InvocationHandler 实现类
 */
public class MyHandler implements InvocationHandler {

    private RealStar obj;//被代理的对象
    public MyHandler() {}
    public MyHandler(RealStar obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object=null;
        System.out.println("日志...开始了");
        System.out.println("事务...开始了");
        if (method.getName().equals("action")){
            System.out.println("这个是star接口的方法，加入真实性校验--开始");
            object = method.invoke(obj,args);
            System.out.println("这个是star接口的方法，加入真实性校验 --结束");
        }else if ("show".equals(method.getName())){
            object = method.invoke(obj,args);
        }
        System.out.println("事务...结束了");
        System.out.println("日志....结束了");
        return object;
    }

    public Object getProxy(){ //帮我们产生代理对象的方法
        //newProxyInstance参数 ： 类加载器 、被代理类实现的接口 、处理器自己
        return Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                                        new Class[]{Star.class},
                                            this);
    }

}
