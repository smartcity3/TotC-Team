package com.example.crowdhackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class organization_menu extends AppCompatActivity {
    public static String current;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organization_menu);

        ImageButton Img1=(ImageButton) findViewById(R.id.imageButton); //wwf
        ImageButton Img2=(ImageButton) findViewById(R.id.imageButton2); //line
        ImageButton Img3=(ImageButton) findViewById(R.id.imageButton4);//unicef
        ImageButton Img4=(ImageButton) findViewById(R.id.imageButton5); //med
        ImageButton Img5=(ImageButton) findViewById(R.id.imageButton6);//smile
        ImageButton Img6=(ImageButton) findViewById(R.id.imageButton7);//action

        Img1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(organization_menu.this, Activities.class));
                current="wwf";
            }
        });

        Img5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(organization_menu.this, Activities.class));
                current="line";
            }
        });
        Img4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(organization_menu.this, Activities.class));
                current="unicef";
            }
        });
        Img3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(organization_menu.this, Activities.class));
                current="med";
            }
        });
        Img6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(organization_menu.this, Activities.class));
                current="smile";
            }
        });
        Img2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(organization_menu.this, Activities.class));
                current="action";
            }
        });
    }
}
