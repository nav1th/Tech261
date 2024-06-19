package com.sparta.jk;

public abstract class Human extends Animal{
    String occupation;

    public Human(String name, int limbs, String occupation){
        super(name, limbs);
        this.occupation = occupation;
    }

    public String getNoise(){
        return "Hello my name is " + name + " and I'm a " + occupation;
    }
}
