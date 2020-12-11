package com.kgc.oop.designpatterns.Factory_mode.factory_method;

/**
 * @author：杨涛
 * Benz 工厂
 */
public class CreateBenz implements CreateCarFactory{
    @Override
    public Car createCars() {
        return new Benz();
    }
}
