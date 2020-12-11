package com.kgc.oop.designpatterns.Decorator_mode;

/**
 * @author：杨涛
 */
public class Tail extends DecorateFactory{
    public Tail(Car car) {
        super(car);
    }

    public static void repack_Tail(){
        System.out.println("添加一个尾翼，原地起飞");
    }
    @Override
    public void run() {
        super.run();
        repack_Tail();
    }
}
