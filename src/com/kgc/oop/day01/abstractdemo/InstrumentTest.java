package com.kgc.oop.day01.abstractdemo;

public class InstrumentTest {
    public static void testPlay(Instrument in){
        in.play();
    }

    public static void main(String[] args) {
        Instrument piano = new Piano();
        Instrument violin = new Violin();

        InstrumentTest.testPlay(piano);
        InstrumentTest.testPlay(violin);
    }
}
