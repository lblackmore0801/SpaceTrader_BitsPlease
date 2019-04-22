package com.example.spacetrader_bitsplease.views;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import com.example.spacetrader_bitsplease.R;
import com.example.spacetrader_bitsplease.entity.Planet;
import com.example.spacetrader_bitsplease.entity.PlanetName;

public class MapActivity extends AppCompatActivity {

    private Button helenaButton;
    private Button ferrisButton;
    private Button esmeeButton;
    private Button castorButton;
    private Button andevianButton;
    private Button zuulButton;
    private Button solButton;
    private Button rhymusButton;
    private Button othelloButton;
    private Button myrtheButton;

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

        helenaButton = findViewById(R.id.helena_button);
        ferrisButton = findViewById(R.id.ferris_button);
        esmeeButton = findViewById(R.id.esmee_button);
        castorButton = findViewById(R.id.castor_button);
        andevianButton = findViewById(R.id.andevian_button);
        zuulButton = findViewById(R.id.zuul_button);
        solButton = findViewById(R.id.sol_button);
        rhymusButton = findViewById(R.id.rhymus_button);
        othelloButton = findViewById(R.id.othello_button);
        myrtheButton = findViewById(R.id.myrthe_button);

        helenaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Planet planet = new Planet(PlanetName.HELENA);
                Context context = MapActivity.this;
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Planet: Helena");
                builder.setMessage(planet.toString());
                builder.setCancelable(true);
                builder.setNegativeButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        ferrisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Planet planet = new Planet(PlanetName.FERRIS);
                Context context = MapActivity.this;
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Planet: Ferris");
                builder.setMessage(planet.toString());
                builder.setCancelable(true);
                builder.setNegativeButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        esmeeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Planet planet = new Planet(PlanetName.ESMEE);
                Context context = MapActivity.this;
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Planet: Esmee");
                builder.setMessage(planet.toString());
                builder.setCancelable(true);
                builder.setNegativeButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        castorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Planet planet = new Planet(PlanetName.CASTOR);
                Context context = MapActivity.this;
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Planet: Castor");
                builder.setMessage(planet.toString());
                builder.setCancelable(true);
                builder.setNegativeButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        andevianButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Planet planet = new Planet(PlanetName.ANDEVIAN);
                Context context = MapActivity.this;
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Planet: Andevian");
                builder.setMessage(planet.toString());
                builder.setCancelable(true);
                builder.setNegativeButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        zuulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Planet planet = new Planet(PlanetName.ZUUL);
                Context context = MapActivity.this;
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Planet: Zuul");
                builder.setMessage(planet.toString());
                builder.setCancelable(true);
                builder.setNegativeButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        solButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Planet planet = new Planet(PlanetName.SOL);
                Context context = MapActivity.this;
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Planet: Sol");
                builder.setMessage(planet.toString());
                builder.setCancelable(true);
                builder.setNegativeButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        rhymusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Planet planet = new Planet(PlanetName.RHYMUS);
                Context context = MapActivity.this;
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Planet: Rhymus");
                builder.setMessage(planet.toString());
                builder.setCancelable(true);
                builder.setNegativeButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        othelloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Planet planet = new Planet(PlanetName.OTHELLO);
                Context context = MapActivity.this;
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Planet: Othello");
                builder.setMessage(planet.toString());
                builder.setCancelable(true);
                builder.setNegativeButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        myrtheButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Planet planet = new Planet(PlanetName.MYRTHE);
                Context context = MapActivity.this;
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Planet: Myrthe");
                builder.setMessage(planet.toString());
                builder.setCancelable(true);
                builder.setNegativeButton(
                        "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });





    }
}
