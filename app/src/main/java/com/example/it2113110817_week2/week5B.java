package com.example.it2113110817_week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class week5B extends AppCompatActivity {

    //step1
    TextView myresult5b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week5_b);

        //step2
        myresult5b = findViewById(R.id.result5b);

        //step 3-4
        Intent intent = getIntent();
        String temp1 = intent.getStringExtra("my_name");
        String temp2 = intent.getStringExtra("my_score");
        myresult5b.setText("Hi , "+temp1 +"You got" + temp2 + "Score");
    }
}