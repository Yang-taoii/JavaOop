package com.kgc.oop.day01.interface1;

public class Test {

    public static void main(String[] args) {
        Farmer farmer = new Farmer();
        FarmProduce fp = farmer.getFarmProduct("com.kgc.oop.day01.interface1.Apple");
        fp.sell();
        FarmProduce fp2 = farmer.getFarmProduct("com.kgc.oop.day01.interface1.Pig");
        fp2.sell();
    }
}
