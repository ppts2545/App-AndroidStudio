package com.example.it2113110817_week2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Week4 extends AppCompatActivity {

    //step1
    EditText mynum1 , mynum2;
    Button myplus, myminus, mypower, mydivide;
    TextView mytotal1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week4);

        //step2
        mynum1 = findViewById(R.id.num1);
        mynum2 =  findViewById(R.id.num2);
        myplus = findViewById(R.id.plus);
        myminus = findViewById(R.id.minus);
        mypower = findViewById(R.id.power);
        mydivide = findViewById(R.id.divide);
        mytotal1 = findViewById(R.id.total1);


        //step3 for plus
        myplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //step4
                if(mynum1.getText().toString().equals("")){
                   mynum1.setError("Num1 is empty");
                }
                else if (mynum2.getText().toString().equals("")) {
                   mynum2.setError("Num2 is empty");
                }

                else {
                    int num1 = Integer.parseInt(mynum1.getText().toString());
                    int num2 = Integer.parseInt(mynum2.getText().toString());

                    int total = num1+num2;

                    mytotal1.setText("Result = "+total);}
                }

        });
        myminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mynum1.getText().toString().equals("")){
                    mynum1.setError("Num1 is empty");
                }
                else if (mynum2.getText().toString().equals("")) {
                    mynum2.setError("Num2 is empty");
                }

                else {
                    int num1 = Integer.parseInt(mynum1.getText().toString());
                    int num2 = Integer.parseInt(mynum2.getText().toString());

                    int total = num1-num2;

                    mytotal1.setText("Result = "+total);}
            }



        });

        mypower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mynum1.getText().toString().equals("")){
                    mynum1.setError("Num1 is empty");
                }
                else if (mynum2.getText().toString().equals("")) {
                    mynum2.setError("Num2 is empty");
                }

                else {
                    int num1 = Integer.parseInt(mynum1.getText().toString());
                    int num2 = Integer.parseInt(mynum2.getText().toString());

                    int total = num1*num2;

                    mytotal1.setText("Result = "+total);}
            }
        });

        mydivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mynum1.getText().toString().equals("")){
                    mynum1.setError("Num1 is empty");
                }
                else if (mynum2.getText().toString().equals("")) {
                    mynum2.setError("Num2 is empty");
                }

                else {
                    float num1 = Float.parseFloat(mynum1.getText().toString());
                    float num2 = Float.parseFloat(mynum2.getText().toString());

                    float total = num1/num2;

                    mytotal1.setText("Result = "+String.format("%.2f", total));
                }

            }
        });
    }

}