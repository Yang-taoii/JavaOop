package com.kgc.oop.day01.exception;

public class MyException extends Exception{
    public	MyException() {
        super("异常信息：人妖",new Throwable("异常的原因是，性别不符"));
    }
}
