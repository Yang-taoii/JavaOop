package com.kgc.oop.day01.overwrite;

public class Cat extends Pet{
    String petName;
    String speakType;

    @Override
    public String getPetName() {
        return petName;
    }

    @Override
    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Override
    public void speakInfo() {
        System.out.println("喵喵喵");
    }
}
