package com.kgc.oop.designpatterns.Factory_mode.abstract_factory;

/**
 * @author：杨涛
 * 黑色动物生产工厂
 *      生产黑色的猫、狗
 */
public class BlackAnimalFactory implements IAanimalFactory{
    @Override
    public ICat createCat() {
        return new BlackCat();
    }

    @Override
    public IDog createDog() {
        return new BlackDog();
    }
}
