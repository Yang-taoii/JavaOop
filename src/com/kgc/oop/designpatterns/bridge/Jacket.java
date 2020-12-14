package com.kgc.oop.designpatterns.bridge;

/**
 * @author：杨涛
 */
public class Jacket extends AbstractClothing {

    @Override
    public void personDressCloth(AbstractPerson person) {
        System.out.println(person.getType()+"穿夹克");
    }
}
