package com.example.hoigenreal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
        // Required empty public constructor
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
        this.InflatedViewForFinding = inflater.inflate(R.layout.fragment_new_playthrough, container, false);
        if(InflatedViewForFinding!=null) {
            Spinner spinner_nations = this.InflatedViewForFinding.findViewById(R.id.spinner_nations);
            List<Nation> nationList = NationData.getAllNations();
            Log.d("NATLIST", nationList.get(1).getNationName());
            NationAdapter myNationAdapter = new NationAdapter(getActivity(), nationList,R.style.spinnerDropdownStyle);

            spinner_nations.setAdapter(myNationAdapter);

            spinner_nations.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    String selectedNation = adapterView.getItemAtPosition(i).toString();
                    Log.d("Spinner", "Selected nation: " + selectedNation);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    Log.d("click", "NOTHING CLICKED");
                }
            });
        }
        return InflatedViewForFinding;
    }
}