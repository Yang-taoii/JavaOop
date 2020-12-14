package com.kgc.oop.designpatterns.status;

/**
 * @author：杨涛
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.setWeather(new Sunny());
        System.out.println(context.weatherMessage());

        Context context1 = new Context();
        context1.setWeather(new Rain());
        System.out.println(context1.weatherMessage());
    }
}
