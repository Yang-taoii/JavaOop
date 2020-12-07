package com.kgc.oop.day01.overwrite;

public class Test {
    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.speakInfo();

        Pet dog = new Dog();
        Pet cat = new Cat();

        dog.speakInfo();
        cat.speakInfo();
    }
}
