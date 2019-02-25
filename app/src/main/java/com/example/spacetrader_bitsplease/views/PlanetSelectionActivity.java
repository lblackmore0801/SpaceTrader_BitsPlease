package com.example.spacetrader_bitsplease.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.spacetrader_bitsplease.R;
import com.example.spacetrader_bitsplease.entity.Planet;
import com.example.spacetrader_bitsplease.entity.PlanetName;

public class PlanetSelectionActivity extends AppCompatActivity {

    private Spinner planetSpinner;
    private TextView currentName;
    private TextView currentSize;
    private TextView nextSize;
    private TextView currentResource;
    private TextView nextResource;
    private TextView currentTech;
    private TextView nextTech;
    private TextView currentCoordinates;
    private TextView nextCoordinates;

    private Planet planet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet_selection);

        currentName = findViewById(R.id.curr_name);
        currentSize = findViewById(R.id.curr_size);
        nextSize = findViewById(R.id.next_size);
        currentResource = findViewById(R.id.curr_resource);
        nextResource = findViewById(R.id.next_resource);
        currentTech = findViewById(R.id.curr_tech);
        nextTech = findViewById(R.id.next_tech);
        currentCoordinates = findViewById(R.id.curr_coordinates);
        nextCoordinates = findViewById(R.id.next_coordinates);

        //create and populate spinner for target planets
        planetSpinner = findViewById(R.id.planet_spinner);
        ArrayAdapter<PlanetName> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, PlanetName.values());
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        planetSpinner.setAdapter(adapter);

        //set current planet stats
        Planet currentPlanet = new Planet();
        currentName.setText(currentPlanet.getPlanetName().toString());
        currentSize.setText(currentPlanet.getSize().toString());
        currentResource.setText(currentPlanet.getResource().toString());
        currentTech.setText(currentPlanet.getTechLevel().toString());
        currentCoordinates.setText(currentPlanet.getCoordinates());

        //set target planet stats
        Planet targetPlanet = new Planet(planetSpinner.getSelectedItem().toString());
        nextSize.setText(targetPlanet.getSize().toString());
        nextResource.setText(targetPlanet.getResource().toString());
        nextTech.setText(targetPlanet.getTechLevel().toString());
        nextCoordinates.setText(targetPlanet.getCoordinates());

    }
}
