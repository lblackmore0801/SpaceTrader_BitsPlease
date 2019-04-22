package com.example.spacetrader_bitsplease.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.spacetrader_bitsplease.R;

public class generalStoreActivity extends AppCompatActivity {

    private Button mapButton;
    private Button shipStoreButton;
    private Button weaponStoreButton;

    /**
     * Maintains instance state in store
     * @param  savedInstanceState price
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_store);

        mapButton = findViewById(R.id.game_button);
        shipStoreButton = findViewById(R.id.ShipStoreButton);
        weaponStoreButton = findViewById(R.id.WeaponStoreButton);

        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(generalStoreActivity.this, MapActivity.class);
                startActivityForResult(intent, 1);
            }
        });

        shipStoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(generalStoreActivity.this, ShipStoreActivity.class);
                startActivityForResult(intent, 1);
            }
        });

        weaponStoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(generalStoreActivity.this, WeaponStoreActivity.class);
                startActivityForResult(intent, 1);
            }
        });
    }
}
