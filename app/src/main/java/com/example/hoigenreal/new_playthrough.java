package com.example.hoigenreal;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link new_playthrough#newInstance} factory method to
 * create an instance of this fragment.
 */
public class new_playthrough extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Nation selectedNation;
    public Achievement selectedAchievement;
    public Difficulty selectedDifficulty;

    private View InflatedViewForFinding;

    public new_playthrough() {
        //constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment new_playthrough.
     */
    // TODO: Rename and change types and number of parameters
    public static new_playthrough newInstance(String param1, String param2) {
        new_playthrough fragment = new new_playthrough();
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
        InflatedViewForFinding = inflater.inflate(R.layout.fragment_new_playthrough, container, false);
        if(InflatedViewForFinding!=null) {
            View generateButton = this.InflatedViewForFinding.findViewById(R.id.submitGenerationButton);
            Spinner spinner_nations = this.InflatedViewForFinding.findViewById(R.id.spinner_nations);
            Spinner spinner_achievements = this.InflatedViewForFinding.findViewById(R.id.spinner_achievements);
            Spinner spinner_difficulties = this.InflatedViewForFinding.findViewById(R.id.spinner_difficulties);
            List<Nation> nationList = NationData.getAllNations();
            List<Achievement> achievementList = AchievementData.getAllAchievements();
            List<Difficulty> difficultyList = DifficultyData.getAllDifficulties();

            this.selectedNation = nationList.get(0);
            this.selectedAchievement = achievementList.get(0);
            this.selectedDifficulty = difficultyList.get(0);

            Log.d("NATLIST", nationList.get(1).getNationName());

            NationAdapter myNationAdapter = new NationAdapter(getActivity(), nationList,R.style.spinnerDropdownStyle);
            AchievementAdapter myAchievementAdapter = new AchievementAdapter(getActivity(),achievementList,R.style.spinnerDropdownStyle,this.selectedDifficulty);
            DifficultyAdapter myDifficultyAdapter = new DifficultyAdapter(getActivity(),difficultyList,R.style.spinnerDropdownStyle);



            spinner_nations.setAdapter(myNationAdapter);

            spinner_nations.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                    new_playthrough.this.selectedNation = (Nation) adapterView.getSelectedItem();


                    Log.d("Spinner", "Selected nation: " + selectedNation.getNationName());
                    ImageView flagView = InflatedViewForFinding.findViewById(R.id.spinner_flag_preview);
                    flagView.setImageResource(new_playthrough.this.selectedNation.getImageId());
                    switch(new_playthrough.this.selectedNation.getNationName()){
                        case("Germany"):
                            Log.d("Flag Change","Should set flag to germany");
                            flagView.setColorFilter(0);
                            break;
                        case("Italy"):

                            flagView.setColorFilter(0);
                            break;
                        case("France"):

                            flagView.setColorFilter(0);
                            break;
                        case("United Kingdom"):

                            flagView.setColorFilter(0);
                            break;
                        case("United States"):

                            flagView.setColorFilter(0);
                            break;
                        case("Japan"):

                            flagView.setColorFilter(0);
                            break;
                        case("Soviet Union"):

                            flagView.setColorFilter(0);
                            break;
                        case("Any"):

                            flagView.setColorFilter(R.color.md_theme_dark_onPrimaryContainer);
                            break;
                    }



                }
                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    Log.d("click", "NOTHING CLICKED");
                }
            });

            spinner_achievements.setAdapter(myAchievementAdapter);
            spinner_achievements.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l){
                    ImageView difficultyImage = InflatedViewForFinding.findViewById(R.id.difficulty_image_view);
                    difficultyImage.setImageResource(R.mipmap.ic_easy_blue_round);
                    new_playthrough.this.selectedAchievement = (Achievement) adapterView.getSelectedItem();

                    switch(new_playthrough.this.selectedAchievement.getDifficulty()){
                        case("Easy"):
                            difficultyImage.setImageResource(R.mipmap.ic_easy_blue_round);
                            break;
                        case("Medium"):
                            difficultyImage.setImageResource(R.mipmap.ic_medium_orange_round);
                            break;
                        case("Hard"):
                            difficultyImage.setImageResource(R.mipmap.ic_hard_red_round);
                    }

                }
                @Override
                public void onNothingSelected(AdapterView<?> parent){
                    Log.d("click","NOTHING SELECTED: Achievement Spinner");
                }
            });
            spinner_difficulties.setAdapter(myDifficultyAdapter);
            spinner_difficulties.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                    ImageView difficultySpinnerImage = InflatedViewForFinding.findViewById(R.id.difficulty_spinner_image_view);
                    difficultySpinnerImage.setImageResource(R.mipmap.ic_easy_blue_round);
                    new_playthrough.this.selectedDifficulty = (Difficulty) adapterView.getSelectedItem();

                    switch(new_playthrough.this.selectedDifficulty.getName()){
                        case("Easy"):
                            difficultySpinnerImage.setImageResource(R.mipmap.ic_easy_blue_round);
                            myAchievementAdapter.setSelectedDifficulty(new_playthrough.this.selectedDifficulty,achievementList);
                            break;
                        case("Medium"):
                            difficultySpinnerImage.setImageResource(R.mipmap.ic_medium_orange_round);
                            myAchievementAdapter.setSelectedDifficulty(new_playthrough.this.selectedDifficulty,achievementList);
                            break;
                        case("Hard"):
                            difficultySpinnerImage.setImageResource(R.mipmap.ic_hard_red_round);
                            myAchievementAdapter.setSelectedDifficulty(new_playthrough.this.selectedDifficulty,achievementList);
                            break;
                        default:
                            myAchievementAdapter.setSelectedDifficulty(new_playthrough.this.selectedDifficulty,achievementList);
                            break;
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    Log.d("click","NOTHING SELECTED: Difficulty Spinner");
                }
            });

            generateButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Nation finalSelectedNation = new_playthrough.this.selectedNation;
                    Achievement finalSelectedAchievement = new_playthrough.this.selectedAchievement;
                    Difficulty finalSelectedDifficulty = new_playthrough.this.selectedDifficulty;

                    // fail cases
                    Boolean incompatibleDifficulties = ((finalSelectedAchievement.getDifficulty() != finalSelectedDifficulty.getDifficulty()) && selectedAchievement.getName()!="Any");

                    if(incompatibleDifficulties){
                        Log.w("Generation Fail","GENERATION FAIL: incompatibleDifficulties. Setting Difficulty to match Achievement Difficulty");
                    }
                    Log.d("On Click Button","Should Generate Button");

                    final Dialog generatedDialog = new Dialog(getActivity(),android.R.style.Theme_Black_NoTitleBar);
                    generatedDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.argb(160,0,0,0))); // sets gray background
                    generatedDialog.setContentView(R.layout.generate_pop_up);
                    generatedDialog.setCancelable(true);
                    generatedDialog.show();

                    ImageView generatedNationImage = (ImageView) generatedDialog.findViewById(R.id.nationImageView);
                    TextView generatedNationText = (TextView) generatedDialog.findViewById(R.id.generatedNationText);
                    ImageView generatedAchievementImage = (ImageView) generatedDialog.findViewById(R.id.achievementImageView);
                    TextView generatedAchievementText = (TextView) generatedDialog.findViewById(R.id.generatedAchievementText);

                    generatedNationImage.setImageResource(new_playthrough.this.selectedNation.getImageId());
                    generatedNationText.setText(new_playthrough.this.selectedNation.getNationName());

                    generatedAchievementImage.setImageResource(new_playthrough.this.selectedAchievement.getImageId());
                    generatedAchievementText.setText(new_playthrough.this.selectedAchievement.getName());




                }
            });

        }
        return InflatedViewForFinding;
    }
}