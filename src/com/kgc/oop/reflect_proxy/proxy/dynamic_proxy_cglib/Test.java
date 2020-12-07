package com.kgc.oop.reflect_proxy.proxy.dynamic_proxy_cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author：杨涛
 *      动态代理 cglib 测试类
 */
public class Test {
    public static void main(String[] args) {

        CglibProxy cglibProxy = new CglibProxy();       //创建cglib代理类对象
        Enhancer enhancer = new Enhancer();             //创建字节码解析器，生产无接口状态代理类的子类
        enhancer.setSuperclass(RealStar.class);         //设置被代理对象的父类
        enhancer.setCallback(cglibProxy);               //设置回调接口
        RealStar proxy = (RealStar) enhancer.create();  //创建代理类对象
        proxy.action();

    }
}
