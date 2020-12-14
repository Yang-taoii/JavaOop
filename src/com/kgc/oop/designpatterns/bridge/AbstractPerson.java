package com.kgc.oop.designpatterns.bridge;

/**
 * @author：杨涛
 * 抽象人类
 */
public abstract class AbstractPerson {

    private AbstractClothing clothing;
    private String type;

    public AbstractClothing getClothing() {
        return clothing;
    }

    public void setClothing(AbstractClothing clothing) {
        this.clothing = clothing;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**人穿衣服**/
    public abstract void dress();
}
