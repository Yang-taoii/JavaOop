package com.kgc.oop.io.byte_stream;

import java.io.Serializable;

/**
 * @author：杨涛
 * ObjectInputStream_1
 *      用户类
 */
public class User implements Serializable {
    private String name;
    private int age;
    /**是否婚配**/
    private boolean isMarriage;
    /**工资**/
    private double wage;

    public User(String name, int age, boolean isMarriage, double wage) {
        this.name = name;
        this.age = age;
        this.isMarriage = isMarriage;
        this.wage = wage;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarriage() {
        return isMarriage;
    }

    public void setMarriage(boolean marriage) {
        isMarriage = marriage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMarriage=" + isMarriage +
                ", wage=" + wage +
                '}';
    }


}
