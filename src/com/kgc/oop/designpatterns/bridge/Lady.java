package com.kgc.oop.designpatterns.bridge;

/**
 * @author：杨涛
 */
public class Lady extends AbstractPerson{

    public Lady() {
        setType("女士");
    }

    @Override
    public void dress() {
        AbstractClothing clothing = getClothing();
        clothing.personDressCloth(this);
    }
}
