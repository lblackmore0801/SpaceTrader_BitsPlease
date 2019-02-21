package com.example.spacetrader_bitsplease.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

import com.example.spacetrader_bitsplease.R;
import com.example.spacetrader_bitsplease.entity.Player;

public class CreatePlayerActivity extends AppCompatActivity{

    /** an integer used because add a course returns something */
    public static final int START_REQUEST_ID = 1;

    /* ************************
    Widgets we will need for binding and getting information
    */
    private TextView usernameText;
    private TextView fighterSkill;
    private TextView pilotSkill;
    private TextView engineeringSkill;
    private TextView traderSkill;


    /* ***********************
   Data for student being edited.
   */
    private Player player;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_creation);


        usernameText = findViewById(R.id.username_Text);
        fighterSkill = findViewById(R.id.int_fighter_skill);
        pilotSkill = findViewById(R.id.int_pilot_skill);
        engineeringSkill = findViewById(R.id.int_engineering_skill);
        traderSkill = findViewById(R.id.int_trader_skill);


        final Button addFighter = findViewById(R.id.AddFighterSkill);
        addFighter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.setFighterSkill(player.getFighterSkill()+1);
                fighterSkill.setText(Integer.toString(player.getFighterSkill()));
            }
        });
        final Button addPilot = findViewById(R.id.AddPilotSkill);
        addPilot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.setPilotSkill(player.getPilotSkill()+1);
                pilotSkill.setText(Integer.toString(player.getPilotSkill()));
            }
        });
        final Button addEngineer = findViewById(R.id.AddEngineeringSkill);
        addEngineer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.setEngineerSkill(player.getEngineerSkill()+1);
                engineeringSkill.setText(Integer.toString(player.getEngineerSkill()));
            }
        });
        final Button addTrader = findViewById(R.id.AddTraderSkill);
        addTrader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.setTraderSkill(player.getTraderSkill()+1);
                traderSkill.setText(Integer.toString(player.getTraderSkill()));
            }
        });
        final Button minusFighter = findViewById(R.id.MinusFighterSkill);
        minusFighter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.setFighterSkill(player.getFighterSkill()-1);
                fighterSkill.setText(Integer.toString(player.getFighterSkill()));
            }
        });
        final Button minusPilot = findViewById(R.id.MinusPilotSkill);
        minusPilot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.setPilotSkill(player.getPilotSkill()-1);
                pilotSkill.setText(Integer.toString(player.getPilotSkill()));
            }
        });
        final Button minusEngineer = findViewById(R.id.MinusEngineeringSkill);
        minusEngineer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.setEngineerSkill(player.getEngineerSkill()-1);
                engineeringSkill.setText(Integer.toString(player.getEngineerSkill()));
            }
        });
        final Button minusTrader = findViewById(R.id.MinusTraderSkill);
        minusTrader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.setTraderSkill(player.getTraderSkill()-1);
                traderSkill.setText(Integer.toString(player.getTraderSkill()));
            }
        });




        player = new Player("Ryan Pratt");


        usernameText.setText(player.getUsername());


    }


}
