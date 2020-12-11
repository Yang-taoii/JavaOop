package com.kgc.oop.designpatterns.observe_mode;

/**
 * @author：杨涛
 * 长沙市民 被长沙警方观察的对象
 */
public class ChangShaCitizen extends Citizen{

    public ChangShaCitizen(Policeman policeman){
        this.setPolicemen();
        this.register(policeman);
    }



    @Override
    void sendMessage(String help) {
        setHelp(help); //只要被观察者对象的状态发生改变，观察者应做出适当的回应
        for (Policeman pol : list_policemen) {
            //通知长沙警察行动
            pol.action(this);
        }
    }
}
