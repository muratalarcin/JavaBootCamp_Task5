package com.muratalarcin.javabootcamp_task5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.muratalarcin.javabootcamp_task5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private StringBuilder currentNumber;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        currentNumber = new StringBuilder();

        binding.button0.setOnClickListener(view -> appendNumber("0"));
        binding.button1.setOnClickListener(view -> appendNumber("1"));
        binding.button2.setOnClickListener(view -> appendNumber("2"));
        binding.button3.setOnClickListener(view -> appendNumber("3"));
        binding.button4.setOnClickListener(view -> appendNumber("4"));
        binding.button5.setOnClickListener(view -> appendNumber("5"));
        binding.button6.setOnClickListener(view -> appendNumber("6"));
        binding.button7.setOnClickListener(view -> appendNumber("7"));
        binding.button8.setOnClickListener(view -> appendNumber("8"));
        binding.button9.setOnClickListener(view -> appendNumber("9"));

    }
    private void appendNumber(String number) {
        currentNumber.append(number);
        binding.textViewSonuc.setText(currentNumber.toString());
    }
}