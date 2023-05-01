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

public class DifficultyAdapter extends BaseAdapter {
    private List<Difficulty> difficultyList;
    private Context context;
    private int dropdownStyle;


    public DifficultyAdapter(Context context, List<Difficulty> difficultyList, int dropdownStyleId){
        this.context = context;
        this.difficultyList = difficultyList;
        this.dropdownStyle = dropdownStyleId;



    }

    @Override
    public int getCount() {
        return difficultyList.size();
    }

    @Override
    public Object getItem(int position) {
        return difficultyList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return difficultyList.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.spinner_dropdown, parent, false);
        }
        TextView textView = convertView.findViewById(android.R.id.text1);
        Difficulty currDifficulty = (Difficulty) getItem(position);
        if(textView!=null) {
            //Log.d("Adapter Text","Setting Text: "+currNation.getNationName());
            textView.setText(currDifficulty.getName());
        }
        else{
            Log.wtf("Achievement ADAPTER FUCKUP","textView is null");
        }
        return convertView;
    }
}
