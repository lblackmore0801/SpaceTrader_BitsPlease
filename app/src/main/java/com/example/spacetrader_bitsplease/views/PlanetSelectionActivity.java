package com.example.spacetrader_bitsplease.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.spacetrader_bitsplease.R;
import com.example.spacetrader_bitsplease.entity.Planet;
import com.example.spacetrader_bitsplease.entity.PlanetName;
import com.example.spacetrader_bitsplease.model.Repository;

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

    private TextView waterPrice;
    private TextView furPrice;
    private TextView foodPrice;
    private TextView orePrice;
    private TextView gamesPrice;
    private TextView firearmPrice;
    private TextView medicinePrice;
    private TextView machinePrice;
    private TextView narcoticPrice;
    private TextView robotsPrice;

    private TextView waterSell;
    private TextView furSell;
    private TextView foodSell;
    private TextView oreSell;
    private TextView gamesSell;
    private TextView firearmSell;
    private TextView medicineSell;
    private TextView machineSell;
    private TextView narcoticSell;
    private TextView robotsSell;

    private TextView waterQuant;
    private TextView furQuant;
    private TextView foodQuant;
    private TextView oreQuant;
    private TextView gamesQuant;
    private TextView firearmQuant;
    private TextView medicineQuant;
    private TextView machineQuant;
    private TextView narcoticQuant;
    private TextView robotsQuant;

    private TextView waterQuantSell;
    private TextView furQuantSell;
    private TextView foodQuantSell;
    private TextView oreQuantSell;
    private TextView gamesQuantSell;
    private TextView firearmQuantSell;
    private TextView medicineQuantSell;
    private TextView machineQuantSell;
    private TextView narcoticQuantSell;
    private TextView robotsQuantSell;

    private Planet planet;
    private Repository repo = new Repository();

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

        waterPrice = findViewById(R.id.waterPriceBuy);
        furPrice = findViewById(R.id.furPriceBuy);
        foodPrice = findViewById(R.id.foodPriceBuy);
        orePrice = findViewById(R.id.orePriceBuy);
        gamesPrice = findViewById(R.id.gamePriceBuy);
        firearmPrice = findViewById(R.id.firearmPriceBuy);
        medicinePrice = findViewById(R.id.medicinePriceBuy);
        machinePrice = findViewById(R.id.machinePriceBuy);
        narcoticPrice = findViewById(R.id.narcoticsPriceBuy);
        robotsPrice = findViewById(R.id.robotPriceBuy);

        waterSell = findViewById(R.id.waterPriceSell);
        furSell = findViewById(R.id.furPriceSell);
        foodSell = findViewById(R.id.foodPriceSell);
        oreSell = findViewById(R.id.orePriceSell);
        gamesSell = findViewById(R.id.gamePriceSell);
        firearmSell = findViewById(R.id.firearmPriceSell);
        medicineSell = findViewById(R.id.medicinePriceSell);
        machineSell = findViewById(R.id.MachinePriceSell);
        narcoticSell = findViewById(R.id.narcoticsPriceSell);
        robotsSell = findViewById(R.id.robotPriceSell);

        waterQuant = findViewById(R.id.singleWaterBuy_button);
        furQuant = findViewById(R.id.singleFurBuy_button);
        foodQuant = findViewById(R.id.singleFoodBuy_button);
        oreQuant = findViewById(R.id.singleOreBuy_button);
        gamesQuant = findViewById(R.id.singleGameBuy_button19);
        firearmQuant = findViewById(R.id.singleFirearmBuy_button);
        medicineQuant = findViewById(R.id.singleMedicineBuy_button);
        machineQuant = findViewById(R.id.singleMachineBuy_button20);
        narcoticQuant = findViewById(R.id.singleNarcoticsBuy_button21);
        robotsQuant = findViewById(R.id.singleRobotBuy_button);

        waterQuantSell = findViewById(R.id.singleWaterSell_button);
        furQuantSell = findViewById(R.id.singleFurSell_button);
        foodQuantSell = findViewById(R.id.singleFoodSell_button);
        oreQuantSell = findViewById(R.id.singleOreSell_button);
        gamesQuantSell = findViewById(R.id.singleGameSell_button);
        firearmQuantSell = findViewById(R.id.singleFirearmSell_button);
        medicineQuantSell = findViewById(R.id.singleMedicineSell_button);
        machineQuantSell = findViewById(R.id.singleMachineSell_button);
        narcoticQuantSell = findViewById(R.id.singleNarcoticSell_button);
        robotsQuantSell = findViewById(R.id.singleRobotSell_button);

        //set current planet stats
        Planet currentPlanet = new Planet();
        repo.assignPrices(currentPlanet);
        repo.assignProductQuantity(currentPlanet);
        currentName.setText(currentPlanet.getPlanetName().toString());
        currentSize.setText(currentPlanet.getSize().toString());
        currentResource.setText(currentPlanet.getCondition().toString());
        currentTech.setText(currentPlanet.getTechLevel().toString());
        currentCoordinates.setText(currentPlanet.getCoordinates());

        waterPrice.setText(""+currentPlanet.getWaterPrice());
        furPrice.setText(""+currentPlanet.getFurPrice());
        foodPrice.setText(""+currentPlanet.getFoodPrice());
        orePrice.setText(""+currentPlanet.getOrePrice());
        gamesPrice.setText(""+currentPlanet.getGamePrice());
        firearmPrice.setText(""+currentPlanet.getFirearmPrice());
        medicinePrice.setText(""+currentPlanet.getMedicinePrice());
        machinePrice.setText(""+currentPlanet.getMachinePrice());
        narcoticPrice.setText(""+currentPlanet.getNarcoticPrice());
        robotsPrice.setText(""+currentPlanet.getRobotPrice());

        waterSell.setText(""+currentPlanet.getWaterSell());
        furSell.setText(""+currentPlanet.getFurSell());
        foodSell.setText(""+currentPlanet.getFoodSell());
        oreSell.setText(""+currentPlanet.getOreSell());
        gamesSell.setText(""+currentPlanet.getGameSell());
        firearmSell.setText(""+currentPlanet.getFirearmSell());
        medicineSell.setText(""+currentPlanet.getMedicineSell());
        machineSell.setText(""+currentPlanet.getMachineSell());
        narcoticSell.setText(""+currentPlanet.getNarcoticSell());
        robotsSell.setText(""+currentPlanet.getRobotSell());

        waterQuant.setText(""+currentPlanet.getWaterQuant());
        furQuant.setText(""+currentPlanet.getFurQuant());
        foodQuant.setText(""+currentPlanet.getFoodQuant());
        oreQuant.setText(""+currentPlanet.getOreQuant());
        gamesQuant.setText(""+currentPlanet.getGameQuant());
        firearmQuant.setText(""+currentPlanet.getFirearmQuant());
        medicineQuant.setText(""+currentPlanet.getMedicineQuant());
        machineQuant.setText(""+currentPlanet.getMachineQuant());
        narcoticQuant.setText(""+currentPlanet.getNarcoticQuant());
        robotsQuant.setText(""+currentPlanet.getRobotQuant());

        waterQuantSell.setText(""+currentPlanet.getWaterQuantSell());
        furQuantSell.setText(""+currentPlanet.getFurQuantSell());
        foodQuantSell.setText(""+currentPlanet.getFoodQuantSell());
        oreQuantSell.setText(""+currentPlanet.getOreQuantSell());
        gamesQuantSell.setText(""+currentPlanet.getGameQuantSell());
        firearmQuantSell.setText(""+currentPlanet.getFirearmQuantSell());
        medicineQuantSell.setText(""+currentPlanet.getMedicineQuantSell());
        machineQuantSell.setText(""+currentPlanet.getMachineQuantSell());
        narcoticQuantSell.setText(""+currentPlanet.getNarcoticQuantSell());
        robotsQuantSell.setText(""+currentPlanet.getRobotQuantSell());

        //create and populate spinner for target planets
        ArrayAdapter<PlanetName> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, PlanetName.values());
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        planetSpinner = findViewById(R.id.planet_spinner);
        planetSpinner.setAdapter(adapter);

        planetSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                PlanetName target = (PlanetName) adapterView.getItemAtPosition(position);
                //set target planet stats
                Planet targetPlanet = new Planet(target);
                nextSize.setText(targetPlanet.getSize().toString());
                nextResource.setText(targetPlanet.getCondition().toString());
                nextTech.setText(targetPlanet.getTechLevel().toString());
                nextCoordinates.setText(targetPlanet.getCoordinates());
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });

    }
}
