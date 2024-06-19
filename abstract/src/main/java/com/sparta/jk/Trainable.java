package com.sparta.jk;

public interface Trainable extends Schoolable{
    default void train(){
        study();
        System.out.println("I'm going to train by studying");

    }
    
}
