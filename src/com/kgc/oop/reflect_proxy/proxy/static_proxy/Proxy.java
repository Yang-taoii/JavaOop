package com.kgc.oop.reflect_proxy.proxy.static_proxy;

/**
 * @author：杨涛
 * 静态代理模式  代理角色
 */

//代理角色
public class Proxy implements Star{

    private Star realStar;

    public Proxy(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public void meet() {
        System.out.println("Proxy -- void meet()");
    }

    @Override
    public void signContract() {
        System.out.println("Proxy -- void signContract()");
    }

    @Override
    public void action() {
        realStar.action();
    }

    @Override
    public void getMoney() {
        System.out.println("Proxy -- void getMoney()");
    }
}
