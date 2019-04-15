package com.example.spacetrader_bitsplease.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import com.example.spacetrader_bitsplease.R;

public class MainActivity extends AppCompatActivity {

    /** an integer used because add a course returns something */
    private static final int START_REQUEST_ID = 1;

    /**
     * Sets instance state for main activity
     * @param  savedInstanceState price
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button start = findViewById(R.id.button_start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CreatePlayerActivity.class);
                startActivityForResult(intent, START_REQUEST_ID);
            }
        });
    }


}
