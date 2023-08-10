package com.example.assignmentone;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.view.View;
import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }
    //When the button on this page is clicked, it generates a random number between 0 and 7, and
    //opens the fun fact activity page, as well as sending the random number that was generated.
    public void onclickFunFactActivity(View view){
        int randomFactIndex = new Random().nextInt(8);
        //for testing purposes
        Log.d("RandomFactIndex", "Random Index:" + randomFactIndex);

        Intent intent = new Intent(this, FunFactActivity.class);
        intent.putExtra("randomFactIndex", randomFactIndex);
        startActivity(intent);
    }
}
