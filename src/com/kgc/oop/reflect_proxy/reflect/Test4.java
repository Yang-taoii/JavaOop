package com.kgc.oop.reflect_proxy.reflect;

import java.lang.reflect.Array;
/**
 * @author：杨涛
 * 使用反射给数组赋值
 *  Array.newInstance(clazz, 4);
 *  Array.set(Object array,int index,Object value);
 */
public class Test4 {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("java.lang.Integer");
            Object arr = Array.newInstance(clazz, 4);
            Array.set(arr, 0, 120);
            Array.set(arr, 1, 121);
            Array.set(arr, 2, 122);
            Array.set(arr, 3, 123);
            System.out.println("数组中的第三个元素："+Array.get(arr, 2));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
