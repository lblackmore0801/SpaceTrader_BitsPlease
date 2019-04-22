package com.example.spacetrader_bitsplease.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

import com.example.spacetrader_bitsplease.R;
import com.example.spacetrader_bitsplease.entity.Player;

public class MercenaryStoreActivity extends AppCompatActivity {

    private Button pilotMerc;
    private Button engineerMerc;
    private Button fighterMerc;
    private Button traderMerc;
    private Button clearMerc;

    /**
     * Sets instance state for main activity
     * @param  savedInstanceState price
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercenarie_store);

        pilotMerc = findViewById(R.id.pilot_merc);
        engineerMerc = findViewById(R.id.engineer_merc);
        fighterMerc = findViewById(R.id.fighter_merc);
        traderMerc = findViewById(R.id.trader_merc);
        clearMerc = findViewById(R.id.clear_merc);

        pilotMerc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Player.pilotMerc != true) {
                    Player.setPilotSkill(Player.getPilotSkill() + 1);
                    Player.pilotMerc = true;
                } else {
                    Toast.makeText(getApplicationContext(),
                            "You already recruited this mercenary",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        engineerMerc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Player.engineerMerc != true) {
                    Player.setEngineerSkill(Player.getEngineerSkill() + 1);
                    Player.engineerMerc = true;
                } else {
                    Toast.makeText(getApplicationContext(),
                            "You already recruited this mercenary",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        fighterMerc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Player.fighterMerc != true) {
                    Player.setFighterSkill(Player.getFighterSkill() + 1);
                    Player.fighterMerc = true;
                } else {
                    Toast.makeText(getApplicationContext(),
                            "You already recruited this mercenary",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        traderMerc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Player.traderMerc != true) {
                    Player.setTraderSkill(Player.getTraderSkill() + 1);
                    Player.traderMerc = true;
                } else {
                    Toast.makeText(getApplicationContext(),
                            "You already recruited this mercenary",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        clearMerc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Player.pilotMerc = false;
                Player.engineerMerc = false;
                Player.fighterMerc = false;
                Player.traderMerc = false;
            }
        });
    }
}
