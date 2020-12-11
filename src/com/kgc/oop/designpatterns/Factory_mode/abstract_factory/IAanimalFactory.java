package com.kgc.oop.designpatterns.Factory_mode.abstract_factory;

/**
 * 动物生产工厂
 */
public interface IAanimalFactory {
    ICat createCat();
    IDog createDog();
}
