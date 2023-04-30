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


    public AchievementAdapter(Context context, List<Achievement> achievementList, int dropdownStyleId){
        this.context = context;
        this.achievementList = achievementList;
        this.dropdownStyle = dropdownStyleId;



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
