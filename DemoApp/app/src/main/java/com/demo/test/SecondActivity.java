package com.demo.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

       /* TextView textView = findViewById(R.id.textView);

        Button leftButton = findViewById(R.id.leftArrowButton);
        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(SecondActivity.this, "Left Arrow clicked", Toast.LENGTH_LONG).show();
               finish();
                //textView.setText("left");////change this accoringly
            }
        });

        Button rightButton = findViewById(R.id.rigtArrowButton);
        rightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this, "No More pages...", Toast.LENGTH_LONG).show();

                //textView.setText("right");//change this accoringly

            }
        });*/
    }
}