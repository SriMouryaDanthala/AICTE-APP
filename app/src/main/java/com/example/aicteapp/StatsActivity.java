package com.example.aicteapp;


import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;

public class StatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);
        getSupportActionBar().setTitle("STATS");
        ImageButton next = (ImageButton) findViewById(R.id.homeButton);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), NextActivity.class);
                startActivityForResult(myIntent, 0);
            }

        });


        ImageButton next2 = (ImageButton)  findViewById(R.id.buttonDash);
        next2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent2 = new Intent(view.getContext(),DashBoardActivity.class);
                startActivityForResult(myIntent2, 0);
            }

        });


        ImageButton next1 = (ImageButton) findViewById(R.id.button2);
        next1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent1 = new Intent(view.getContext(),InstitutesActivity.class);
                startActivityForResult(myIntent1, 0);
            }

        });

        ImageButton next3 = (ImageButton) findViewById(R.id.button3);
        next3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent3 = new Intent(view.getContext(),GraphsAndChartsActivity.class);
                startActivityForResult(myIntent3, 0);
            }

        });




    }
}
