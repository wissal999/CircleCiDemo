package com.example.circlecidemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SommeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_somme);
    }
    public  long Somme( long valeur1, long valeur2) {
        long SommeValeurs=valeur1+valeur2;
        return SommeValeurs;


    }
}