package com.example.addrestaurantfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gotoAddFragment();

    }
    private void gotoAddFragment(){
        FragmentTransaction ft= getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.framelayout,new AddRestaurantFragment());
        ft.commit();
    }


}