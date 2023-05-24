package com.example.hoigenreal;

public class Generation {
    private int id;

    private Nation generatedNation;
    private Achievement generatedAchievement;
    private Difficulty generatedDifficulty;
    private String userNotes = "Edit notes";

    public void setNotes(String submitNotes){
        this.userNotes = submitNotes;
    }

    public int getId(){
        return this.id;
    }

    public Generation(int id, Nation genNation, Achievement genAchievement, Difficulty genDifficulty){
        this.id = id;
        this.generatedNation = genNation;
        this.generatedAchievement = genAchievement;
        this.generatedDifficulty = genDifficulty;
    }
    public String getUserNotes(){return this.userNotes;}
    public Nation getGeneratedNation(){
        return this.generatedNation;
    }
    public Achievement getGeneratedAchievement(){
        return this.generatedAchievement;
    }
    public Difficulty getGeneratedDifficulty(){
        return this.generatedDifficulty;
    }
}
