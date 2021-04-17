package com.mc.termproject.unitconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    private Button dis;
    private Button tem;
    private Button tim;
    private Button are;
    private Button wei;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        dis = findViewById(R.id.dis);
        dis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoDis();
            }
        });


        tem = findViewById(R.id.tem);
        tem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToTem();
            }
        });


        tim = findViewById(R.id.tim);
        tim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToTim();
            }
        });


        wei = findViewById(R.id.wei);
        wei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToWei();
            }
        });


        are = findViewById(R.id.are);
        are.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAre();
            }
        });

    }

        public void gotoDis()
        {
            Intent i= new Intent(this,distance.class);
            startActivity(i);
        }

        public void goToTem()
        {
            Intent i= new Intent(this, Temperature.class);
            startActivity(i);
        }

        public void goToTim()
        {
            Intent i= new Intent(this, Time.class);
            startActivity(i);
        }

        public void goToWei()
        {
            Intent i= new Intent(this, Weight.class);
            startActivity(i);
        }

        public void goToAre()
        {
            Intent i= new Intent(this, Area.class);
            startActivity(i);
        }



}
