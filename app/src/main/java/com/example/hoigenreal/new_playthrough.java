package com.example.hoigenreal;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    public List<Generation> generatedAchievementList;

    public static final String GENERATION_LIST = "generation list";

    public boolean showDialog=true;

    public Nation selectedNation;
    public Achievement selectedAchievement;
    public Difficulty selectedDifficulty;

    public List<Nation> listOfAllNations;
    public List<Achievement> listOfAllAchievements; // THESE 3 ARE ONLY USED IN GENERATION
    public List<Difficulty> listOfAllDifficulties;

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
        loadListData();

        InflatedViewForFinding = inflater.inflate(R.layout.fragment_new_playthrough, container, false);
        if(InflatedViewForFinding!=null) {
            View generateButton = this.InflatedViewForFinding.findViewById(R.id.submitGenerationButton);

            Spinner spinner_nations = this.InflatedViewForFinding.findViewById(R.id.spinner_nations);
            Spinner spinner_achievements = this.InflatedViewForFinding.findViewById(R.id.spinner_achievements);
            Spinner spinner_difficulties = this.InflatedViewForFinding.findViewById(R.id.spinner_difficulties);
            List<Nation> nationList = NationData.getAllNations();
            List<Achievement> achievementList = AchievementData.getAllAchievements();
            List<Difficulty> difficultyList = DifficultyData.getAllDifficulties();

            this.listOfAllNations=nationList;
            this.listOfAllAchievements=achievementList;
            this.listOfAllDifficulties=difficultyList;

            this.selectedNation = nationList.get(0);
            this.selectedAchievement = achievementList.get(0);
            this.selectedDifficulty = difficultyList.get(0);

            Log.d("NATLIST", nationList.get(1).getNationName());

            NationAdapter myNationAdapter = new NationAdapter(getActivity(), nationList,R.style.spinnerDropdownStyle);
            AchievementAdapter myAchievementAdapter = new AchievementAdapter(getActivity(),achievementList,R.style.spinnerDropdownStyle,this.selectedDifficulty,this.selectedNation);
            DifficultyAdapter myDifficultyAdapter = new DifficultyAdapter(getActivity(),difficultyList,R.style.spinnerDropdownStyle);



            spinner_nations.setAdapter(myNationAdapter);

            spinner_nations.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                    new_playthrough.this.selectedNation = (Nation) adapterView.getSelectedItem();


                    Log.d("Spinner", "Selected nation: " + selectedNation.getNationName());
                    ImageView flagView = InflatedViewForFinding.findViewById(R.id.spinner_flag_preview);
                    flagView.setImageResource(new_playthrough.this.selectedNation.getImageId());
                    myAchievementAdapter.setSelectedChange(new_playthrough.this.selectedDifficulty,new_playthrough.this.selectedNation,achievementList);
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
                            myAchievementAdapter.setSelectedChange(new_playthrough.this.selectedDifficulty,new_playthrough.this.selectedNation,achievementList);
                            break;
                        case("Medium"):
                            difficultySpinnerImage.setImageResource(R.mipmap.ic_medium_orange_round);
                            myAchievementAdapter.setSelectedChange(new_playthrough.this.selectedDifficulty,new_playthrough.this.selectedNation,achievementList);
                            break;
                        case("Hard"):
                            difficultySpinnerImage.setImageResource(R.mipmap.ic_hard_red_round);
                            myAchievementAdapter.setSelectedChange(new_playthrough.this.selectedDifficulty,new_playthrough.this.selectedNation,achievementList);
                            break;
                        default:
                            myAchievementAdapter.setSelectedChange(new_playthrough.this.selectedDifficulty,new_playthrough.this.selectedNation,achievementList);
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
                    new_playthrough.this.showDialog=true;

                    // fail cases - absurd levels of spaghetti code below
                    Boolean incompatibleDifficulties = ((new_playthrough.this.selectedAchievement.getDifficulty() != new_playthrough.this.selectedDifficulty.getDifficulty()) && selectedAchievement.getName()!="Any");


                    Random randomObj = new Random();
                    if(incompatibleDifficulties){
                        Log.w("Generation Fail","GENERATION FAIL: incompatibleDifficulties. Setting Difficulty to match Achievement Difficulty");
                    }
                    // Given None
                    // Given Achievement
                    if(new_playthrough.this.selectedDifficulty.getName()=="Any" && new_playthrough.this.selectedNation.getNationName()=="Any"){ // this tree will decide everything. no need for another

                        int randomDifficultyPos = randomObj.nextInt(3)+1;
                        new_playthrough.this.selectedDifficulty = new_playthrough.this.listOfAllDifficulties.get(randomDifficultyPos);
                        Log.i("Generating Random","Difficulty: "+new_playthrough.this.selectedDifficulty.getName());

                        if(new_playthrough.this.selectedAchievement.getName()=="Any") { // Given none

                            if (new_playthrough.this.selectedNation.getNationName() == "Any") {
                                List<Achievement> suitableRandomAchievements = new ArrayList<>();

                                for (Achievement currAchievement : new_playthrough.this.listOfAllAchievements) {
                                    if (currAchievement.getDifficulty() == new_playthrough.this.selectedDifficulty.getName()) {
                                        suitableRandomAchievements.add(currAchievement);
                                    }
                                }

                                int randomAchievementPos = randomObj.nextInt(suitableRandomAchievements.size() - 1) + 1;
                                new_playthrough.this.selectedAchievement = new_playthrough.this.listOfAllAchievements.get(randomAchievementPos);
                                Log.i("Generating Random", "Random Achievement Pool Size: " + suitableRandomAchievements.size());
                                Log.i("Generating Random", "Random Achievement Generated: " + new_playthrough.this.selectedAchievement);
                                // generate nation based on achievement pulled
                                List<String> validNationList = new_playthrough.this.selectedAchievement.getValidNationList();
                                int validNationListSize = validNationList.size();
                                int randomNationPos = randomObj.nextInt(validNationListSize);
                                String selectedNationString = validNationList.get(randomNationPos);
                                Log.i("Generating Random","FULL VALID NATION LIST: "+validNationList);
                                Log.i("Generating Random","GENERATED NATION: "+selectedNationString);
                                if(selectedNationString=="Other"){
                                    new_playthrough.this.selectedNation = new_playthrough.this.selectedAchievement.getSpecificOtherNation();
                                }
                                else { // Given Achievement
                                    for (Nation currNation : new_playthrough.this.listOfAllNations) {
                                        if (currNation.getNationName() == selectedNationString) {
                                            new_playthrough.this.selectedNation = currNation;
                                            Log.i("Generating Random", "RANDOM NATION: " + currNation);
                                            break;
                                        }
                                    }
                                }



                            }
                        }
                    }

                    // Given Nation
                    // Given Achievement and Nation Name
                    if(new_playthrough.this.selectedDifficulty.getName()=="Any" && new_playthrough.this.selectedNation.getNationName()!="Any"){
                        if(new_playthrough.this.selectedAchievement.getName()=="Any"){ // Given Nation Name
                            // get nation name
                            // generate achievement for that nation
                            // set difficulty according to drawn achievement

                            List<Achievement> suitableAchievementList = new ArrayList<>();
                            for(Achievement currAchievement : new_playthrough.this.listOfAllAchievements){
                                if(currAchievement.getValidNationList().contains(new_playthrough.this.selectedNation.getNationName())
                                ){
                                    suitableAchievementList.add(currAchievement);
                                }
                            }
                            if(suitableAchievementList.size()==0){
                                Toast.makeText(getContext(),"No valid ach. for given fields. Setting diff. to Medium", Toast.LENGTH_SHORT).show();
                                new_playthrough.this.selectedDifficulty = new_playthrough.this.listOfAllDifficulties.get(2);

                                for(Achievement currAchievement : new_playthrough.this.listOfAllAchievements){
                                    if(currAchievement.getDifficulty() == new_playthrough.this.selectedDifficulty.getName()
                                            && currAchievement.getValidNationList().contains(new_playthrough.this.selectedNation.getNationName())
                                    ){
                                        suitableAchievementList.add(currAchievement);
                                    }
                                }

                            } // This shouldnt even happen.

                            int randomAchievementPos = randomObj.nextInt(suitableAchievementList.size()-1)+1;
                            new_playthrough.this.selectedAchievement = suitableAchievementList.get(randomAchievementPos);

                            switch(new_playthrough.this.selectedAchievement.getDifficulty()){
                                case("Easy"):
                                    new_playthrough.this.selectedDifficulty = new_playthrough.this.listOfAllDifficulties.get(1);
                                    break;
                                case("Medium"):
                                    new_playthrough.this.selectedDifficulty = new_playthrough.this.listOfAllDifficulties.get(2);
                                    break;
                                case("Hard"):
                                    new_playthrough.this.selectedDifficulty = new_playthrough.this.listOfAllDifficulties.get(3);
                                    break;
                            } // sets difficulty based on achievement

                        }
                        else{ // Given Achievement and Nation Name
                            // set difficulty
                            // ??
                            // profit
                            switch(new_playthrough.this.selectedAchievement.getDifficulty()){
                                case("Easy"):
                                    new_playthrough.this.selectedDifficulty = new_playthrough.this.listOfAllDifficulties.get(1);
                                    break;
                                case("Medium"):
                                    new_playthrough.this.selectedDifficulty = new_playthrough.this.listOfAllDifficulties.get(2);
                                    break;
                                case("Hard"):
                                    new_playthrough.this.selectedDifficulty = new_playthrough.this.listOfAllDifficulties.get(3);
                                    break;
                            }

                        }
                    }

                    // Given Nation and Difficulty
                    if(new_playthrough.this.selectedAchievement.getName()=="Any" &&
                        new_playthrough.this.selectedNation.getNationName()!="Any" &&
                            new_playthrough.this.selectedDifficulty.getName()!="Any"
                    ){
                        List<Achievement> suitableAchievementList = new ArrayList<>();
                        for(Achievement currAchievement: new_playthrough.this.listOfAllAchievements){
                            if(currAchievement.getDifficulty() == new_playthrough.this.selectedDifficulty.getName()
                            && currAchievement.getValidNationList().contains(new_playthrough.this.selectedNation.getNationName())
                            ){
                                suitableAchievementList.add(currAchievement);
                            }
                        }
                        // FIX THIS: Nation-difficulty pairs without achievement pool will crash this.
                        // Roll back difficulty to medium to fix this.
                        int randomAchievementPos = randomObj.nextInt(suitableAchievementList.size());
                        new_playthrough.this.selectedAchievement = suitableAchievementList.get(randomAchievementPos);
                    }
                    // Given Difficulty
                    if(new_playthrough.this.selectedDifficulty.getName()!="Any"
                    && new_playthrough.this.selectedNation.getNationName() == "Any"
                    && new_playthrough.this.selectedAchievement.getName()=="Any"
                    ){
                        // set achievement
                        // set nation based on achievement nation list
                        List<Achievement> suitableAchievementList = new ArrayList<>();
                        for(Achievement currAchievement: new_playthrough.this.listOfAllAchievements){
                            if(currAchievement.getDifficulty() == new_playthrough.this.selectedDifficulty.getName()){
                                suitableAchievementList.add(currAchievement);
                            }
                        }
                        int randomAchievementPos = randomObj.nextInt(suitableAchievementList.size());
                        new_playthrough.this.selectedAchievement = suitableAchievementList.get(randomAchievementPos);
                        Log.i("GENERATING RANDOM","ACHIEVEMENT: "+new_playthrough.this.selectedAchievement.getName());

                    }
                    // Given Achievement and Difficulty
                    if(new_playthrough.this.selectedNation.getNationName()=="Any"){
                        Log.i("GENERATING RANDOM","INSIDE GIVEN ACH AND DIFF");

                        List<Nation> suitableNations = new ArrayList<>();
                        for(Nation currNation : new_playthrough.this.listOfAllNations){

                            if(new_playthrough.this.selectedAchievement.getValidNationList().contains(currNation.getNationName())){
                                suitableNations.add(currNation);
                            }
                        }
                        if(suitableNations.size()==0){
                            Log.i("GENERATING RANDOM","INSIDE GIVEN ACH AND DIFF IF BRACKET");
                            new_playthrough.this.selectedNation=new_playthrough.this.selectedAchievement.getSpecificOtherNation();
                        }
                        else {
                            Log.i("GENERATING RANDOM","INSIDE GIVEN ACH AND DIFF ELSE BRACKET");
                            int randomNationPos = randomObj.nextInt(suitableNations.size()); // other not in allNations
                            new_playthrough.this.selectedNation = suitableNations.get(randomNationPos); // not good
                        }

                        switch(new_playthrough.this.selectedAchievement.getDifficulty()){
                            case("Easy"):
                                new_playthrough.this.selectedDifficulty = new_playthrough.this.listOfAllDifficulties.get(1);
                                break;
                            case("Medium"):
                                new_playthrough.this.selectedDifficulty = new_playthrough.this.listOfAllDifficulties.get(2);
                                break;
                            case("Hard"):
                                new_playthrough.this.selectedDifficulty = new_playthrough.this.listOfAllDifficulties.get(3);
                                break;
                        } // sets difficulty based on achievement
                    }

                    Log.d("On Click Button","Should Generate Button");

                    Nation finalSelectedNation = new_playthrough.this.selectedNation;
                    Achievement finalSelectedAchievement = new_playthrough.this.selectedAchievement;
                    Difficulty finalSelectedDifficulty = new_playthrough.this.selectedDifficulty;

                    final Dialog generatedDialog = new Dialog(getActivity(),android.R.style.Theme_Black_NoTitleBar);
                    generatedDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.argb(160,0,0,0))); // sets gray background
                    generatedDialog.setContentView(R.layout.generate_pop_up);
                    generatedDialog.setCancelable(true);
                    generatedDialog.show();

                    Button goBackButton = generatedDialog.findViewById(R.id.goBackButton);
                    Button saveButton = generatedDialog.findViewById(R.id.acceptButton);

                    goBackButton.setOnClickListener(new View.OnClickListener() { // GO BACK
                        @Override
                        public void onClick(View v) {
                            Log.d("CLICKED","CLICKED GO BACK");
                            new_playthrough.this.showDialog = false;
                            Log.d("Nav","Current Dialog state: "+new_playthrough.this.showDialog);
                            generatedDialog.hide();
                        }
                    });

                    saveButton.setOnClickListener(new View.OnClickListener() { // SAVE GENERATION
                        @Override
                        public void onClick(View v) {
                            saveData(new Generation(new_playthrough.this.generatedAchievementList.size()+ randomObj.nextInt(100000),new_playthrough.this.selectedNation,
                                    new_playthrough.this.selectedAchievement,
                                    new_playthrough.this.selectedDifficulty));
                            Toast.makeText(getContext(),"Added Playthrough", Toast.LENGTH_SHORT).show();
                            generatedDialog.hide();
                            new_playthrough.this.selectedDifficulty=new_playthrough.this.listOfAllDifficulties.get(0);
                            new_playthrough.this.selectedAchievement=new_playthrough.this.listOfAllAchievements.get(0);
                            new_playthrough.this.selectedNation=new_playthrough.this.listOfAllNations.get(0);
                        }
                    });

                    ImageView generatedNationImage = (ImageView) generatedDialog.findViewById(R.id.nationImageView);
                    TextView generatedNationText = (TextView) generatedDialog.findViewById(R.id.generatedNationText);
                    ImageView generatedAchievementImage = (ImageView) generatedDialog.findViewById(R.id.achievementImageView);
                    TextView generatedAchievementText = (TextView) generatedDialog.findViewById(R.id.generatedAchievementText);

                    generatedNationImage.setImageResource(new_playthrough.this.selectedNation.getImageId());
                    generatedNationText.setText(new_playthrough.this.selectedNation.getNationName());

                    generatedAchievementImage.setImageResource(new_playthrough.this.selectedAchievement.getImageId());
                    generatedAchievementText.setText(new_playthrough.this.selectedAchievement.getName());

                    LinearLayout instructionBox = generatedDialog.findViewById(R.id.instruction_box);
                    instructionBox.removeAllViews();

                    // GIVES ME NO INSTRUCTIONS
                    Log.d("DELETE THIS","INSUTRCTIONS: "+new_playthrough.this.selectedAchievement.getInstructions().get(0));

                    for(String currInstruction : new_playthrough.this.selectedAchievement.getInstructions()){
                        Log.d("UHHH","currInstruction: "+currInstruction);
                        View instructionView = inflater.inflate(R.layout.instruction_layout, instructionBox, false);

                        TextView instructionText = instructionView.findViewById(R.id.instruction_layout_text);
                        instructionText.setText(currInstruction);

                        instructionBox.addView(instructionView);
                    }





                }
            });

        }
        return InflatedViewForFinding;
    }
    private void saveData(Generation newGeneration){
        SharedPreferences mySharedPreferences = getContext().getSharedPreferences("shared preferences", Context.MODE_PRIVATE);
        SharedPreferences.Editor sharedPreferencesEditor = mySharedPreferences.edit();
        Gson gson = new Gson();
        // Create Json by appending new data to loaded Json data
        this.generatedAchievementList.add(newGeneration);
        String json = gson.toJson(this.generatedAchievementList);
        sharedPreferencesEditor.putString(GENERATION_LIST,json);
        sharedPreferencesEditor.apply();


    }
    private void loadListData(){
        SharedPreferences mySharedPreferences = getContext().getSharedPreferences("shared preferences", Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json = mySharedPreferences.getString(GENERATION_LIST,null);
        Type type = new TypeToken<ArrayList<Generation>>() {}.getType();
        generatedAchievementList = gson.fromJson(json,type);


        if(generatedAchievementList==null){
            generatedAchievementList = new ArrayList<>();
        }

    }
}