package com.example.danielrdz.cartaloteria;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton carta1,carta2,carta3,carta4,carta5,carta6,carta7,carta8,carta9,carta10,carta11,carta12;
    int num1=0, num2=0, num3=0, num4=0, num5=0, num6=0, num7=0, num8=0, num9=0, num10=0, num11=0, num12=0, ganador=1;

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
                if (num1==0){
                    carta1.setImageResource(R.drawable.build);
                    num1=1;
                }
                else{
                    carta1.setImageResource(R.drawable.apache);
                    num1=0;
                }

            }
        });

        carta2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (num2==0){
                    carta2.setImageResource(R.drawable.build);
                    num2=1;
                    ganador++;
                }
                else{
                    carta2.setImageResource(R.drawable.arbol);
                    num2=0;
                    ganador--;
                }
            }
        });

        carta3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (num3==0){
                    carta3.setImageResource(R.drawable.build);
                    num3=1;
                    ganador++;
                }
                else{
                    carta3.setImageResource(R.drawable.luna);
                    num3=0;
                    ganador--;
                }
            }
        });

        carta4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (num4==0){
                    carta4.setImageResource(R.drawable.build);
                    num4=1;
                    ganador++;
                }
                else{
                    carta4.setImageResource(R.drawable.arana);
                    num4=0;
                    ganador--;
                }
            }
        });
        carta5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (num5==0){
                    carta5.setImageResource(R.drawable.build);
                    num5=1;
                    ganador++;
                }
                else{
                    carta5.setImageResource(R.drawable.arpa);
                    num5=0;
                    ganador--;
                }
            }
        });
        carta6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (num6==0){
                    carta6.setImageResource(R.drawable.build);
                    num6=1;
                    ganador++;
                }
                else{
                    carta6.setImageResource(R.drawable.maceta);
                    num6=0;
                    ganador--;
                }
            }
        });
        carta7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (num7==0){
                    carta7.setImageResource(R.drawable.build);
                    num7=1;
                    ganador++;
                }
                else{
                    carta7.setImageResource(R.drawable.bandera);
                    num7=0;
                    ganador--;
                }
            }
        });
        carta8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (num8==0){
                    carta8.setImageResource(R.drawable.build);
                    num8=1;
                    ganador++;
                }
                else{
                    carta8.setImageResource(R.drawable.jaras);
                    num8=0;
                    ganador--;
                }
            }
        });
        carta9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (num9==0){
                    carta9.setImageResource(R.drawable.build);
                    num9=1;
                    ganador++;
                }
                else{
                    carta9.setImageResource(R.drawable.camaron);
                    num9=0;
                    ganador--;
                }
            }
        });
        carta10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (num10==0){
                    carta10.setImageResource(R.drawable.build);
                    num10=1;
                    ganador++;
                }
                else{
                    carta10.setImageResource(R.drawable.escalera);
                    num10=0;
                    ganador--;
                }
            }
        });
        carta11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (num11==0){
                    carta11.setImageResource(R.drawable.build);
                    num11=1;
                    ganador++;
                }
                else{
                    carta11.setImageResource(R.drawable.mano);
                    num11=0;
                    ganador--;
                }
            }
        });
        carta12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (num12==0){
                    carta12.setImageResource(R.drawable.build);
                    num12=1;
                    ganador++;

                }
                else{
                    carta12.setImageResource(R.drawable.garza);
                    num12=0;
                    ganador--;
                }
            }
        });

        if (ganador==12)
        {
            Toast.makeText(this, "¡ GANASTE !", Toast.LENGTH_SHORT).show();
        }

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
        ganador=0;
    }
}
