package com.kgc.oop.designpatterns.status;

/**
 * @author：杨涛
 */
public class Rain implements Weather{
    /**
     * 获取当前天气信息
     **/
    @Override
    public String getWeather() {
        return "今天天气为雨天，出行请注意安全";
    }
}
