package com.example.crowdhackathon;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class Running extends AppCompatActivity implements SensorEventListener {


    TextView tv_steps,tv_KM,tv_time;
    SensorEvent current;

    SensorManager sensorManager;

    boolean running = false;
    static boolean flag;
    private long sensorTimeReference = 0l;
    private long myTimeReference = 0l;

//    long timeInMillis = (new Date()).getTime()
//            + (current.timestamp - System.nanoTime()) / 1000000L;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_running);

        flag = true;

        tv_steps = (TextView) findViewById(R.id.tv_steps);
        tv_steps.setText("0");

        tv_KM = (TextView) findViewById(R.id.tv_km);
        tv_KM.setText("0");

        tv_time = (TextView) findViewById(R.id.tv_time);

        sensorManager = (SensorManager)getSystemService(Context.SENSOR_SERVICE);
    }

    protected void onResume(){
        super.onResume();
        running = true;
        Sensor countSensor = sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
        if (countSensor != null){
            sensorManager.registerListener(this, countSensor, SensorManager.SENSOR_DELAY_UI);
        } else {
            Toast.makeText(this,"Sensor not found!",Toast.LENGTH_SHORT).show();
        }
    }

    protected void onPause() {
        super.onPause();
        running = false;
        //if you unregister the hardware will stop detecting steps
        //sensorManager unregisterListener(this);
    }

    public void onSensorChanged(SensorEvent event){

        if (running) {

            if (flag) {
                flag = false;
                event.values[0] = 0;


            }


            tv_steps.setText(String.valueOf(event.values[0]));
            tv_KM.setText(String.valueOf(event.values[0] * 0.3));

            // set reference times
            if(sensorTimeReference == 0l && myTimeReference == 0l) {
                sensorTimeReference = event.timestamp;
                myTimeReference = System.currentTimeMillis();
            }

            // set event timestamp to current time in milliseconds
            event.timestamp = myTimeReference +
                    Math.round((event.timestamp - sensorTimeReference) / 1000000.0);
            // some code...


        }
    }

    public void onAccuracyChanged(Sensor sensor,int accuracy){

    }

}