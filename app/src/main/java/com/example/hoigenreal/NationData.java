package com.example.hoigenreal;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class NationData {
    public static List<Nation> getAllNations(){
        List<Nation> nationList = new ArrayList<>();

        Nation germany = new Nation("Germany",123,0);
        nationList.add(germany);

        Nation france = new Nation("France",123,1);
        nationList.add(france);

        Nation britain = new Nation("United Kingdom",123,2);
        nationList.add(britain);

        Nation america = new Nation("United States", 123,3);
        nationList.add(america);

        Nation italy = new Nation("Italy", 123,4);
        nationList.add(italy);

        Nation sovietUnion = new Nation("Soviet Union", 123,4);
        nationList.add(sovietUnion);

        Nation other = new Nation("Other",123,5);
        nationList.add(other);

        Log.d("DATA","Got all nationList members");
        return nationList;
    }
}
