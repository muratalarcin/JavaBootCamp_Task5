package com.muratalarcin.javabootcamp_task5;

import static android.service.controls.ControlsProviderService.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.muratalarcin.javabootcamp_task5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private StringBuilder sonuc;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        sonuc = new StringBuilder();


        binding.button0.setOnClickListener(view -> sayiEkleme("0"));
        binding.button1.setOnClickListener(view -> sayiEkleme("1"));
        binding.button2.setOnClickListener(view -> sayiEkleme("2"));
        binding.button3.setOnClickListener(view -> sayiEkleme("3"));
        binding.button4.setOnClickListener(view -> sayiEkleme("4"));
        binding.button5.setOnClickListener(view -> sayiEkleme("5"));
        binding.button6.setOnClickListener(view -> sayiEkleme("6"));
        binding.button7.setOnClickListener(view -> sayiEkleme("7"));
        binding.button8.setOnClickListener(view -> sayiEkleme("8"));
        binding.button9.setOnClickListener(view -> sayiEkleme("9"));
        binding.buttonToplama.setOnClickListener(view -> sayiEkleme(" + "));


    }
    private void sayiEkleme(String sayi) {
        sonuc.append(sayi);
        binding.textViewSonuc.setText(sonuc.toString());
    }
}