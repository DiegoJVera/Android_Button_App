package com.example.diegov.myapplication;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {
    private static final String TOTAL_COUNT = "total_count";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //showRandomNumber();
    }

   // public void showRandomNumber () {
        // Get the text view where the random number will be displayed
        //TextView randomView = (TextView)
         //       findViewById(R.id.textview_random);

        // Get the text view where the heading is displayed
       // TextView headingView = (TextView)
        //        findViewById(R.id.textview_label);

        // Get the count from the intent extras
       // int count = getIntent().getIntExtra(TOTAL_COUNT, 0);

        // Generate the random number
        //Random random = new Random();
        //int randomInt = 0;
        //if (count>0) {
          //  randomInt = random.nextInt(count);
        //}

        // Display the random number
        //randomView.setText(Integer.toString(randomInt));

        // Substitute the max value into the string resource
        // for the heading, and update the heading
        //headingView.setText(getString(R.string.random_heading, count));
    //}

    public void moveMe(View view) {
        int w = Resources.getSystem().getDisplayMetrics().widthPixels;

        int h =Resources.getSystem().getDisplayMetrics().heightPixels;

        Button btn = findViewById(R.id.movingButton);
        Random r = new Random();

        int x = (r.nextInt(w-88)+44);
        int y = (r.nextInt(h-500)+250);

        btn.setX(x);
        btn.setY(y);

        int color = Color.argb(255, r.nextInt(256), r.nextInt(256), r.nextInt(256));
        view.setBackgroundColor(color);
    }
}
