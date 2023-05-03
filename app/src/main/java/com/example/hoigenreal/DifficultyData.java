package com.example.hoigenreal;

import java.util.ArrayList;
import java.util.List;

public class DifficultyData {
    public static List<Difficulty> getAllDifficulties(){
        List<Difficulty> difficultyList = new ArrayList<>();

        Difficulty anyDiff = new Difficulty("Any","Easy",0);
        difficultyList.add(anyDiff);

        Difficulty easyDiff = new Difficulty("Easy","Easy",1);
        difficultyList.add(easyDiff);

        Difficulty mediumDiff = new Difficulty("Medium","Medium",2);
        difficultyList.add(mediumDiff);

        Difficulty hardDiff = new Difficulty("Hard","Hard",3);
        difficultyList.add(hardDiff);

        return difficultyList;
    }
}
