package com.kgc.oop.day01.exception;

public class Test {
    public static void main(String[] args) throws MyException {
        doMethod("人妖");
    }

    public static void doMethod(String sex) throws MyException {
        if(!"男".equals(sex) && !"女".equals(sex)) {
            throw new MyException();
        }
        System.out.println("正常");
    }
}
