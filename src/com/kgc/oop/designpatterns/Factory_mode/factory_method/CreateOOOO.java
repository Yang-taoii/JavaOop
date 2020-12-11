package com.kgc.oop.designpatterns.Factory_mode.factory_method;

/**
 * @author：杨涛
 * 奥迪汽车工厂
 */
public class CreateOOOO implements CreateCarFactory{
    @Override
    public Car createCars() {
        return new OOOO();
    }
}
