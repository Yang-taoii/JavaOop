package com.kgc.oop.designpatterns.Decorator_mode;

/**
 * @author：杨涛
 */
public class Engine extends DecorateFactory{

    public Engine(Car car) {
        super(car);
    }
    public static void repack_Engine(){
        System.out.println("疯狂给发动机刷程序");
    }


    @Override
    public void run() {
        super.run();
        repack_Engine();
    }
}
