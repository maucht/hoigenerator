package com.example.hoigenreal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
 * Use the {@link home#newInstance} factory method to
 * create an instance of this fragment.
 */
public class home extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private static final String GENERATION_LIST="generation list";
    private static final String COMPLETED_LIST = "completed list";
    private static final String COMPLETED_ACHIEVEMENT_LIST = "completed achievement list";

    public List<Generation> generatedList = null;
    public List<Generation> completedList = null;
    public List<Achievement> completedAchievementList = null;

    private View InflatedViewForFinding;

    public home() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment home.
     */
    // TODO: Rename and change types and number of parameters
    public static home newInstance(String param1, String param2) {
        home fragment = new home();
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
        // Inflate the layout for this fragment
        InflatedViewForFinding = inflater.inflate(R.layout.fragment_home, container, false);
        this.loadListData();
        this.loadCompletedListData();

        LinearLayout playthroughItemsLinearLayout = InflatedViewForFinding.findViewById(R.id.achievementItemLinearLayout);
        if(InflatedViewForFinding!=null) {
            View completedHeaderText = InflatedViewForFinding.findViewById(R.id.completedHeader);
            completedHeaderText.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("DELET","SHOULD NAVIGATE TO COMPLETED FRAGMENT");
                    home.this.switchActiveToCompletedFragment();
                }
            });

            if (generatedList.size() > 0) {
                for (Generation currGeneration : generatedList) {
                    Log.i("HOME FRAGMENT", "SHOULD RENDER PLAYTHROUGH ITEM");
                    View playthroughItem = getLayoutInflater().inflate(R.layout.playthrough_item, playthroughItemsLinearLayout, false);
                    playthroughItem.setTag(R.id.gen_tag_key,currGeneration.getId());

                    ImageView playthroughItemImage = playthroughItem.findViewById(R.id.achievement_image);
                    playthroughItemImage.setImageResource(currGeneration.getGeneratedNation().getImageId());

                    TextView playthroughItemNationText = playthroughItem.findViewById(R.id.achievement_title);
                    playthroughItemNationText.setText(currGeneration.getGeneratedNation().getNationName());

                    TextView playthroughItemAchievementText = playthroughItem.findViewById(R.id.item_achievement_title);
                    playthroughItemAchievementText.setText(currGeneration.getGeneratedAchievement().getName());

                    ImageView playthroughItemAchievementImage = playthroughItem.findViewById(R.id.item_achievement_image);
                    playthroughItemAchievementImage.setImageResource(currGeneration.getGeneratedAchievement().getImageId());

                    View playthroughItemTrashButton = playthroughItem.findViewById(R.id.item_trash_button);
                    playthroughItemTrashButton.setTag(R.id.gen_tag_key,currGeneration.getId());
                    playthroughItemTrashButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Log.d("DLEETETHIS","YOU CLICKED TRASH ICON");
                            playthroughItem.setVisibility(playthroughItem.GONE);
                            home.this.removeGenerationData((int) v.getTag(R.id.gen_tag_key));
                        }
                    });

                    View playthroughItemCompleteButton = playthroughItem.findViewById(R.id.item_complete_button);
                    playthroughItemCompleteButton.setTag(R.id.gen_tag_key,currGeneration.getId());
                    playthroughItemCompleteButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Log.d("DELETETHIS","YOU CLICKED COMPLETE BUTTON");
                            playthroughItem.setVisibility(playthroughItem.GONE);
                            home.this.addCompletedData((int) v.getTag(R.id.gen_tag_key));
                            home.this.removeGenerationData((int) v.getTag(R.id.gen_tag_key));
                        }
                    });

                    playthroughItemsLinearLayout.addView(playthroughItem);
                }
            }
        }
        return InflatedViewForFinding;
    }
    private void switchActiveToCompletedFragment(){
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_frame_layout,new completed())
                .commit();
    }
    private void removeGenerationData(int genId){
        Generation genToRemove;
        int index = 0;
        for(Generation currGen : this.generatedList){
            if(currGen.getId() == genId){
                genToRemove = currGen;
                break;
            }
            index+=1;
        }
        SharedPreferences mySharedPreferences = getContext().getSharedPreferences("shared preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor sharedPreferencesEditor = mySharedPreferences.edit();
        Gson gson = new Gson();
        this.generatedList.remove(index);
        String json = gson.toJson(this.generatedList);
        sharedPreferencesEditor.putString(GENERATION_LIST,json);
        sharedPreferencesEditor.apply();
        home.this.loadListData();

    }
    private void addCompletedData(int id){
        Generation newGeneration = null;

        for(Generation currGen : this.generatedList){
            if(currGen.getId() == id){
                newGeneration = currGen;
            }
        }

        SharedPreferences mySharedPreferences = getContext().getSharedPreferences("shared preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor sharedPreferencesEditor = mySharedPreferences.edit();
        Gson gson = new Gson();
        // Create Json by appending new data to loaded Json data
        this.completedList.add(newGeneration); // change to completed list
        String json = gson.toJson(this.completedList); // change
        sharedPreferencesEditor.putString(COMPLETED_LIST,json);
        sharedPreferencesEditor.apply();
        home.this.calculateCompletedAchievementListData();
        home.this.loadListData();
        home.this.loadCompletedListData();



    }
    private void loadListData(){
        SharedPreferences mySharedPreferences = getContext().getSharedPreferences("shared preferences", Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json = mySharedPreferences.getString(GENERATION_LIST,null);
        Type type = new TypeToken<ArrayList<Generation>>() {}.getType();
        generatedList = gson.fromJson(json,type);

        if(generatedList==null){
            generatedList = new ArrayList<>();
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
    private void calculateCompletedAchievementListData(){
        List<Achievement> completedAchievementList = new ArrayList<>();
        for(Generation currGen : completedList){
            if(!completedAchievementList.contains(currGen.getGeneratedAchievement())){
                completedAchievementList.add(currGen.getGeneratedAchievement());
            }
        }
        SharedPreferences mySharedPreferences = getContext().getSharedPreferences("shared preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor sharedPreferencesEditor = mySharedPreferences.edit();
        Gson gson = new Gson();

        String json = gson.toJson(completedAchievementList);
        sharedPreferencesEditor.putString(COMPLETED_ACHIEVEMENT_LIST,json);
        sharedPreferencesEditor.apply();
    }
}