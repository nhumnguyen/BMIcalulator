package com.example.nhung.bmicalculator;

import android.content.Intent;
import android.icu.text.IDNA;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class InfoPage extends AppCompatActivity {

    TextView bmi;
    ImageButton webButton;
    ImageButton backButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_page);


        Intent intent = getIntent();
        double value = intent.getDoubleExtra("bmi", 0);
        bmi = (TextView) findViewById(R.id.bmiBox);
        bmi.setText(String.format("%.1f",value));

        webButton = (ImageButton) findViewById(R.id.webButton);
        webButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.cdc.gov/healthyweight/assessing/bmi/adult_bmi/index.html";
                Intent i = new Intent(Intent.ACTION_VIEW);

                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        backButton = (ImageButton) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(InfoPage.this, MainActivity.class);
                //back.putExtra("bmi", bmi); //passing value
                InfoPage.this.startActivity(back);
            }
        });

    }
}
