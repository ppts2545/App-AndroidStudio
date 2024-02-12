package com.example.it2113110817_week2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class week2 extends AppCompatActivity {


    //step 1
    EditText mytoT, mysubT, mymesT;
    Button mysendBT;
    TextView myshowTV;

    Spinner mySP1 , mySP2;

    CheckBox myCB1, myCB2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week2);


        //step 2
        mytoT = findViewById(R.id.toT);
        mysubT = findViewById(R.id.SubT);
        mymesT = findViewById(R.id.mesT);
        mysendBT = findViewById(R.id.sendBT);
        myshowTV = findViewById(R.id.showTV);
        mySP1 = findViewById(R.id.SP1);
        mySP2 = findViewById(R.id.SP2);
        myCB1 = findViewById(R.id.CB1);
        myCB2 = findViewById(R.id.CB2);

        //step3 for CB1
        myCB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //step4
                String check1 = myCB1.getText().toString();
                boolean checked = myCB1.isChecked();

                //myshowTV.setText(check1+" is "+checked);
                Toast.makeText(getApplicationContext(), check1+" is "+checked,Toast.LENGTH_SHORT).show();
            }
        });
        myCB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String check2 = myCB2.getText().toString();
                boolean checked = myCB2.isChecked();

                Toast.makeText(getApplicationContext(), check2+" is "+checked,Toast.LENGTH_SHORT).show();
            }
        });

        //step 3
        mysendBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //step4
                String text1 = mytoT.getText().toString();
                String text2 = mysubT.getText().toString();
                String text3 = mymesT.getText().toString();
                String team = mySP1.getSelectedItem().toString();
                String car = mySP2.getSelectedItem().toString();


                myshowTV.setText("Mister :" + text1 + "Your Subject is" + text2 + "ok" + text3
                +"Team is " + team + "you like " + car);
            }
        });


    }

}

