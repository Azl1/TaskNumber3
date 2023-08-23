package com.abdullaev.tasknumber3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HealthActivity extends AppCompatActivity {


    int weight;
    int numberSteps;

    public HealthActivity(int weight, int numberSteps) {
        this.weight = weight;
        this.numberSteps = numberSteps;
    }

    public HealthActivity(int contentLayoutId, int weight, int numberSteps) {
        super(contentLayoutId);
        this.weight = weight;
        this.numberSteps = numberSteps;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);
    }
}