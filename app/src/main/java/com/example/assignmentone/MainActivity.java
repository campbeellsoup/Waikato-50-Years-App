package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //when the button on the main activity is clicked it starts the second activity
    public void onclickMain(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}