package com.kgc.oop.day01.interface2;

public class UsbComputer implements Usb{
    @Override
    public void start() {
        System.out.println("启动电脑");
    }

    @Override
    public void stop() {
        System.out.println("关闭电脑");
    }
}
