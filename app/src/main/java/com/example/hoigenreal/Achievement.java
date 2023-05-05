package com.example.hoigenreal;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Achievement {
    public Achievement(String name, int id, int imageId, boolean isFrance, boolean isGermany,
                            boolean isBritain, boolean isSoviet, boolean isAmerica, boolean isItaly,
                            boolean isJapan, boolean isOther){

        this.name = name;
        this.id = id;
        this.imageId=imageId;


        this.isFrance=isFrance;
        this.isGermany=isGermany;
        this.isBritain=isBritain;
        this.isSoviet=isSoviet;
        this.isAmerica=isAmerica;
        this.isItaly=isItaly;
        this.isJapan=isJapan;
        this.isOther=isOther;
    } // full constructor
    public Achievement(String name, int id, int imageId, String dlcPack){
        this.name = name;
        this.id=id;
        this.imageId=imageId;

        this.isFrance=false;
        this.isGermany=false;
        this.isBritain=false;
        this.isSoviet=false;
        this.isAmerica=false;
        this.isItaly=false;
        this.isJapan=false;
        this.isOther=false;
    }
    public void setNationFlag(String nationName){
        switch(nationName){
            case("France"):
                this.isFrance = true;
                break;
            case("Germany"):
                this.isGermany = true;
                break;
            case("Britain"):
                this.isBritain=true;
                break;
            case("Soviet"):
                this.isSoviet=true;
                break;
            case("America"):
                this.isAmerica=true;
                break;
            case("Italy"):
                this.isItaly=true;
                break;
            case("Japan"):
                this.isJapan=true;
                break;
            case("Other"):
                this.isOther=true;
                break;
            case("Any"):
                this.isFrance=true;
                this.isGermany=true;
                this.isBritain=true;
                this.isSoviet=true;
                this.isAmerica=true;
                this.isItaly=true;
                this.isJapan=true;
                this.isOther=true;
                break;
            default:
                Log.wtf("Nation Data Flag","Nation Data Flag: Unrecognized nationName");
        }
    }
    public void setOtherList(String[] nationsToSet){
        this.otherArray = nationsToSet;

    }
    public void setDifficulty(String pdifficulty){
        this.difficulty = pdifficulty;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getDifficulty(){return this.difficulty;}
    public int getImageId(){return this.imageId;}
    public List<String> getValidNationList(){
        List<String> validNationList = new ArrayList<>();
        if(this.isFrance){
            validNationList.add("France");
        }
        if(this.isGermany){
            validNationList.add("Germany");
        }
        if(this.isBritain){
            validNationList.add("Britain");
        }
        if(this.isSoviet){
            validNationList.add("Soviet");
        }
        if(this.isAmerica){
            validNationList.add("USA");
        }
        if(this.isItaly){
            validNationList.add("Italy");
        }
        if(this.isJapan){
            validNationList.add("Japan");
        }
        if(this.isOther){
            validNationList.add("Other");
        }
        return validNationList;
    }

    private String name;
    private int id;
    private int imageId;
    private String difficulty;

    public String dlcPack;
    public boolean isFrance;
    public boolean isGermany;
    public boolean isBritain;
    public boolean isSoviet;
    public boolean isAmerica;
    public boolean isItaly;
    public boolean isJapan;
    public boolean isOther;

    public String[] otherArray=null;

}
