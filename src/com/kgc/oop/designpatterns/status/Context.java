package com.kgc.oop.designpatterns.status;

/**
 * @author：杨涛
 */
public class Context {
    private Weather weather;

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String weatherMessage(){
        return weather.getWeather();
    }

}
