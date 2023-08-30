package com.abdullaev.tasknumber3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button pressureRecording;
    Button healthRecord;

    EditText editTextWeight;
    EditText editTextNumberSteps;

    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        Button buttonSaveMain = (Button) findViewById(R.id.buttonSave);
        EditText editTextMainFIO = (EditText) findViewById(R.id.editTextFIO);
        EditText editTextMainAGE = (EditText) findViewById(R.id.editTextAge);

        //  EditText editTextWeight = (EditText) findViewById(R.id)
        //   EditText editTextNumberSteps = (EditText) findViewById(R.id.numberSteps);


        buttonSaveMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fio = editTextMainFIO.getText().toString();
                String age = editTextMainAGE.getText().toString();

                Toast.makeText(MainActivity.this, "Данные сохранены", Toast.LENGTH_LONG).show();

            }
        });

        pressureRecording.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PressureActivity.class);
                startActivity(intent);
            }
        });

        healthRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HealthActivity.class);
                startActivity(intent);
                String weight = editTextWeight.getText().toString();
                String numberSteps = editTextNumberSteps.getText().toString();
                try {
                    Toast.makeText(MainActivity.this, "Данные сохранены", Toast.LENGTH_LONG).show();
                } catch (Exception exception) {
                    Toast.makeText(MainActivity.this, "Неправильно введены данные", Toast.LENGTH_LONG).show();
                    Log.e(TAG, "Получено исключение", exception);
                }
            }
        });

    }

    private void initView() {
        pressureRecording = findViewById(R.id.pressureRecording);
        healthRecord = findViewById(R.id.healthRecord);
        editTextWeight = findViewById(R.id.weight);
        editTextNumberSteps = findViewById(R.id.numberSteps);
    }
}