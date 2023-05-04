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
    private Boolean isDifficultySelected=false;
    private Difficulty selectedDifficulty;


    public AchievementAdapter(Context context, List<Achievement> achievementList, int dropdownStyleId,Difficulty selectedDifficulty){
        this.context = context;
        this.achievementList = achievementList;
        this.dropdownStyle = dropdownStyleId;
        this.isDifficultySelected = (selectedDifficulty.getName()!="Any");
        this.selectedDifficulty = selectedDifficulty;
        this.filterAchievementList(achievementList,selectedDifficulty);




    }
    private void filterAchievementList(List<Achievement> achievementList, Difficulty selectedDifficulty) {
        if (selectedDifficulty.getName().equals("Any")) {
            Log.d("Adapter Filter", "AchAdapter Filter: Difficulty at any");
            return;
        } else {
            List<Achievement> filteredList = new ArrayList<>();
            Log.d("Adapter Filter", "AchAdapter Filter: Difficulty NOT at any");
            for (Achievement achievement : achievementList) {
                if (achievement.getDifficulty().equals(selectedDifficulty.getDifficulty())) {
                    filteredList.add(achievement);
                }
            }
            this.achievementList = filteredList;
        }
    }
    public void setSelectedDifficulty(Difficulty selectedDifficulty,List<Achievement> nAchievementList) {
        this.selectedDifficulty = selectedDifficulty;
        this.filterAchievementList(nAchievementList,selectedDifficulty);
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
