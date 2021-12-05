package com.example.circlecidemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText FirstInt,SecondInt,Resultat;
    Button Validate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstInt=findViewById(R.id.first_int);
        SecondInt=findViewById(R.id.second_int);
        Resultat=findViewById(R.id.Resultat);
        Validate=findViewById(R.id.Validate);
        Validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long first_int =Long.parseLong(FirstInt.getText().toString());
                long second_int =Long.parseLong(SecondInt.getText().toString());

                Resultat.setText(String.valueOf(Somme(first_int,second_int)));
            }
        });

    }

    public static long Somme(long valeur1, long valeur2) {
      ;
        return  valeur1+valeur2;


    }

}