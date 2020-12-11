package com.kgc.oop.designpatterns.observe_mode;


import java.util.ArrayList;
import java.util.List;

/**
 * @author：杨涛
 * 观察者模式 市民类 被观察对象
 *  Subject
 */
public abstract class Citizen {
    List<Policeman> list_policemen;//准备容器，装观察者

    String help = "normal";// 一切正常

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    abstract void sendMessage(String help);//每个公民都可以报警，请求警察出动

    public void setPolicemen() {
        this.list_policemen = new ArrayList<>();
    }

    public void register(Policeman pol) { //注册警员
        this.list_policemen.add(pol);
    }

    public void unRegister(Policeman pol) { //解除警员
        this.list_policemen.remove(pol);
    }



}
