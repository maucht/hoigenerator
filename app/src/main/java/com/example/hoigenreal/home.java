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

    public List<Generation> generatedList = null;

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

        LinearLayout playthroughItemsLinearLayout = InflatedViewForFinding.findViewById(R.id.playthroughItemLinearLayout);
        if(InflatedViewForFinding!=null) {
            if (generatedList.size() > 0) {
                for (Generation currGeneration : generatedList) {
                    Log.i("HOME FRAGMENT", "SHOULD RENDER PLAYTHROUGH ITEM");
                    View playthroughItem = getLayoutInflater().inflate(R.layout.playthrough_item, playthroughItemsLinearLayout, false);

                    ImageView playthroughItemImage = playthroughItem.findViewById(R.id.item_image);
                    playthroughItemImage.setImageResource(currGeneration.getGeneratedNation().getImageId());

                    TextView playthroughItemNationText = playthroughItem.findViewById(R.id.item_title);
                    playthroughItemNationText.setText(currGeneration.getGeneratedNation().getNationName());

                    playthroughItemsLinearLayout.addView(playthroughItem);
                }
            }
        }
        return InflatedViewForFinding;
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
}