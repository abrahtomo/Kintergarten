package com.codecool;

public class Eleven extends Child {

    public Eleven(int satisfaction) {
        super(satisfaction);
    }

    @Override
    void changeSatisfactionLevel() {
        switch (Activities.getInstance()){
            case BALLGAME: satisfaction = 3;
            break;
            case SINGING: satisfaction -= 1;
            break;
            case DRAWING: satisfaction -= 1;
            break;
        }
    }
}
