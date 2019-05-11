package com.example.crowdhackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class VoluntMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunt_menu);

        ImageButton act = (ImageButton) findViewById(R.id.imageButton10);
        act.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(VoluntMenu.this,Scanner.class));
            }
        });
        ImageButton act2 = (ImageButton) findViewById(R.id.imageButton12);
        act2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(VoluntMenu.this,Scanner.class));
            }
        });
        ImageButton act3 = (ImageButton) findViewById(R.id.imageButton14);
        act3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(VoluntMenu.this,Scanner.class));
            }
        });
        ImageButton act4 = (ImageButton) findViewById(R.id.imageButton15);
        act4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(VoluntMenu.this,Scanner.class));
            }
        });
        ImageButton act5 = (ImageButton) findViewById(R.id.imageButton16);
        act5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(VoluntMenu.this,Scanner.class));
            }
        });
        ImageButton act6 = (ImageButton) findViewById(R.id.imageButton17);
        act6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(VoluntMenu.this,Scanner.class));
            }
        });
    }
}
