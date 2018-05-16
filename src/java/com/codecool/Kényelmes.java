package com.codecool;

public class Kényelmes extends Child {

    public Kényelmes(int satisfaction) {
        super(satisfaction);
    }

    @Override
    void changeSatisfactionLevel() {
        switch (Activities.getInstance()){
            case DRAWING: satisfaction = 4;
            break;
            case DANCE: satisfaction -= 1;
            break;
            case BALLGAME: satisfaction -= 2;
            break;
        }

    }
}
