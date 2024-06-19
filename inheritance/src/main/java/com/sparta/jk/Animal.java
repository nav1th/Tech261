package com.sparta.jk;

public class Animal {
    String name;
    int limbs;

    public Animal(String name, int limbs){
        this.limbs = limbs;
        this.name = name;
    }

    public String getNoise(){
        return "Bark";
    }
    public String getWalkAction(){
        return name + " walks on " + limbs + " limbs.";
    }
}
