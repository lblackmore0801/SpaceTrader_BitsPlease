package com.example.spacetrader_bitsplease.views;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.content.Context;
import android.content.Intent;
import android.app.AlertDialog;
import android.content.DialogInterface;

import com.example.spacetrader_bitsplease.R;
import com.example.spacetrader_bitsplease.entity.Difficulty;
import com.example.spacetrader_bitsplease.entity.Player;

@SuppressWarnings("ALL")
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
    private Spinner difficultySpinner;
    private TextView remainingSkill;

    /* ***********************
   Data for student being edited.
   */
    private Player player;
    private int remainingPoints;


    /**
     * Creates buttons and handles buttons on the
     * player creation page
     * @param  savedInstanceState price
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_creation);


        usernameText = findViewById(R.id.username_Text);

        fighterSkill = findViewById(R.id.int_fighter_skill);
        pilotSkill = findViewById(R.id.int_pilot_skill);
        engineeringSkill = findViewById(R.id.int_engineering_skill);
        traderSkill = findViewById(R.id.int_trader_skill);
        remainingPoints = 16;
        remainingSkill = findViewById(R.id.int_RemainingPoints);

        player = new Player("Ryan Pratt");
        difficultySpinner = findViewById(R.id.difficulty_spinner);
        usernameText.setText(player.getUsername());
        Button createButton = findViewById(R.id.create_char);

        final Button addFighter = findViewById(R.id.AddFighterSkill);
        addFighter.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"SetTextI18n", "DefaultLocale"})
            @Override
            public void onClick(View view) {
                if (remainingPoints > 0) {
                    player.setFighterSkill(Player.getFighterSkill() + 1);
                    fighterSkill.setText(Integer.toString(Player.getFighterSkill()));
                    remainingPoints--;
                    remainingSkill.setText(String.format("%d", remainingPoints));

                }
            }
        });
        final Button addPilot = findViewById(R.id.AddPilotSkill);
        addPilot.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"SetTextI18n", "DefaultLocale"})
            @Override
            public void onClick(View view) {
                if (remainingPoints > 0) {
                    player.setPilotSkill(Player.getPilotSkill() + 1);
                    pilotSkill.setText(Integer.toString(Player.getPilotSkill()));
                    remainingPoints--;
                    remainingSkill.setText(String.format("%d", remainingPoints));
                }
            }
        });
        final Button addEngineer = findViewById(R.id.AddEngineeringSkill);
        addEngineer.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"SetTextI18n", "DefaultLocale"})
            @Override
            public void onClick(View view) {
                if (remainingPoints > 0) {
                    player.setEngineerSkill(Player.getEngineerSkill() + 1);
                    engineeringSkill.setText(Integer.toString(Player.getEngineerSkill()));
                    remainingPoints--;
                    remainingSkill.setText(String.format("%d", remainingPoints));
                }
            }
        });
        final Button addTrader = findViewById(R.id.AddTraderSkill);
        addTrader.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"SetTextI18n", "DefaultLocale"})
            @Override
            public void onClick(View view) {
                if (remainingPoints > 0) {
                    player.setTraderSkill(Player.getTraderSkill() + 1);
                    traderSkill.setText(Integer.toString(Player.getTraderSkill()));
                    remainingPoints--;
                    remainingSkill.setText(String.format("%d", remainingPoints));
                }
            }
        });
        final Button minusFighter = findViewById(R.id.MinusFighterSkill);
        minusFighter.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"SetTextI18n", "DefaultLocale"})
            @Override
            public void onClick(View view) {
                if (Player.getFighterSkill() != 0) {
                    player.setFighterSkill(Player.getFighterSkill() - 1);
                    fighterSkill.setText(Integer.toString(Player.getFighterSkill()));
                    remainingPoints++;
                    remainingSkill.setText(String.format("%d", remainingPoints));
                }
            }
        });
        final Button minusPilot = findViewById(R.id.MinusPilotSkill);
        minusPilot.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"SetTextI18n", "DefaultLocale"})
            @Override
            public void onClick(View view) {
                if (Player.getPilotSkill() != 0) {
                    player.setPilotSkill(Player.getPilotSkill() - 1);
                    pilotSkill.setText(Integer.toString(Player.getPilotSkill()));
                    remainingPoints++;
                    remainingSkill.setText(String.format("%d", remainingPoints));
                }
            }
        });
        final Button minusEngineer = findViewById(R.id.MinusEngineeringSkill);
        minusEngineer.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"SetTextI18n", "DefaultLocale"})
            @Override
            public void onClick(View view) {
                if (Player.getEngineerSkill() != 0) {
                    player.setEngineerSkill(Player.getEngineerSkill() - 1);
                    engineeringSkill.setText(Integer.toString(Player.getEngineerSkill()));
                    remainingPoints++;
                    remainingSkill.setText(String.format("%d", remainingPoints));
                }
            }
        });
        final Button minusTrader = findViewById(R.id.MinusTraderSkill);
        minusTrader.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"SetTextI18n", "DefaultLocale"})
            @Override
            public void onClick(View view) {
                if (Player.getTraderSkill() != 0) {
                    player.setTraderSkill(Player.getTraderSkill() - 1);
                    traderSkill.setText(Integer.toString(Player.getTraderSkill()));
                    remainingPoints++;
                    remainingSkill.setText(String.format("%d", remainingPoints));
                }
            }
        });

        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (remainingPoints > 0) {
                    Context context = CreatePlayerActivity.this;
                    AlertDialog.Builder builder = new AlertDialog.Builder(context);
                    builder.setTitle("Error.");
                    builder.setMessage("Cannot create player. Must allocate all 16 skill points.");
                    builder.setCancelable(true);
                    builder.setNegativeButton(
                            "Cancel",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alert = builder.create();
                    alert.show();
                } else {
                  player.setTraderSkill(Player.getTraderSkill());
                  player.setEngineerSkill(Player.getEngineerSkill());
                  player.setFighterSkill(Player.getFighterSkill());
                  player.setPilotSkill(Player.getPilotSkill());
                  player.setDifficulty((Difficulty) difficultySpinner.getSelectedItem());
                  usernameText = findViewById(R.id.username_Text);
                  player.setUsername(usernameText.getText().toString());

                  Context context = CreatePlayerActivity.this;
                  AlertDialog.Builder builder = new AlertDialog.Builder(context);
                  builder.setTitle("Player Created.");
                  builder.setMessage("Player successfully created with the following stats:\n\n" + player.toString() +
                                  "\n\nPress next to begin the game.\nPress cancel to edit stats.");
                  builder.setCancelable(true);
                  builder.setNegativeButton(
                          "Cancel",
                          new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });
                  builder.setPositiveButton(
                          "Next",
                          new DialogInterface.OnClickListener() {
                              public void onClick(DialogInterface dialog, int id) {
                                  setContentView(R.layout.activity_player_creation);

                                  Intent intent = new Intent(CreatePlayerActivity.this, PlanetSelectionActivity.class);
                                  startActivityForResult(intent, START_REQUEST_ID);
                              }
                          });
                  AlertDialog alert = builder.create();
                  alert.show();
                }
        }

        });


        /*
        Set up the adapter to display the class standings in the spinner
        */

        ArrayAdapter<Difficulty> adapterCS = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Difficulty.values());
        adapterCS.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        difficultySpinner.setAdapter(adapterCS);

    }

}