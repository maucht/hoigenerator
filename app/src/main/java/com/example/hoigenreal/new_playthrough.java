package com.example.hoigenreal;

import android.content.res.Resources;
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
            Spinner spinner_nations = this.InflatedViewForFinding.findViewById(R.id.spinner_nations);
            Spinner spinner_achievements = this.InflatedViewForFinding.findViewById(R.id.spinner_achievements);
            Spinner spinner_difficulties = this.InflatedViewForFinding.findViewById(R.id.spinner_difficulties);
            List<Nation> nationList = NationData.getAllNations();
            List<Achievement> achievementList = AchievementData.getAllAchievements();
            List<Difficulty> difficultyList = DifficultyData.getAllDifficulties();

            Log.d("NATLIST", nationList.get(1).getNationName());
            NationAdapter myNationAdapter = new NationAdapter(getActivity(), nationList,R.style.spinnerDropdownStyle);
            spinner_nations.setAdapter(myNationAdapter);

            spinner_nations.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                    Nation selectedNation = (Nation) adapterView.getSelectedItem();


                    Log.d("Spinner", "Selected nation: " + selectedNation.getNationName());
                    ImageView flagView = InflatedViewForFinding.findViewById(R.id.spinner_flag_preview);

                    switch(selectedNation.getNationName()){
                        case("Germany"):
                            Log.d("Flag Change","Should set flag to germany");
                            flagView.setImageResource(R.mipmap.ic_flag_germany_round);
                            flagView.setColorFilter(0);
                            break;
                        case("Italy"):
                            flagView.setImageResource(R.mipmap.ic_flag_italy_round);
                            flagView.setColorFilter(0);
                            break;
                        case("France"):
                            flagView.setImageResource(R.mipmap.ic_flag_france_round);
                            flagView.setColorFilter(0);
                            break;
                        case("United Kingdom"):
                            flagView.setImageResource(R.mipmap.ic_flag_uk_round);
                            flagView.setColorFilter(0);
                            break;
                        case("America"):
                            flagView.setImageResource(R.mipmap.ic_flag_america_round);
                            flagView.setColorFilter(0);
                            break;
                        case("Japan"):
                            flagView.setImageResource(R.mipmap.ic_flag_japan_round);
                            flagView.setColorFilter(0);
                            break;
                        case("Soviet Union"):
                            flagView.setImageResource(R.mipmap.ic_flag_soviet_round);
                            flagView.setColorFilter(0);
                            break;
                        case("Any"):
                            flagView.setImageResource(R.drawable.star);
                            flagView.setColorFilter(R.color.md_theme_dark_onPrimaryContainer);
                            break;
                    }



                }
                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    Log.d("click", "NOTHING CLICKED");
                }
            });

            AchievementAdapter myAchievementAdapter = new AchievementAdapter(getActivity(),achievementList,R.style.spinnerDropdownStyle);
            spinner_achievements.setAdapter(myAchievementAdapter);
            spinner_achievements.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l){
                    ImageView difficultyImage = InflatedViewForFinding.findViewById(R.id.difficulty_image_view);
                    difficultyImage.setImageResource(R.mipmap.ic_easy_blue_round);
                    Achievement selectedAchievement = (Achievement) adapterView.getSelectedItem();

                    switch(selectedAchievement.getDifficulty()){
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
            DifficultyAdapter myDifficultyAdapter = new DifficultyAdapter(getActivity(),difficultyList,R.style.spinnerDropdownStyle);
            spinner_difficulties.setAdapter(myDifficultyAdapter);
            spinner_difficulties.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                    ImageView difficultySpinnerImage = InflatedViewForFinding.findViewById(R.id.difficulty_spinner_image_view);
                    difficultySpinnerImage.setImageResource(R.mipmap.ic_easy_blue_round);
                    Difficulty selectedDifficulty = (Difficulty) adapterView.getSelectedItem();

                    switch(selectedDifficulty.getName()){
                        case("Easy"):
                            difficultySpinnerImage.setImageResource(R.mipmap.ic_easy_blue_round);
                            break;
                        case("Medium"):
                            difficultySpinnerImage.setImageResource(R.mipmap.ic_medium_orange_round);
                            break;
                        case("Hard"):
                            difficultySpinnerImage.setImageResource(R.mipmap.ic_hard_red_round);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    Log.d("click","NOTHING SELECTED: Difficulty Spinner");
                }
            });

        }
        return InflatedViewForFinding;
    }
}