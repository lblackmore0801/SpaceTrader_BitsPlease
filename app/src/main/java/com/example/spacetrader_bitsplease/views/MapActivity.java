package com.example.spacetrader_bitsplease.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import com.example.spacetrader_bitsplease.R;

public class MapActivity extends AppCompatActivity {

    /** an integer used because add a course returns something */
    private static final int START_REQUEST_ID = 1;

    /**
     * Sets instance state for main activity
     * @param  savedInstanceState price
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }
}
