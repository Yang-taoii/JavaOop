package com.kgc.oop.reflect_proxy.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author：杨涛
 * 使用反射生成Person类的对象
 * 使用构造函数生成Person类的对象
 * 使用该类的私有、公共方法
 */
public class Test3 {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("com.kgc.oop.reflect_proxy.reflect.Person");
            //Person person = (Person) c.getConstructor().newInstance();
           // System.out.println(person.toString());

            System.out.println();
            Constructor<?> constructor =  c.getDeclaredConstructor(String.class,int.class,String.class,String.class);
            Person person1 = (Person) constructor.newInstance("张三",1,"cs","男");
            System.out.println(person1.toString());

            System.out.println();
            System.out.println("***********使用对象调用方法  反射获取方法 执行*********************");
            Person person2 = (Person) c.getConstructor().newInstance();
            Method method = c.getMethod("show1"); //执行Person类的公共方法
            method.invoke(person2,null);

            System.out.println();
            System.out.println("*************使用发射执行Person类的私有方法**********************");
            Method method1 = c.getDeclaredMethod("show");
            method1.setAccessible(true);     //安全检查 会报错 --在执行之前，放开安全检查
            method1.invoke(person2,null);

        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }

}
