package com.kgc.oop.designpatterns.Decorator_mode;

/**
 * @author：杨涛
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("新车到手。。。。。。");
        Car car = new RealCar();
        System.out.println("开始改装。。。。。。");
        Engine car_1 = new Engine(car);
        Wheel_Hub car_11 = new Wheel_Hub(car_1);
        Tail car_111 = new Tail(car_11);
        car_111.run();
    }
}
