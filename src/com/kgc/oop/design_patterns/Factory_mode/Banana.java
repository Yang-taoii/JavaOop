package com.kgc.oop.design_patterns.Factory_mode;

/**
 * @author：杨涛
 * 农产品
 *      香蕉
 */
public class Banana implements FarmProduce{
    @Override
    public void canBeSell() {
        System.out.println("香蕉卖钱");
    }
}
