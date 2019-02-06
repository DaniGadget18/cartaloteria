package com.example.danielrdz.cartaloteria;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

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


        carta1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                carta1.setImageResource(R.drawable.build);
            }
        });

        carta2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                carta2.setImageResource(R.drawable.build);
            }
        });

        carta3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                carta3.setImageResource(R.drawable.build);
            }
        });

        carta4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                carta4.setImageResource(R.drawable.build);
            }
        });
        carta5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                carta5.setImageResource(R.drawable.build);
            }
        });
        carta6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                carta6.setImageResource(R.drawable.build);
            }
        });
        carta7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                carta7.setImageResource(R.drawable.build);
            }
        });
        carta8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                carta8.setImageResource(R.drawable.build);
            }
        });
        carta9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                carta9.setImageResource(R.drawable.build);
            }
        });
        carta10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                carta10.setImageResource(R.drawable.build);
            }
        });
        carta11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                carta11.setImageResource(R.drawable.build);
            }
        });
        carta12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                carta12.setImageResource(R.drawable.build);
            }
        });
        }

    public void reiniciar(View view) {
        carta1.setImageResource(R.drawable.apache);
        carta2.setImageResource(R.drawable.arbol);
        carta3.setImageResource(R.drawable.luna);
        carta4.setImageResource(R.drawable.arana);
        carta5.setImageResource(R.drawable.arpa);
        carta6.setImageResource(R.drawable.maceta);
        carta7.setImageResource(R.drawable.bandera);
        carta8.setImageResource(R.drawable.jaras);
        carta9.setImageResource(R.drawable.camaron);
        carta10.setImageResource(R.drawable.escalera);
        carta11.setImageResource(R.drawable.mano);
        carta12.setImageResource(R.drawable.garza);
    }
}
