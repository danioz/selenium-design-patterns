package com.udemy.seleniumdesign.di;


import java.util.ArrayList;
import java.util.List;

public class House {

    List<Window> windows = new ArrayList<>();
    private Weather weather;

    public House(Weather weather) {
        windows.add(new Window(weather));
        windows.add(new Window(weather));
        windows.add(new Window(weather));
        windows.add(new Window(weather));

    }

    public void look() {

        for(Window window : windows) {
            window.lookOut();
        }
    }

    public static void main(String[] args) {
        Weather weather = new Weather();
        House house = new House(weather);
        house.look();
    }
}
