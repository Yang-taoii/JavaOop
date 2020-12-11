package com.kgc.oop.designpatterns.Factory_mode.abstract_factory;

/**
 * @author：杨涛
 */
public class BlackCat implements ICat{
    @Override
    public void eat() {
        System.out.println("BlackCat--->void eat()");
    }
}
