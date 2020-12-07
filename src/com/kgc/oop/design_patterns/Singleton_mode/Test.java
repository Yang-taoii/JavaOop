package com.kgc.oop.design_patterns.Singleton_mode;

/**
 * @author：杨涛
 * 单例模式
 *      测试类
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("************懒汉模式*****************");
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton1);
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton2);

        System.out.println("*************饿汉模式******************");
        Singleton1 singleton11 = Singleton1.getSingleton1();
        Singleton1 singleton12 = Singleton1.getSingleton1();
        System.out.println(singleton11);
        System.out.println(singleton12);

        System.out.println("*************静态内部类******************");
        Singleton2 singleton21 = Singleton2.getInstance();
        Singleton2 singleton22 = Singleton2.getInstance();
        System.out.println(singleton21);
        System.out.println(singleton22);

    }

}
