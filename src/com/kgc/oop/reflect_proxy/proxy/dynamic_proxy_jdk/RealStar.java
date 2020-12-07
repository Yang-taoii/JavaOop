package com.kgc.oop.reflect_proxy.proxy.dynamic_proxy_jdk;

/**
 * @author：杨涛
 */
public class RealStar implements Star {
    public RealStar() {}

    @Override
    public void meet() {
        System.out.println("RealStar---void meet()");
    }

    @Override
    public void signContracts() {
        System.out.println("RealStar---void signContracts()");
    }

    @Override
    public void action() {
        System.out.println("RealStar---void action()");
    }

    @Override
    public void getMoney() {
        System.out.println("RealStar---void getMoney()");
    }
}
