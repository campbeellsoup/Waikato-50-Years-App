package com.example.assignmentone;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FunFactActivity extends AppCompatActivity {

    //When this activity is created it will retrieve all relevant info to get the appropriate image and fact
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_fact);

        //retrieve the random number generated in second activity from intent extra
        int randomFactIndex = getIntent().getIntExtra("randomFactIndex", 0);

        //get all of the values from the array.xml
        String[] funFactsTextArray = getResources().getStringArray(R.array.string_array_fun_facts_text);
        String[] funFactsImageArray = getResources().getStringArray(R.array.string_array_fun_facts_images);

        //find the textview in the layout and set the text to the appropriate text
        TextView funFactTextView = findViewById(R.id.funFactTextView);
        funFactTextView.setText(funFactsTextArray[randomFactIndex]);

        //finds the right image, as well as the imageview in the layout, and then sets it to the appropriate image
        String imageName = funFactsImageArray[randomFactIndex];
        int imageResourceID = getResources().getIdentifier(imageName, "drawable", getPackageName());
        ImageView funFactImageView = findViewById(R.id.funFactImageView);
        funFactImageView.setImageResource(imageResourceID);
    }
}