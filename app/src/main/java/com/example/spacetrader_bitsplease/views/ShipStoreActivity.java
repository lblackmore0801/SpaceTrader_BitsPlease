package com.example.spacetrader_bitsplease.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.example.spacetrader_bitsplease.R;
import com.example.spacetrader_bitsplease.entity.Player;
import com.example.spacetrader_bitsplease.entity.ShipType;

public class ShipStoreActivity extends AppCompatActivity {

    Button buyFireFlyButton;
    Button buyMosquitoButton;
    Button buyBumbleBeeButton;
    Button buyBeetleButton;

    /**
     * Maintains instance state in store
     * @param  savedInstanceState price
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ship_store);

        buyFireFlyButton = findViewById(R.id.buyFireflyButton);
        buyMosquitoButton = findViewById(R.id.buyMosquitoButton);
        buyBumbleBeeButton = findViewById(R.id.buyBumbleBeeButton);
        buyBeetleButton = findViewById(R.id.buyBumbleBeeButton);

        buyFireFlyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Player.getMoney() > Player.getShip().getType().getPrice()) {
                    Player.getShip().setType(ShipType.FIREFLY);
                    Player.setMoney(Player.getMoney() - Player.getShip().getType().getPrice());
                    Toast.makeText(getApplicationContext(),
                            "Player's ship is now FireFly",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Not enough money",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        buyMosquitoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Player.getMoney() > Player.getShip().getType().getPrice()) {
                    Player.getShip().setType(ShipType.MOSQUITO);
                    Player.setMoney(Player.getMoney() - Player.getShip().getType().getPrice());
                    Toast.makeText(getApplicationContext(),
                            "Player's ship is now Mosquito",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Not enough money",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        buyBumbleBeeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Player.getMoney() > Player.getShip().getType().getPrice()) {
                    Player.getShip().setType(ShipType.BUMBLEBEE);
                    Player.setMoney(Player.getMoney() - Player.getShip().getType().getPrice());
                    Toast.makeText(getApplicationContext(),
                            "Player's ship is now BumbleBee",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Not enough money",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        buyBeetleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Player.getMoney() > Player.getShip().getType().getPrice()) {
                    Player.getShip().setType(ShipType.BEETLE);
                    Player.setMoney(Player.getMoney() - Player.getShip().getType().getPrice());
                    Toast.makeText(getApplicationContext(),
                            "Player's ship is now Beetle",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Not enough money",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
