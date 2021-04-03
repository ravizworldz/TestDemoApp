package com.demo.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView textView = findViewById(R.id.textView);

        Button leftButton = findViewById(R.id.leftArrowButton);
        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Left Arrow clicked", Toast.LENGTH_LONG).show();

                textView.setText("left");////change this accoringly
            }
        });

        Button rightButton = findViewById(R.id.rigtArrowButton);
        rightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Right Arrow clicked", Toast.LENGTH_LONG).show();

                textView.setText("right");//change this accoringly
            }
        });
    }
}