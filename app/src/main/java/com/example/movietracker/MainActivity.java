package com.example.movietracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get Api key
        String key = BuildConfig.ApiKey;

        TextView tv = findViewById(R.id.Textview);
        tv.setText(key);
    }
}
