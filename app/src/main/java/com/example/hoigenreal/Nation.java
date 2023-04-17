package com.example.hoigenreal;

public class Nation {
    private String nationName;
    private int imageId;
    private int id;

    public void setNationName(String cNationName){
        this.nationName = cNationName;
    }
    public void setImageId(int imageId){
        this.imageId = imageId;
    }
    public String getNationName(){
        return this.nationName;
    }
    public int getImageId(){
        return this.imageId;
    }
    public int getId(){
        return this.id;
    }
    public Nation(String initName, int initImageId,int initId){
        this.setNationName(initName);
        this.setImageId(initImageId);
        this.id = initId;
    }
}
