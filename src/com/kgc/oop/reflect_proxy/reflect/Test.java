package com.kgc.oop.reflect_proxy.reflect;

import java.lang.reflect.InvocationTargetException;

/**
 * @author：杨涛
 *      1.测试三种使用反射获得Person类的相关信息   Class.forName()、Person.class、getClass()
 */
@SuppressWarnings("all")
public class Test {
    public static void main(String[] args) {
        try {
            System.out.println("************使用 Class.forName()生成****************************");
            Class c = Class.forName("com.kgc.oop.reflect_proxy.reflect.Person");
            System.out.println("完整类名："+c.getName());
            System.out.println("简单类名："+c.getSimpleName());
            System.out.println("哈希code："+c.hashCode());

            System.out.println("************使用 Person.class生成****************************");
            Class c1 = Person.class;
            System.out.println("完整类名："+c1.getName());
            System.out.println("简单类名："+c1.getSimpleName());
            System.out.println("哈希code："+c1.hashCode());

            System.out.println("************使用 getClass()生成****************************");
            Person person = new Person();
            Class c2 = person.getClass();
            System.out.println("完整类名："+c2.getName());
            System.out.println("简单类名："+c2.getSimpleName());
            System.out.println("哈希code："+c2.hashCode());


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
