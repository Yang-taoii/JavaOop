package com.kgc.oop.designpatterns.adaptermode;

/**
 * @author：杨涛
 * 适配器模式 测试类
 */
public class Test {
    public static void main(String[] args) {
        TargetMyComputer target = new Adapt(new Adaptee_USB());
        target.workTapeC();
    }
}
