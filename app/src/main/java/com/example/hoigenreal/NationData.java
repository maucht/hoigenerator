package com.example.hoigenreal;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class NationData {
    public static List<Nation> getAllNations(){
        List<Nation> nationList = new ArrayList<>();

        Nation any = new Nation("Any",R.drawable.star,0);
        nationList.add(any);


        Nation germany = new Nation("Germany",R.mipmap.ic_flag_germany_round,1);
        nationList.add(germany);

        Nation france = new Nation("France",R.mipmap.ic_flag_france_round,2);
        nationList.add(france);

        Nation britain = new Nation("United Kingdom",R.mipmap.ic_flag_uk_round,3);
        nationList.add(britain);

        Nation america = new Nation("United States", R.mipmap.ic_flag_america_round,4);
        nationList.add(america);

        Nation italy = new Nation("Italy", R.mipmap.ic_flag_italy_round,5);
        nationList.add(italy);

        Nation sovietUnion = new Nation("Soviet Union", R.mipmap.ic_flag_soviet_round,6);
        nationList.add(sovietUnion);


        Log.d("DATA","Got all nationList members");
        return nationList;
    }
}
