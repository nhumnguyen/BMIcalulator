package com.example.nhung.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView ans;
    EditText weightBox;
    EditText heightBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightBox = (EditText) findViewById(R.id.weightBox);
        heightBox = (EditText) findViewById(R.id.heightBox);
        ans = (TextView) findViewById(R.id.ansBox);
        Button calculator = (Button) findViewById(R.id.calBut);

        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float feet = Float.parseFloat(heightBox.getText().toString());
                float weight = Float.parseFloat(weightBox.getText().toString());

                double bmi = (weight * 703) / Math.pow((feet * 12), 2);
                ans.setText(String.format("%.1f", bmi));

            }
        });


        //radio group
        Button weightSelected = (Button) findViewById(R.id.weightBox);

    }
}
