package com.kitin.termometro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.PreferenceManager;

import android.os.Bundle;
import android.widget.TextView;


public class Details extends AppCompatActivity {
TextView textView, textView2;
String humidity,pressure;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Toolbar toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        humidity = PreferenceManager
                .getDefaultSharedPreferences(getApplicationContext())
                .getString("HUMIDITY", "0");
        pressure = PreferenceManager
                .getDefaultSharedPreferences(getApplicationContext())
                .getString("PRESSURE", "0");

        textView = findViewById(R.id.presion);
        textView2 = findViewById(R.id.humedad);
        textView.setText(pressure+" hPa");
        textView2.setText(humidity+"%");
    }
}