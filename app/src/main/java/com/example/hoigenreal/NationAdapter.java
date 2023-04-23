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

public class NationAdapter extends BaseAdapter {
    private List<Nation> nationList;
    private Context context;
    private int dropdownStyle;


    public NationAdapter(Context context, List<Nation> nationList, int dropdownStyleId){
        this.context = context;
        this.nationList = nationList;
        this.dropdownStyle = dropdownStyleId;



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
            convertView = LayoutInflater.from(context).inflate(R.layout.spinner_dropdown, parent, false);
        }
        TextView textView = convertView.findViewById(android.R.id.text1);
        Nation currNation = (Nation) getItem(position);
        if(textView!=null) {
            //Log.d("Adapter Text","Setting Text: "+currNation.getNationName());
            textView.setText(currNation.getNationName());
        }
        else{
            Log.wtf("ADAPTER FUCKUP","textView is null");
        }
        return convertView;
    }
}
