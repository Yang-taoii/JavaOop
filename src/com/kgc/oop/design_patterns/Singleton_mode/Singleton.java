package com.kgc.oop.design_patterns.Singleton_mode;

/**
 * @author：杨涛
 *  单例模式
 *      懒汉式
 *          速度慢
 */
@SuppressWarnings("all")
public class Singleton {

    private Singleton(){}

    private static Singleton singleton = null;

    public synchronized static Singleton getSingleton(){
        if (singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
