package com.kgc.oop.designpatterns.observe_mode;

/**
 * @author：杨涛
 */
public class Test {
    public static void main(String[] args) {
        Policeman policeman = new ChangShaPoliceman();
        Citizen citizen = new ChangShaCitizen(policeman);

//      citizen.unRegister(policeman);
        citizen.sendMessage("abnormal");
        citizen.sendMessage("normal");
    }
}
