package com.kgc.oop.designpatterns.Factory_mode.abstract_factory;

/**
 * @author：杨涛
 * 白色动物生产工厂
 *      生产白色的猫、狗
 */
public class WhiteAnimalFactory implements IAanimalFactory{
    @Override
    public ICat createCat() {
        return new WhiteCat();
    }

    @Override
    public IDog createDog() {
        return new WhiteDog();
    }
}
