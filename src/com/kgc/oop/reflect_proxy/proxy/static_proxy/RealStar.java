package com.kgc.oop.reflect_proxy.proxy.static_proxy;

/**
 * @author：杨涛
 * 静态代理模式  真实角色
 */

//真实角色
public class RealStar implements Star{

    @Override
    public void meet() {
        System.out.println("RealStar -- void meet()");
    }

    @Override
    public void signContract() {
        System.out.println("RealStar -- void signContract()");
    }

    @Override
    public void action() {
        System.out.println("RealStar -- void action()");
    }

    @Override
    public void getMoney() {
        System.out.println("RealStar -- void getMoney()");
    }
}
