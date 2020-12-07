package com.kgc.oop.day01.interface1;

public class Pig implements FarmProduce{

    @Override
    public void sell() {
        System.out.println("猪肉卖钱");
    }
}
