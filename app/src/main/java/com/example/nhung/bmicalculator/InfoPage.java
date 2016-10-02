package com.example.nhung.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class InfoPage extends AppCompatActivity {

    TextView bmi;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_page);


        Intent intent = getIntent();
        double value = intent.getDoubleExtra("bmi", 0);
        bmi = (TextView) findViewById(R.id.bmiBox);
        bmi.setText(String.format("%.1f",value));



    }
}
