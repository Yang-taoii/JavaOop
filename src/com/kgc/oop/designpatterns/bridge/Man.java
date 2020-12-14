package com.kgc.oop.designpatterns.bridge;

/**
 * @author：杨涛
 */
public class Man extends AbstractPerson{

    public Man() {
        setType("男人");
    }

    @Override
    public void dress() {
       AbstractClothing clothing = getClothing();
       clothing.personDressCloth(this);
    }
}
