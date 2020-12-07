package com.kgc.oop.reflect_proxy.proxy.static_proxy;

/**
 * @author：杨涛
 *      静态代理模式  测试类
 */
public class Test {
    public static void main(String[] args) {
        Star realStar = new RealStar();
        Star proxyStar = new Proxy(realStar);
        proxyStar.action();
    }
}
