package com.kgc.oop.designpatterns.Decorator_mode;

/**
 * @author：杨涛
 * 真实汽车类
 */
public class RealCar implements Car{

    @Override
    public void run() {
        System.out.println("新买了一辆高尔夫R");
    }
}
