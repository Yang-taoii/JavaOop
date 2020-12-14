package com.kgc.oop.designpatterns.bridge;

/**
 * @author：杨涛
 */
public class Test {
    public static void main(String[] args) {
        AbstractPerson man = new Man();
        AbstractPerson lady = new Lady();

        AbstractClothing jacket = new Jacket();
        AbstractClothing trouser = new Trouser();

        jacket.personDressCloth(man);
        jacket.personDressCloth(lady);

        trouser.personDressCloth(man);
        trouser.personDressCloth(lady);
    }
}
