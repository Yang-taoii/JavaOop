package com.kgc.oop.designpatterns.bridge;


/**
 * @author：杨涛
 * 抽象衣服类
 */
public abstract class AbstractClothing {
    /**衣服是用来给人穿的**/
    public abstract void personDressCloth(AbstractPerson person);
}
