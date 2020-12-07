package com.kgc.oop.day01.overwrite;

public class Dog extends Pet{
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
    public String getSpeakType() {
        return speakType;
    }

    @Override
    public void setSpeakType(String speakType) {
        this.speakType = speakType;
    }

    @Override
    public void speakInfo() {
        System.out.println("汪汪汪");
    }
}
