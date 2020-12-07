package com.kgc.oop.design_patterns.Factory_mode;

import java.lang.reflect.InvocationTargetException;

/**
 * @author：杨涛
 * 农夫类
 *    生产农产品并卖钱
 *      使用反射实现简单工厂模式
 */
public class Farmer {

    public FarmProduce getFameProduct(String className){ //使用反射实现简单工厂模式
        FarmProduce farmProduce = null;
        try {
            farmProduce =(FarmProduce) Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return farmProduce;
    }

}
