package com.kgc.oop.design_patterns.Singleton_mode;

/**
 * @author：杨涛
 * 单例模式
 *      饿汉式
 *          速度快 但是占内存
 */
@SuppressWarnings("all")
public class Singleton1 {

    private Singleton1(){}
    private static final Singleton1 singleton1 = new Singleton1();

    public static Singleton1 getSingleton1() {
        return singleton1;
    }

}
