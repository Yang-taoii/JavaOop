package com.kgc.oop.designpatterns.Decorator_mode;

/**
 * @author：杨涛
 * 装饰者模式
 *      改装轮毂、轮胎
 */
public class Wheel_Hub extends DecorateFactory{

    public Wheel_Hub(Car car) {
        super(car);
    }

    public static void repack_Wheel(){
        System.out.println("装上4个锻造轮毂和4条米其林轮胎，起飞，看谁蹦谁");
    }


    @Override
    public void run() {
        super.run();
        repack_Wheel();
    }
}
