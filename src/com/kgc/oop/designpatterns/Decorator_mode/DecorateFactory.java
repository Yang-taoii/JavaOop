package com.kgc.oop.designpatterns.Decorator_mode;

/**
 * @author：杨涛
 * 汽车4s店负责改装 高R
 */
public class DecorateFactory implements Car{
    private Car car;

    public DecorateFactory() {
    }

    public DecorateFactory(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        car.run();
    }
}
