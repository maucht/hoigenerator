package com.example.hoigenreal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;


import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener;


import com.google.android.material.bottomnavigation.BottomNavigationView.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView bottomNavigationView = findViewById(R.id.main_bottom_navbar);

        bottomNavigationView.setSelectedItemId(R.id.nav_home);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_frame_layout, new home())
                .commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = new Fragment();
                switch (item.getItemId()) {
                    case R.id.nav_add_playthrough:
                        // Handle the add button
                        selectedFragment = new new_playthrough();
                        Log.d("Nav", "Clicked add");
                        break;
                    case R.id.nav_home:
                        // Handle the home button
                        selectedFragment = new home();
                        Log.d("Nav", "Clicked Home");
                        break;
                    case R.id.nav_achievements:
                        // Handle the achievement button
                        selectedFragment = new achievements();
                        Log.d("Nav", "Clicked achievement");
                        break;
                }
                if(selectedFragment!=null){
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.main_frame_layout,selectedFragment)
                            .commit();
                    return true;
                }
                return false;

            }
        });
    }

}