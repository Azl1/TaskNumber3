package com.abdullaev.tasknumber3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Date;

public class PressureActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);

        Button pressureActivity1 = findViewById(R.id.buttonSave1);
        pressureActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PressureActivity.this, "Данные о давлениии", Toast.LENGTH_LONG).show();
            }
        });
    }
    }