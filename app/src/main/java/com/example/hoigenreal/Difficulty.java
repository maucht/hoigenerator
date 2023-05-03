package com.example.hoigenreal;

public class Difficulty {
    public Difficulty(String pname,String pdifficulty, int pid){
        this.name = pname;
        this.difficulty=pdifficulty;
        this.id = pid;
    }
    public String getName(){
        return this.name;
    }
    public String getDifficulty(){return this.difficulty;}
    public int getId(){
        return this.id;
    }

    private String name;
    private String difficulty;
    private int id;
}
