package com.kgc.oop.designpatterns.bridge;

/**
 * @author：杨涛
 */
public class Trouser extends AbstractClothing{
    /**
     * 衣服是用来给人穿的
     * @param person 人类对象
     **/
    @Override
    public void personDressCloth(AbstractPerson person) {
        System.out.println(person.getType()+"穿裤子");
    }
}
