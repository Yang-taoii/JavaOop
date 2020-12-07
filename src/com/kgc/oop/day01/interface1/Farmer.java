package com.kgc.oop.day01.interface1;

import java.lang.reflect.InvocationTargetException;

/**
 * 简单工厂模式
 */
public class Farmer {

    public FarmProduce getFarmProduct(String className){
        FarmProduce fp = null;
        try {
            fp = (FarmProduce) Class.forName(className).getDeclaredConstructor().newInstance();//反射 生成商品对象
        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return fp;
    }

}
