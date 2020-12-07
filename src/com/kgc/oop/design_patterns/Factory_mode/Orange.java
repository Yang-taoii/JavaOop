package com.kgc.oop.design_patterns.Factory_mode;

/**
 * @author：杨涛
 *
 */
public class Orange implements FarmProduce{
    @Override
    public void canBeSell() {
        System.out.println("橙子卖钱");
    }
}
