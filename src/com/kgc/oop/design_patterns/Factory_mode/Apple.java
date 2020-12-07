package com.kgc.oop.design_patterns.Factory_mode;

/**
 * @author：杨涛
 * 农产品
 *      苹果
 */
public class Apple implements FarmProduce{

    @Override
    public void canBeSell() {
        System.out.println("苹果卖钱");
    }
}
