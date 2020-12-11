package com.kgc.oop.designpatterns.Factory_mode.factory_method;

/**
 * @author：杨涛
 * 宝马汽车工厂
 */
public class CreateBMW implements CreateCarFactory{
    @Override
    public Car createCars() {
        return new BMW();
    }
}
