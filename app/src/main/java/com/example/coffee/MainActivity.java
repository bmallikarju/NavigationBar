package com.example.coffee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.coffee.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;
    private MenuItem item;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new Home());



        binding.bottomNav.setOnItemReselectedListener(item -> {

            if (item.getItemId() == R.id.home){
                replaceFragment(new Home());
            } else if (item.getItemId()==R.id.Cart) {
                replaceFragment(new Cart());
            } else if (item.getItemId()==R.id.Heart) {
                replaceFragment(new Heart());
            } else if (item.getItemId()==R.id.Notification){
                replaceFragment(new Notification());
            }

        });
    }
    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container,fragment);
        fragmentTransaction.commit();
    }
}








