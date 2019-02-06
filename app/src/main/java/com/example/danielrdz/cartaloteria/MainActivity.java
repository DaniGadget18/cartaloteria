package com.example.danielrdz.cartaloteria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton carta1,carta2,carta3,carta4,carta5,carta6,carta7,carta8,carta9,carta10,carta11,carta12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carta1 = findViewById(R.id.carta1);
        carta2 = findViewById(R.id.carta2);
        carta3 = findViewById(R.id.carta3);
        carta4 = findViewById(R.id.carta4);
        carta5 = findViewById(R.id.carta5);
        carta6 = findViewById(R.id.carta6);
        carta7 = findViewById(R.id.carta7);
        carta8 = findViewById(R.id.carta8);
        carta9 = findViewById(R.id.carta9);
        carta10 = findViewById(R.id.carta10);
        carta11 = findViewById(R.id.carta11);
        carta12 = findViewById(R.id.carta12);


        }

    @Override
    public void onClick(View v) {

        ImageButton frijol = new ImageButton();



    }


}
