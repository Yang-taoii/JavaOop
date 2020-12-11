package com.kgc.oop.designpatterns.observe_mode;

/**
 * @author：杨涛
 */
public class ChangShaPoliceman implements Policeman{
    @Override
    public void action(Citizen citizen) {
        String help = citizen.getHelp();
        if ("normal".equals(help)){
            System.out.println("一切正常，不用出警");
        }
        if ("abnormal".equals(help)) {
            System.out.println("接到群众报警，有犯罪行为，警察出动!");
        }

    }
}
