package com.kgc.oop.day01.interface2;

public class UsbElectricLight implements Usb{//usb灯
    @Override
    public void start() {
        System.out.println("启动");
    }

    @Override
    public void stop() {
        System.out.println("停止");
    }

}
