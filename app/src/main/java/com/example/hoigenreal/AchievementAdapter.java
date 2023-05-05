package com.example.hoigenreal;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AchievementAdapter extends BaseAdapter {
    private List<Achievement> achievementList;
    private Context context;
    private int dropdownStyle;
    private Nation selectedNation;
    private Difficulty selectedDifficulty;


    public AchievementAdapter(Context context, List<Achievement> achievementList,
                              int dropdownStyleId,Difficulty selectedDifficulty,
                              Nation selectedNation){
        this.context = context;
        this.achievementList = achievementList;
        this.dropdownStyle = dropdownStyleId;
        this.selectedNation = selectedNation;
        this.selectedDifficulty = selectedDifficulty;
        this.filterAchievementListDifficulty(achievementList,selectedDifficulty,selectedNation);
        this.filterAchievementListNation(achievementList,selectedDifficulty,selectedNation);




    }
    private void filterAchievementListDifficulty(List<Achievement> achievementList, Difficulty selectedDifficulty, Nation selectedNation) {
        if (selectedDifficulty.getName().equals("Any")) {
            Log.d("Adapter Filter", "AchAdapter Filter: Difficulty at any");
            this.achievementList = achievementList;
            return;
        } else {
            List<Achievement> filteredList = new ArrayList<>();
            Log.d("Adapter Filter", "AchAdapter Filter: Difficulty NOT at any");
            for (Achievement achievement : achievementList) {
                if (achievement.getDifficulty().equals(selectedDifficulty.getDifficulty()) || achievement.getName()=="Any") {
                    filteredList.add(achievement);
                }
            }
            this.achievementList = filteredList;
        }
    }
    private void filterAchievementListNation(List<Achievement> achievementList, Difficulty selectedDifficulty, Nation selectedNation) {
        if (selectedNation.getNationName().equals("Any")) {
            Log.d("Adapter Filter", "AchAdapter Filter: Nation at any");
            this.achievementList = achievementList;
            return;
        } else {
            List<Achievement> filteredList = new ArrayList<>();
            Log.d("Adapter Filter", "AchAdapter Filter: Nation NOT at any");
            for (Achievement achievement : achievementList) {
                if (achievement.getValidNationList().contains(selectedNation.getNationName()) || achievement.getName()=="Any") {
                    Log.i("AchAdapter Adding","ACHADAPTER ADDING NAT: "+selectedNation.getNationName());
                    filteredList.add(achievement); //c
                }
            }
            this.achievementList = filteredList;
        }
    }
    public void setSelectedChange(Difficulty nselectedDifficulty,Nation zselectedNation,List<Achievement> nAchievementList) {
        this.selectedDifficulty = nselectedDifficulty;
        this.selectedNation = zselectedNation;
        this.filterAchievementListDifficulty(nAchievementList,nselectedDifficulty,zselectedNation);
        this.filterAchievementListNation(this.achievementList,nselectedDifficulty,zselectedNation);
        // PROBLEM at function above
        notifyDataSetChanged();
    }
    @Override
    public int getCount() {
        return achievementList.size();
    }

    @Override
    public Object getItem(int position) {
        return achievementList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return achievementList.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.spinner_dropdown, parent, false);
        }
        TextView textView = convertView.findViewById(android.R.id.text1);
        Achievement currAchievement = (Achievement) getItem(position);
        if(textView!=null) {
            //Log.d("Adapter Text","Setting Text: "+currNation.getNationName());
            textView.setText(currAchievement.getName());
        }
        else{
            Log.wtf("Achievement ADAPTER FUCKUP","textView is null");
        }
        return convertView;
    }
}
