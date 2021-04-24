package com.devevp.diagnostico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    private ImageView fondo;
    int r=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fondo=(ImageView) findViewById(R.id.fondo);
    }

    public void cambioImg(View view){
        List <Integer> Numeros = new ArrayList<>(10);
        Random r = new Random();
        int rNumber;
        int aleatorios[]= new int[10];

        for(int i=1; i<=10; i++){
            rNumber=(int)(r.nextInt(10) +1);
            while(Numeros.contains(rNumber)) {
                rNumber = (r.nextInt(10) + 1);
            }
            Numeros.add(rNumber);
            aleatorios[i]=rNumber;

        }

        if (aleatorios.length ==1){
            fondo.setImageResource(R.mipmap.mg1);
        }
        else if (aleatorios.length ==2){
            fondo.setImageResource(R.mipmap.mg2);
        }
        else if (aleatorios.length ==3){
            fondo.setImageResource(R.mipmap.mg3);
        }
        else if (aleatorios.length ==4){
            fondo.setImageResource(R.mipmap.mg4);
        }
        else if (aleatorios.length ==5){
            fondo.setImageResource(R.mipmap.mg5);
        }
        else if (aleatorios.length ==6){
            fondo.setImageResource(R.mipmap.mg6);
        }
        else if (aleatorios.length ==7){
            fondo.setImageResource(R.mipmap.mg7);
        }
        else if (aleatorios.length ==8){
            fondo.setImageResource(R.mipmap.mg8);
        }
        else if (aleatorios.length ==9){
            fondo.setImageResource(R.mipmap.mg9);
        }
        else if (aleatorios.length ==10){
            fondo.setImageResource(R.mipmap.mg10);
        }
    }
}