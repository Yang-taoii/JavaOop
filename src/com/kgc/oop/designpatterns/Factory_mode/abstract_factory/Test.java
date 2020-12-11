package com.kgc.oop.designpatterns.Factory_mode.abstract_factory;

/**
 * @author：杨涛
 */
public class Test {

    public static void main(String[] args) {
        IAanimalFactory iAanimalFactory = new BlackAnimalFactory();
        ICat blackCat = iAanimalFactory.createCat(); //黑色动物工厂生产黑猫
        IDog backDog = iAanimalFactory.createDog();
        blackCat.eat();
        backDog.eat();


        IAanimalFactory iAanimalFactory1 = new WhiteAnimalFactory();
        IDog whiteDog = iAanimalFactory1.createDog(); //白色动物工厂生产白色狗
        whiteDog.eat();




    }
}
