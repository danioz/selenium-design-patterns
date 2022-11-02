package com.udemy.seleniumdesign.di;

import java.util.Random;

public class Weather {
    private static Random random = new Random(System.currentTimeMillis());

    public String description;

    public Weather() {
        switch(random.nextInt(4)) {
            case 0:
                this.description = "Pada deszcz";
                break;
            case 1:
                this.description = "Świeci słońce";
                break;
            case 2:
                this.description = "Pada śnieg";
                break;
            case 3:
                this.description = "Wieje wiatr";
                break;
        }

    }
}
