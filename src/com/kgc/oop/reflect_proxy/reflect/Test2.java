package com.kgc.oop.reflect_proxy.reflect;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author：杨涛
 * 使用反射获取类中信息     属性  方法  构造函数
 */
@SuppressWarnings("all")
public class Test2 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.kgc.oop.reflect_proxy.reflect.Person");
            System.out.println("*********************获取基本信息***********************");
            System.out.println(c.getName());
            System.out.println(c.getSimpleName());

            System.out.println();
            System.out.println("**********c.getFields()***********获取全部公共属性*******************");
            for (Field field:c.getFields()) {
                System.out.println("Person类的公共属性："+field);
            }

            System.out.println();
            System.out.println("**************c.getDeclaredFields()*******获取全部属性*******************");
            for (Field field:c.getDeclaredFields()){
                System.out.println("Person类的全部属性（包括私有、受保护、默认）："+field);
            }

            System.out.println();
            System.out.println("**************c.getDeclaredMethods()*******获取全部方法（不包括父类中的）*******************");
            for (Method method:c.getDeclaredMethods()){
                System.out.println("Person类的全部方法（包括私有、受保护、默认）："+method);
            }

            System.out.println();
            System.out.println("**************c.getMethods()*******获取全部公共方法（包括父类中的）*******************");
            for (Method method:c.getMethods()){
                System.out.println("Person类的全部公共方法（包括父类中的）："+method);
            }

            System.out.println("*****************获取构造方法**************************");
            Constructor[] constructors = c.getConstructors();
            for (Constructor constructor : constructors) {
                System.err.println("constructor:"+constructor);
            }



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
