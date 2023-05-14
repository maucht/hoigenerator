package com.example.hoigenreal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link completed#newInstance} factory method to
 * create an instance of this fragment.
 */
public class completed extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private static final String COMPLETED_LIST = "completed list";
    private List<Generation> completedList;

    private View InflatedViewForViewing;

    public completed() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment completed.
     */
    // TODO: Rename and change types and number of parameters
    public static completed newInstance(String param1, String param2) {
        completed fragment = new completed();
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
        InflatedViewForViewing = inflater.inflate(R.layout.fragment_completed, container, false);
        completed.this.loadCompletedListData();
        View activeHeader = InflatedViewForViewing.findViewById(R.id.activeHeader);
        activeHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                completed.this.switchCompleteToActiveFragment();
            }
        });
        if(InflatedViewForViewing!=null){

        }
        return InflatedViewForViewing;
    }

    private void switchCompleteToActiveFragment(){
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_frame_layout,new home())
                .commit();
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
}