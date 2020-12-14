package com.kgc.oop.designpatterns.status;

/**
 * @author：杨涛
 */
public class Sunny implements Weather{
    /**
     * 获取当前天气信息
     **/
    @Override
    public String getWeather() {
        return "今天是晴天哦";
    }
}
