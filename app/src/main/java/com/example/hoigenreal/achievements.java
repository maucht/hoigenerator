package com.example.hoigenreal;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link achievements#newInstance} factory method to
 * create an instance of this fragment.
 */
public class achievements extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private View InflatedViewForFinding;

    private static final String COMPLETED_ACHIEVEMENT_LIST = "completed achievement list";
    private static final String GENERATION_LIST="generation list";

    private List<Generation> generationList = new ArrayList<>();
    private List<Achievement> completedAchievementList = new ArrayList<>();

    private static final String COMPLETED_LIST = "completed list";
    private List<Generation> completedList = null;

    private List<Achievement> listOfAllAchievements = AchievementData.getAllAchievements();
    private List<String> listOfCompletedAchievementNames = new ArrayList<>();


    public achievements() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment achievements.
     */
    // TODO: Rename and change types and number of parameters
    public static achievements newInstance(String param1, String param2) {
        achievements fragment = new achievements();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        achievements.this.loadCompletedListData();
        achievements.this.loadCompletedAchievementListData();
        achievements.this.calculateAchievementNameList();
        InflatedViewForFinding =  inflater.inflate(R.layout.fragment_achievements, container, false);

        View settingsCog = InflatedViewForFinding.findViewById(R.id.settingsCogView);
        settingsCog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("NAVIGATION","Clicked on Cog Wheel, should bring up settings dialog");
                // new dialog, just copy and paste the generation dialog and size it down, throw a few buttons in and call it a day
                final Dialog settingsDialog = new Dialog(getActivity(),android.R.style.Theme_Black_NoTitleBar);
                settingsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.argb(160,0,0,0))); // sets gray background
                settingsDialog.setContentView(R.layout.settings_dialog);
                settingsDialog.setCancelable(true);
                settingsDialog.show();

                Button clearActiveButton = settingsDialog.findViewById(R.id.clearActiveButton);
                Button clearCompleteButton = settingsDialog.findViewById(R.id.clearCompleteButton);
                Button resetAchievementsButton = settingsDialog.findViewById(R.id.resetAchievementsButton);

                clearActiveButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("SETTINGS BUTTON","SHOULD CLEAR ACTIVE");
                        // sharedpref
                        achievements.this.clearActivePlaythroughs();
                    }
                });
                clearCompleteButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("SETTINGS BUTTON", "SHOULD CLEAR COMPLETE");
                        achievements.this.clearCompletePlaythroughs();
                    }
                });
                resetAchievementsButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("SETTINGS BUTTON","SHOULD RESET ACHIEVEMENTS");
                        achievements.this.clearAchievements();
                        achievements.this.clearCompletePlaythroughs();
                        achievements.this.loadCompletedAchievementListData();
                    }
                });
            }
        });

        LinearLayout parentLayout = InflatedViewForFinding.findViewById(R.id.achievementItemLinearLayout);
        if(InflatedViewForFinding!=null){
            for(Achievement currAch : listOfAllAchievements){
                if(currAch.getName()!="Any") {
                    View achievementView = getLayoutInflater().inflate(R.layout.achievement_item, parentLayout, false);

                    ImageView achievementIcon = achievementView.findViewById(R.id.achievement_image);
                    achievementIcon.setImageResource(currAch.getImageId());

                    TextView achievementText = achievementView.findViewById(R.id.achievement_title);
                    achievementText.setText(currAch.getName());

                    if (listOfCompletedAchievementNames.size()>0 &&
                            listOfCompletedAchievementNames.contains(currAch.getName())) { // This is fucked when storage is cleared
                        achievementView.setBackgroundColor(Color.parseColor("#76b877"));
                        // #59EC5B
                        // #96eb98
                        //
                    }
                    parentLayout.addView(achievementView);
                }
            }
        }
        return InflatedViewForFinding;
    }

    private void calculateAchievementNameList(){
        for(Achievement currAch : completedAchievementList){
            Log.d("Curr","Currach: "+currAch.getName());
            if(!listOfCompletedAchievementNames.contains(currAch.getName())) {
                Log.d("YUHH", "ADDING TO NAME LIST: " + currAch.getName());
                listOfCompletedAchievementNames.add(currAch.getName());
            }
        }
    }
    private void loadActiveData(){
        SharedPreferences mySharedPreferences = getContext().getSharedPreferences("shared preferences", Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json = mySharedPreferences.getString(GENERATION_LIST,null);
        Type type = new TypeToken<ArrayList<Generation>>() {}.getType();
        achievements.this.generationList = gson.fromJson(json,type);

        if(generationList==null){
            generationList = new ArrayList<>();
        }
    }
    private void loadCompletedListData(){
        SharedPreferences mySharedPreferences = getContext().getSharedPreferences("shared preferences", Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json = mySharedPreferences.getString(COMPLETED_LIST,null);
        Type type = new TypeToken<ArrayList<Generation>>() {}.getType();
        completedList = gson.fromJson(json,type);

        if(completedList==null){
            completedList = new ArrayList<>();
        }
    }
    private void loadCompletedAchievementListData(){
        SharedPreferences mySharedPreferences = getContext().getSharedPreferences("shared preferences", Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json = mySharedPreferences.getString(COMPLETED_ACHIEVEMENT_LIST,null);
        Type type = new TypeToken<ArrayList<Achievement>>() {}.getType();
        completedAchievementList = gson.fromJson(json,type);

        if(completedAchievementList==null){
            completedAchievementList = new ArrayList<>();
        }
    }
    private void clearActivePlaythroughs(){

        achievements.this.loadActiveData();

        SharedPreferences mySharedPreferences = getContext().getSharedPreferences("shared preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor sharedPreferencesEditor = mySharedPreferences.edit();
        Gson gson = new Gson();
        achievements.this.generationList.clear();
        String json = gson.toJson(this.generationList);
        sharedPreferencesEditor.putString(GENERATION_LIST,json);
        sharedPreferencesEditor.apply();
    }
    private void clearCompletePlaythroughs(){
        SharedPreferences mySharedPreferences = getContext().getSharedPreferences("shared preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor sharedPreferencesEditor = mySharedPreferences.edit();
        Gson gson = new Gson();
        achievements.this.completedList.clear();
        String json = gson.toJson(this.completedList);
        sharedPreferencesEditor.putString(COMPLETED_LIST,json);
        sharedPreferencesEditor.apply();
    }
    private void clearAchievements(){
        SharedPreferences mySharedPreferences = getContext().getSharedPreferences("shared preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor sharedPreferencesEditor = mySharedPreferences.edit();
        Gson gson = new Gson();
        achievements.this.completedAchievementList.clear();
        String json = gson.toJson(this.completedAchievementList);
        sharedPreferencesEditor.putString(COMPLETED_ACHIEVEMENT_LIST,json);
        sharedPreferencesEditor.apply();
    }
}