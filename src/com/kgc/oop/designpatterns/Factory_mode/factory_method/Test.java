package com.kgc.oop.designpatterns.Factory_mode.factory_method;

/**
 * @author：杨涛
 * 工厂方法模式测试类
 */
public class Test {
    public static void main(String[] args) {
        CreateCarFactory ccf = new CreateBenz();
        CreateCarFactory ccf1 = new CreateBMW();
        CreateCarFactory ccf2 = new CreateOOOO();

        Car car = ccf.createCars();
        car.run();
        Car car1 = ccf1.createCars();
        car1.run();
        Car car2 = ccf2.createCars();
        car2.run();



    }
}
