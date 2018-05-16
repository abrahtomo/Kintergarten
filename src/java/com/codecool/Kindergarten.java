package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Kindergarten {

    private boolean isEscalated;
    private List<Child> children = new ArrayList<>();

    public boolean isEscalated() {
        int hissyCoutner = 0;
        for (Child child: children){
            if (child.isHissy() && hissyCoutner<3){
                hissyCoutner++;
            } else if (hissyCoutner > 2){
                isEscalated = true;
            }
        }
        return isEscalated;
    }

    public List<Child> getChildren() {
        return children;

    }

    public void init(){
        for (int i = 0; i < 3; i++){
            children.add(new Zenélős(4));
        }
        for (int i = 0; i < 3; i++){
            children.add(new Eleven(3));
        }
        for (int i = 0; i < 3; i++){
            children.add(new Kényelmes(2));
        }
    }

    public void activity(int numOfActs){
        for (int i = 0; i < numOfActs; i++){
            Activities.activityChange();
            for (Child child: children){
                child.behaveOnClass();
        }
            if (isEscalated()){
                System.out.println("It is escalated after: " + i + "activities");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Kindergarten kindergarten = new Kindergarten();
        kindergarten.init();
        kindergarten.activity(5);
    }
}
