package com.kgc.oop.day01.innerclass;

public class Test {
    public static void main(String[] args) {

        OutClass outClass = new OutClass();

        outClass.use(new Usb() {
            @Override
            public void start() {
                System.out.println("匿名内部类--> 重写启动方法");
            }

            @Override
            public void stop() {
                System.out.println("匿名内部类--> 重写停止方法");
            }
        });

    }
}
