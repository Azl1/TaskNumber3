package com.abdullaev.tasknumber3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Date;

public class PressureActivity extends AppCompatActivity {

    int topPressure;
    int pulse;
    int lowerPressure;
    Date date;

    public PressureActivity(int topPressure, int pulse, int lowerPressure, Date date) {
        this.topPressure = topPressure;
        this.pulse = pulse;
        this.lowerPressure = lowerPressure;
        this.date = date;
    }

    public PressureActivity(int contentLayoutId, int topPressure, int pulse, int lowerPressure, Date date) {
        super(contentLayoutId);
        this.topPressure = topPressure;
        this.pulse = pulse;
        this.lowerPressure = lowerPressure;
        this.date = date;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);
    }
}