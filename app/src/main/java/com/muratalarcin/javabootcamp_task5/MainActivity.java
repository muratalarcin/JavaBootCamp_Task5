package com.muratalarcin.javabootcamp_task5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.muratalarcin.javabootcamp_task5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



    }
}