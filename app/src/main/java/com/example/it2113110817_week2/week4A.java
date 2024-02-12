package com.example.it2113110817_week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class week4A extends AppCompatActivity {

    //step1
    Button myopenB,myviewAD,mymapIMG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week4a);

        //step2
        myopenB = findViewById(R.id.openB);
        myviewAD = findViewById(R.id.viewAD);
        mymapIMG = findViewById(R.id.mapIMG);

        //step3 week4B
        myviewAD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String geocode = "geo:0, 0?q=seacon srinakarin";
                Intent myintent = new Intent(Intent.ACTION_VIEW, Uri.parse(geocode));
                startActivity(myintent);
            }
        });

        //step3 week4C
        mymapIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String geocode = "http://maps.google.com/maps?saddr=13.73843348429446,100.62914011479177&daddr=13.695648187143538,100.64818207908402";
                Intent myintent = new Intent(Intent.ACTION_VIEW,Uri.parse(geocode));
                startActivity(myintent);
            }
        });


        //step3
        myopenB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(getApplicationContext(),week4B.class);
                startActivity(myintent);
            }
        });
    }
}