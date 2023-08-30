package com.abdullaev.tasknumber3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HealthActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        Button healthActivity1 = findViewById(R.id.buttonSav2);
        healthActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HealthActivity.this, "Сохранен запись жиненных показателей", Toast.LENGTH_LONG).show();
            }
        });
    }
}