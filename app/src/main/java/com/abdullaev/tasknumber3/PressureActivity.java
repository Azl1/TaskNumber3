package com.abdullaev.tasknumber3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Date;

public class PressureActivity extends AppCompatActivity {

    int topPressure;
    int pulse;
    int lowerPressure;
    Date date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);
    }
}