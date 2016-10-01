package com.example.nhung.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView ans;
    EditText feetTxt;
    EditText inchesTxt;
    EditText poundsTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
        feetTxt = (EditText) findViewById(R.id.feetTxt);
        inchesTxt = (EditText) findViewById(R.id.inchesTxt);
        poundsTxt = (EditText) findViewById(R.id.poundTxt);
        ans = (TextView) findViewById(R.id.ans);


        Button calculator = (Button) findViewById(R.id.button7);
        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double feet = Float.parseFloat(feetTxt.getText().toString());
                double inches = Float.parseFloat(inchesTxt.getText().toString());
                double weight = Float.parseFloat(poundsTxt.getText().toString());

                double totalHeight = (feet * 12) + inches;
                double bmi = (weight * 0.45) / Math.pow((totalHeight * 0.025), 2);
                System.out.println(bmi);
                ans.setText(String.format("%.2f", bmi));

            }

        });

    }
}
