package com.kgc.oop.xml.dom4j;

import java.util.Date;

/**
 * @author：杨涛
 */
public class Phone {
    private String brand;
    private String type;
    private String createTime;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public Phone(String brand, String type, String createTime) {
        this.brand = brand;
        this.type = type;
        this.createTime = createTime;
    }

    public Phone() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
