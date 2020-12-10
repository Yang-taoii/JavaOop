package com.kgc.oop.design_patterns.Singleton_mode;

/**
 * @author：杨涛
 * Double Check Lock 写法
 * 保证线程安全
 */
public class Singleton3 {
    private static volatile Singleton3 INSTANCE;

    public Singleton3() {
    }

    public static Singleton3 getInstance(){
        if (INSTANCE==null){
            synchronized (Singleton3.class){
                //双重检查
                if (INSTANCE==null){
                    INSTANCE = new Singleton3();
                }
            }
        }
        return INSTANCE;
    }

}
