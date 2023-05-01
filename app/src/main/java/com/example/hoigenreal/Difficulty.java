package com.example.hoigenreal;

public class Difficulty {
    public Difficulty(String pdifficulty, int pid){
        this.difficulty = pdifficulty;
        this.id = pid;
    }
    public String getName(){
        return this.difficulty;
    }

    public int getId(){
        return this.id;
    }
    private String difficulty;
    private int id;
}
