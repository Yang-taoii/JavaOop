package com.kgc.oop.designpatterns.adaptermode;

/**
 * @author：杨涛
 * 适配器
 */
public class Adapt implements TargetMyComputer {
    /**适配器上需要有的usb接口**/
    private Adaptee_USB adaptee_usb;//

    public Adapt(Adaptee_USB adaptee){
        this.adaptee_usb = adaptee;
    }

    @Override
    public void workTapeC() {
        adaptee_usb.adapteeUsbWork(); //适配TapeC接口使USB接口鼠标进行工作
    }



}
