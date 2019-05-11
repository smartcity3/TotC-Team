package com.example.crowdhackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button activity = (Button) findViewById(R.id.button); //first button
        activity.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, organization_menu.class));
            }
        });

        Button activity2 = (Button) findViewById(R.id.button3); //first button
        activity2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, StateRanking.class));
            }
        });

        Button activity3 = (Button) findViewById(R.id.button2); //first button
        activity3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, QRcode.class));
            }
        });
    }
}