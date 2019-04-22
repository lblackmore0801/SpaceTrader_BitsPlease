package com.example.spacetrader_bitsplease.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.example.spacetrader_bitsplease.R;
import com.example.spacetrader_bitsplease.entity.Player;
import com.example.spacetrader_bitsplease.entity.ShipType;

public class WeaponStoreActivity extends AppCompatActivity {

    Button buyPhaserButton;
    Button buyLaserButton;
    Button buyLazerButton;

    /**
     * Maintains instance state in store
     * @param  savedInstanceState price
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapon_store);

        buyPhaserButton = findViewById(R.id.buyPhaserButton);
        buyLaserButton = findViewById(R.id.buyLaserButton);
        buyLazerButton = findViewById(R.id.buyLazerButton);

        buyPhaserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Player.getMoney() > 2000) {
                    Player.setMoney(Player.getMoney() - 2000);
                    Player.getShip().setWeaponDamage(2);
                    Toast.makeText(getApplicationContext(),
                        "Player weapon set to Phaser",
                        Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Not enough money",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        buyLaserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Player.getMoney() > 5000) {
                    Player.setMoney(Player.getMoney() - 5000);
                    Player.getShip().setWeaponDamage(3);
                    Toast.makeText(getApplicationContext(),
                            "Player weapon set to Laser",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Not enough money",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        buyLazerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Player.getMoney() > 30000) {
                    Player.setMoney(Player.getMoney() - 30000);
                    Player.getShip().setWeaponDamage(4);
                    Toast.makeText(getApplicationContext(),
                            "Player weapon set to Lazer",
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
