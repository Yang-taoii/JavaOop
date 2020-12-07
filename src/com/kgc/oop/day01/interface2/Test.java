package com.kgc.oop.day01.interface2;

public class Test {
    public static void main(String[] args) {
        Usb computer = new UsbComputer();
        Usb e = new UsbElectricLight();
        computer.start();
        computer.stop();
        e.stop();
        e.start();
    }
}
