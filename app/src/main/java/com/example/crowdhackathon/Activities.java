package com.example.crowdhackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Activities extends AppCompatActivity {
    static ImageView vol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities);
        ImageView img = (ImageView) findViewById(R.id.imageView2) ;
        if(organization_menu.current.equals("wwf"))
            img.setImageResource(R.drawable.wwf);
        else if(organization_menu.current.equals("line"))
            img.setImageResource(R.drawable.health);
        else if(organization_menu.current.equals("unicef"))
            img.setImageResource(R.drawable.unicef);
            else if(organization_menu.current.equals("med"))
            img.setImageResource(R.drawable.ed);
         else if(organization_menu.current.equals("smile"))
            img.setImageResource(R.drawable.smile);
         else
            img.setImageResource(R.drawable.actionade);


        //buttonDimos
        Button act = (Button) findViewById(R.id.buttonDimos); //volunteering button
        act.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activities.this, VoluntMenu.class));
            }
        });

        Button act2 = (Button) findViewById(R.id.buttonRun); //volunteering button
        act2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activities.this, Running.class));
            }
        });

        Button act3 = (Button) findViewById(R.id.buttonMore); //volunteering button
        act3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activities.this, Form.class));
            }
        });
    }


}
