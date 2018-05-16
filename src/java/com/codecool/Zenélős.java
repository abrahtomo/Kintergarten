package com.codecool;

public class Zenélős extends Child{

    public Zenélős(int satisfaction) {
        super(satisfaction);
    }

    @Override
    void changeSatisfactionLevel() {
        switch (Activities.getInstance()){
            case SINGING: satisfaction = 4;
            break;
            case DRAWING: satisfaction -= 1;
            break;
            case BALLGAME: satisfaction -= 1;
            break;
        }
    }
}
