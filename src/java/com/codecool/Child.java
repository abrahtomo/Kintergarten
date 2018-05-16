package com.codecool;

public abstract class Child {

    int satisfaction;
    private boolean hissy;

    abstract void changeSatisfactionLevel();

    void behaveOnClass(){
        changeSatisfactionLevel();
        setHissy();
    }

    Child(int satisfaction) {
        this.satisfaction = satisfaction;
        this.hissy = false;
    }

    void setHissy(){
        if (satisfaction < 1){
            hissy = true;
        }
    }

    boolean isHissy() {
        return hissy;
    }
}
