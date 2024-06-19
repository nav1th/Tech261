package com.sparta.jk;

public class JavaTrainee extends Trainee implements Trainable {

    private String github;
    @Override
    public void study(){
        System.out.println("I really need to study more Java");
    }
    @Override
    public void train(){
        study();
        System.out.println("I'm going to train by studying");

    }
    @Override
    public void revise(){
        System.out.println("go away i need to revise");
    }
}
