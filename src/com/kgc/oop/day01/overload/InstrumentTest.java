package com.kgc.oop.day01.overload;

public class InstrumentTest {
    public static void testPlay(Piano piano){
        piano.play();
    }

    public static void testPlay(Violin violin){
        violin.play();
    }

    public static void main(String[] args) {
        InstrumentTest.testPlay(new Piano());
        InstrumentTest.testPlay(new Violin());

    }
}
