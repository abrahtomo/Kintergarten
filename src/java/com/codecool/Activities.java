package com.codecool;

import java.util.Random;

public enum Activities {
    SINGING, BALLGAME, DRAWING, DANCE;

    static Activities instance = null;
    private static Random random = new Random();

    public static Activities getInstance(){
        return instance;
    }

    public static void activityChange(){
        instance = Activities.values()[random.nextInt(Activities.values().length)];
    }
}
