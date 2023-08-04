package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button enterButton = findViewById(R.id.enter_button);

        enterButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);

            startActivity(intent);
        });

    }
}