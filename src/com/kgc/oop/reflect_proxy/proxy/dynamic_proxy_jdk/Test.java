package com.kgc.oop.reflect_proxy.proxy.dynamic_proxy_jdk;

/**
 * @author：杨涛
 *      动态代理   JDK
 *          测试类
 */
public class Test {
    public static void main(String[] args) {

        //System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        RealStar realStar = new RealStar();
        MyHandler mh = new MyHandler(realStar);//创建处理器对象
        Star proxy = (Star) mh.getProxy();
        proxy.action();
    }
}
