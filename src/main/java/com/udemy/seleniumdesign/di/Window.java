package com.udemy.seleniumdesign.di;

public class Window {
    private Weather weather;

    public Window(Weather weather) {
        this.weather = weather;
    }

    public void lookOut() {
        System.out.println(this.weather.description);
    }
}
