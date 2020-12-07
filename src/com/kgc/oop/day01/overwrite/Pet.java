package com.kgc.oop.day01.overwrite;

public class Pet {
    public  void speakInfo(){
        System.out.println("父类");
    };
    String petName;
    String speakType;

    public Pet() {
    }
    public Pet(String petName,String speakType) {
        this.petName = petName;
        this.speakType = speakType;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getSpeakType() {
        return speakType;
    }

    public void setSpeakType(String speakType) {
        this.speakType = speakType;
    }
}
