package com.kgc.oop.reflect_proxy.reflect;

/**
 * @author：杨涛
 *      反射  测试实体类
 */
public class Person {

    public String name = "张三";
    private int age;
    protected String address;
    String sex;

    private void show(){ //私有方法
        System.out.println("这是一个私有方法");
    }
    public void show1(){
        System.out.println("这是一个公共方法");
    }

    public Person() {}

    public Person(String name, int age, String address, String sex) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                '}';
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
