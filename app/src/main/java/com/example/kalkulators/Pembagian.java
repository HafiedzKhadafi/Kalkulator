package com.example.kalkulators;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Pembagian extends AppCompatActivity {
    private EditText etangka1, etangka2;
    private Button btnbagi;
    private TextView tvhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembagian);

        etangka1 = findViewById(R.id.angka1);
        etangka2 = findViewById(R.id.angka2);
        btnbagi = findViewById(R.id.btnbagi);
        tvhasil = findViewById(R.id.tvhasil);

        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double angka1;
                    angka1 = Double.parseDouble(etangka1.getText().toString());
                    double angka2;
                    angka2 = Double.parseDouble(etangka2.getText().toString());
                    double hasil = angka1/angka2;

                    tvhasil.setText(String.valueOf(hasil));
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
