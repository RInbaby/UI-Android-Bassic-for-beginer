package com.example.inforcie.Activity;

import android.os.Bundle;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


import android.view.MenuItem;

import com.example.inforcie.Fragment.Home_Fragment;
import com.example.inforcie.Fragment.Notificators;
import com.example.inforcie.Fragment.Personal_Fragment;
import com.example.inforcie.Fragment.Setting;
import com.example.inforcie.R;
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
                                loadFragment(new Home_Fragment());
                                return true;
                            case R.id.navigation_personal:
                                loadFragment(new Personal_Fragment());
                                break;
                            case R.id.navigation_notifications:
                                loadFragment(new Notificators());
                                return true;
                            case R.id.navigation_setting:
                                loadFragment(new Setting());

                                break;
                        }
                        return false;
                    }

                });


    }
    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.flFragment, fragment);
        transaction.addToBackStack(null);

        transaction.commit();
    }
}