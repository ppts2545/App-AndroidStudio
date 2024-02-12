package com.example.it2113110817_week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class week4B extends AppCompatActivity {

    //step1
    Button myOpenPage4 , myMapTniToHome ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week4_b);

        //step2
        myOpenPage4 = findViewById(R.id.openPage4);
        myMapTniToHome = findViewById(R.id.mapTniToHome);


        //step3
        myOpenPage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(getApplicationContext(),week4C.class);
                startActivity(myintent);
            }
        });

        myMapTniToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}