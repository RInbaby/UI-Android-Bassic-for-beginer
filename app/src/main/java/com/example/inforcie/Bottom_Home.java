package com.example.inforcie;

import android.os.Bundle;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Bottom_Home extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    //fragment
    Home_Fragment home_fragment;
    Personal_Fragment personal_fragment;////

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom__home);

        //Initializing the bottomNavigationView
        bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.navigation_home:
                                //viewPager.setCurrentItem(0);
                                break;
                            case R.id.navigation_personal:
                               // viewPager.setCurrentItem(1);
                                break;
                            case R.id.navigation_notifications:
                               // viewPager.setCurrentItem(2);
                            case R.id.navigation_setting:
                               // viewPager.setCurrentItem(2);
                                break;
                        }
                        return false;
                    }

                });


    }
}