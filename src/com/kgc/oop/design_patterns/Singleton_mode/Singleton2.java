package com.kgc.oop.design_patterns.Singleton_mode;

/**
 * @author：杨涛
 * 单例模式
 *      静态内部类
 */
@SuppressWarnings("all")
public class Singleton2 {

    private static class Singleton_static{
        private static final Singleton2 singleton2=new Singleton2();
    }

    public Singleton2() {}

    public static Singleton2 getInstance(){
        return Singleton_static.singleton2;
    }
}
