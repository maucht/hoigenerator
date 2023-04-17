package com.example.hoigenreal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NationAdapter extends BaseAdapter {
    private List<Nation> nationList;
    private Context context;


    public NationAdapter(Context context, List<Nation> nationList){
        this.context = context;
        this.nationList = nationList;
    }

    @Override
    public int getCount() {
        return nationList.size();
    }

    @Override
    public Object getItem(int position) {
        return nationList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return nationList.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(android.R.layout.simple_spinner_dropdown_item, parent, false);
        }
        TextView textView = convertView.findViewById(android.R.id.text1);
        Nation currNation = (Nation) getItem(position);
        textView.setText(currNation.getNationName());
        return convertView;
    }
}
