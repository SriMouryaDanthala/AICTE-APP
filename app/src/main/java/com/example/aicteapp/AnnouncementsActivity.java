package com.example.aicteapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AnnouncementsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announcements);
        ImageButton B = (ImageButton) findViewById(R.id.floatingActionButtonHome);
        B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent1 = new Intent(view.getContext(), NextActivity.class);
                startActivityForResult(myIntent1, 0);
            }
        });

        Button B1 = (Button) findViewById(R.id.button9);
        B1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent2 = new Intent(view.getContext(), NewsActivity.class);
                startActivityForResult(myIntent2, 0);
            }
        });





    }
}
