package com.example.it2113110817_week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class week5A extends AppCompatActivity {

    //step1
    EditText myfname5,myscore5;
    Button mysend5, myopen5c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week5a);

        //step2
        myfname5 = findViewById(R.id.fname5);
        mysend5 = findViewById(R.id.send5);
        myscore5 = findViewById(R.id.score5);
        myopen5c = findViewById(R.id.open5c);


        //step3
        myopen5c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(getApplicationContext(), week5C.class);
                startActivity(myintent);
                overridePendingTransition(R.anim.in,R.anim.out);
            }
        });
        mysend5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //step4
                String fname = myfname5.getText().toString();
                String myscore = myscore5.getText().toString();
                Intent myintent = new Intent(getApplicationContext(),week5B.class);
                myintent.putExtra( "my_name", fname);
                myintent.putExtra( "my_score", myscore);

                startActivity(myintent);
            }
        });

    }
}