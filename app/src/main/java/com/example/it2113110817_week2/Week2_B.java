package com.example.it2113110817_week2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Week2_B extends AppCompatActivity {

    //step 1
    Button myredBT,myblueBT,mygreenBT,myyellowBT,mypinkBT;
    ImageView myimgV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week2_b);

        //step 2
        myredBT = findViewById(R.id.redBT);
        myblueBT = findViewById(R.id.blueBT);
        mygreenBT = findViewById(R.id.greenBT);
        myyellowBT = findViewById(R.id.yellowBT);
        mypinkBT = findViewById(R.id.pinkBT);
        myimgV = findViewById(R.id.imgV);

        //step 3 for red BT
        myredBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //step 4
                myimgV.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.red_car));
            }
        });
        myblueBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //step 4
                myimgV.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.blue_car));
            }
        });
        mygreenBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //step 4
                myimgV.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.green_car));
            }
        });
        myyellowBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //step 4
                myimgV.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.yellow_car));
            }
        });
        mypinkBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //step 4
                myimgV.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.pink_car));
            }
        });






    }
}