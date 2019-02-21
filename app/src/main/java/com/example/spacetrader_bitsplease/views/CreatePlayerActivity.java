package com.example.spacetrader_bitsplease.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;

import com.example.spacetrader_bitsplease.R;
import com.example.spacetrader_bitsplease.entity.Difficulty;
import com.example.spacetrader_bitsplease.entity.Player;

public class CreatePlayerActivity extends AppCompatActivity{

    /** an integer used because add a course returns something */
    public static final int START_REQUEST_ID = 1;

    /* ************************
    Widgets we will need for binding and getting information
    */
    private TextView usernameText;
    private Spinner difficultySpinner;
    private Button createButton;
    private Button planetSelect;



    /* ***********************
   Data for student being edited.
   */
    private Player player;
    private int remainingPoints;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_creation);


        usernameText = findViewById(R.id.username_Text);
        player = new Player("Ryan Pratt");
        difficultySpinner = findViewById(R.id.difficulty_spinner);
        usernameText.setText(player.getUsername());
        createButton= findViewById(R.id.create_char);
        planetSelect = findViewById(R.id.planet_select);


        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (remainingPoints > 0) {
                  Context context = getApplicationContext();
                  CharSequence text = "Must use allocate all 16 points for player creation.";
                  int duration = Toast.LENGTH_SHORT;
                  Toast toast = Toast.makeText(context, text, duration);
                  toast.show();
                } else {
                  player.setTraderSkill(player.getTraderSkill());
                  player.setEngineerSkill(player.getEngineerSkill());
                  player.setFighterSkill(player.getFighterSkill());
                  player.setPilotSkill(player.getPilotSkill());
                  player.setDifficulty(player.getDifficulty());

                  planetSelect.setEnabled(true);
                  createButton.setEnabled(false);

                  Context context = getApplicationContext();
                  CharSequence text = player.toString();
                  int duration = Toast.LENGTH_SHORT;
                  Toast toast = Toast.makeText(context, text, duration);
                  toast.show();
                }
                finish();
        }

        });


        planetSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreatePlayerActivity.this, PlanetSelection.class);
                startActivityForResult(intent, START_REQUEST_ID);
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
