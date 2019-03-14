package com.example.spacetrader_bitsplease.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.spacetrader_bitsplease.R;
import com.example.spacetrader_bitsplease.entity.Planet;
import com.example.spacetrader_bitsplease.entity.PlanetName;
import com.example.spacetrader_bitsplease.entity.Player;
import com.example.spacetrader_bitsplease.entity.ShipType;
import com.example.spacetrader_bitsplease.model.Repository;
import com.example.spacetrader_bitsplease.viewmodels.MarketPlaceViewModel;


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

    private TextView credits;
    private TextView usedBays;

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

        credits = findViewById(R.id.Credits_display);
        usedBays = findViewById(R.id.UsedBays);

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
        final Planet currentPlanet = new Planet();
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


        /**
         * BUYING
         */

        final int storageCapacity = 15;

        final Button buySingleWater = findViewById(R.id.singleWaterBuy_button);
        final Button buyAllWater = findViewById(R.id.allWaterBuy_button);

        buySingleWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentPlanet.getWaterQuant() > 0 && MarketPlaceViewModel.canBuy(currentPlanet.getWaterPrice(), 1)) {
                    currentPlanet.setWaterQuant(currentPlanet.getWaterQuant() - 1);
                    buySingleWater.setText("" + currentPlanet.getWaterQuant());
                }
                MarketPlaceViewModel.buyOneWater(currentPlanet);
                credits.setText(""+MarketPlaceViewModel.money);
                int used = storageCapacity - MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText(""+used);

            }
        });

        buyAllWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MarketPlaceViewModel.remainingStorageCapacity > 0 && MarketPlaceViewModel.money > 0) {
                    currentPlanet.setWaterQuant(currentPlanet.getWaterQuant() - 1);
                    MarketPlaceViewModel.buyOneWater(currentPlanet);
                }
                buySingleWater.setText("" + currentPlanet.getWaterQuant());
                credits.setText("" + MarketPlaceViewModel.money);
                int used = storageCapacity - MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText("" + used);
            }
        });

        final Button buySingleFur = findViewById(R.id.singleFurBuy_button);
        final Button buyAllFur = findViewById(R.id.allFurBuy_button);

        buySingleFur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentPlanet.getFurQuant() > 0 && MarketPlaceViewModel.canBuy(currentPlanet.getFurPrice(), 1)) {
                    currentPlanet.setFurQuant(currentPlanet.getFurQuant() - 1);
                    buySingleWater.setText("" + currentPlanet.getFurQuant());
                }
                MarketPlaceViewModel.buyOneFur(currentPlanet);
                credits.setText(""+MarketPlaceViewModel.money);
                int used = storageCapacity - MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText(""+used);
            }
        });

        buyAllFur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MarketPlaceViewModel.remainingStorageCapacity > 0 && MarketPlaceViewModel.money > 0) {
                    currentPlanet.setFurQuant(currentPlanet.getFurQuant() - 1);
                    MarketPlaceViewModel.buyOneFur(currentPlanet);
                }
                buySingleFur.setText("" + currentPlanet.getFurQuant());
                credits.setText("" + MarketPlaceViewModel.money);
                int used = storageCapacity - MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText("" + used);
            }
        });

        final Button buySingleFood = findViewById(R.id.singleFoodBuy_button);
        final Button buyAllFood = findViewById(R.id.allFoodBuy_button);

        buySingleFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentPlanet.getFoodQuant() > 0 && MarketPlaceViewModel.canBuy(currentPlanet.getFoodPrice(), 1)) {
                    currentPlanet.setFoodQuant(currentPlanet.getFoodQuant() - 1);
                    buySingleWater.setText("" + currentPlanet.getFoodQuant());
                }
                MarketPlaceViewModel.buyOneFood(currentPlanet);
                credits.setText(""+MarketPlaceViewModel.money);
                int used = storageCapacity - MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText(""+used);
            }
        });

        buyAllFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MarketPlaceViewModel.remainingStorageCapacity > 0 && MarketPlaceViewModel.money > 0) {
                    currentPlanet.setFoodQuant(currentPlanet.getFoodQuant() - 1);
                    MarketPlaceViewModel.buyOneFood(currentPlanet);
                }
                buySingleFood.setText("" + currentPlanet.getFoodQuant());
                credits.setText("" + MarketPlaceViewModel.money);
                int used = storageCapacity - MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText("" + used);
            }
        });

        final Button buySingleOre = findViewById(R.id.singleOreBuy_button);
        final Button buyAllOre = findViewById(R.id.allOreBuy_button);

        buySingleOre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentPlanet.getOreQuant() > 0 && MarketPlaceViewModel.canBuy(currentPlanet.getOrePrice(), 1)) {
                    currentPlanet.setOreQuant(currentPlanet.getOreQuant() - 1);
                    buySingleWater.setText("" + currentPlanet.getOreQuant());
                }
                MarketPlaceViewModel.buyOneOre(currentPlanet);
                credits.setText(""+MarketPlaceViewModel.money);
                int used = storageCapacity - MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText(""+used);
            }
        });

        buyAllOre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MarketPlaceViewModel.remainingStorageCapacity > 0 && MarketPlaceViewModel.money > 0) {
                    currentPlanet.setOreQuant(currentPlanet.getOreQuant() - 1);
                    MarketPlaceViewModel.buyOneOre(currentPlanet);
                }
                buySingleOre.setText("" + currentPlanet.getOreQuant());
                credits.setText("" + MarketPlaceViewModel.money);
                int used = storageCapacity - MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText("" + used);
            }
        });


        final Button buySingleGame = findViewById(R.id.singleGameBuy_button19);
        final Button buyAllGame = findViewById(R.id.allGameBuy_button);

        buySingleGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentPlanet.getGameQuant() > 0 && MarketPlaceViewModel.canBuy(currentPlanet.getGamePrice(), 1)) {
                    currentPlanet.setGameQuant(currentPlanet.getGameQuant() - 1);
                    buySingleWater.setText("" + currentPlanet.getGameQuant());
                }
                MarketPlaceViewModel.buyOneGame(currentPlanet);
                credits.setText(""+MarketPlaceViewModel.money);
                int used = storageCapacity - MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText(""+used);
            }
        });

        buyAllGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MarketPlaceViewModel.remainingStorageCapacity > 0 && MarketPlaceViewModel.money > 0) {
                    currentPlanet.setGameQuant(currentPlanet.getGameQuant() - 1);
                    MarketPlaceViewModel.buyOneGame(currentPlanet);
                }
                buySingleGame.setText("" + currentPlanet.getGameQuant());
                credits.setText("" + MarketPlaceViewModel.money);
                int used = storageCapacity - MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText("" + used);
            }
        });


        final Button buySingleFirearm = findViewById(R.id.singleFirearmBuy_button);
        final Button buyAllFirearms = findViewById(R.id.allFirearmBuy_button);

        buySingleFirearm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentPlanet.getFirearmQuant() > 0 && MarketPlaceViewModel.canBuy(currentPlanet.getFirearmPrice(), 1)) {
                    currentPlanet.setFirearmQuant(currentPlanet.getFirearmQuant() - 1);
                    buySingleWater.setText("" + currentPlanet.getFirearmQuant());
                }
                MarketPlaceViewModel.buyOneFirearm(currentPlanet);
                credits.setText(""+MarketPlaceViewModel.money);
                int used = storageCapacity - MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText(""+used);
            }
        });

        buyAllFirearms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MarketPlaceViewModel.remainingStorageCapacity > 0 && MarketPlaceViewModel.money > 0) {
                    currentPlanet.setFirearmQuant(currentPlanet.getFirearmQuant() - 1);
                    MarketPlaceViewModel.buyOneFirearm(currentPlanet);
                }
                buySingleFirearm.setText("" + currentPlanet.getFirearmQuant());
                credits.setText("" + MarketPlaceViewModel.money);
                int used = storageCapacity - MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText("" + used);
            }
        });


        final Button buySingleMedicine = findViewById(R.id.singleMedicineBuy_button);
        final Button buyAllMedicine = findViewById(R.id.allMedicineBuy_button);

        buySingleMedicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentPlanet.getMedicineQuant() > 0 && MarketPlaceViewModel.canBuy(currentPlanet.getMedicinePrice(), 1)) {
                    currentPlanet.setMedicineQuant(currentPlanet.getMedicineQuant() - 1);
                    buySingleWater.setText("" + currentPlanet.getMedicineQuant());
                }
                MarketPlaceViewModel.buyOneMedicine(currentPlanet);
                credits.setText(""+MarketPlaceViewModel.money);
                int used = storageCapacity - MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText(""+used);
            }
        });

        buyAllMedicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MarketPlaceViewModel.remainingStorageCapacity > 0 && MarketPlaceViewModel.money > 0) {
                    currentPlanet.setMedicineQuant(currentPlanet.getMedicineQuant() - 1);
                    MarketPlaceViewModel.buyOneMedicine(currentPlanet);
                }
                buySingleMedicine.setText("" + currentPlanet.getMedicineQuant());
                credits.setText("" + MarketPlaceViewModel.money);
                int used = storageCapacity - MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText("" + used);
            }
        });


        final Button buySingleMachine = findViewById(R.id.singleMachineBuy_button20);
        final Button buyAllMachines = findViewById(R.id.allMachineBuy_button);

        buySingleMachine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentPlanet.getMachineQuant() > 0 && MarketPlaceViewModel.canBuy(currentPlanet.getMachinePrice(), 1)) {
                    currentPlanet.setMachineQuant(currentPlanet.getMachineQuant() - 1);
                    buySingleWater.setText("" + currentPlanet.getMachineQuant());
                }
                MarketPlaceViewModel.buyOneMachine(currentPlanet);
                credits.setText(""+MarketPlaceViewModel.money);
                int used = storageCapacity - MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText(""+used);
            }
        });

        buyAllMachines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MarketPlaceViewModel.remainingStorageCapacity > 0 && MarketPlaceViewModel.money > 0) {
                    currentPlanet.setMachineQuant(currentPlanet.getMachineQuant() - 1);
                    MarketPlaceViewModel.buyOneMachine(currentPlanet);
                }
                buySingleMachine.setText("" + currentPlanet.getMachineQuant());
                credits.setText("" + MarketPlaceViewModel.money);
                int used = storageCapacity - MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText("" + used);
            }
        });


        final Button buySingleNarcotic = findViewById(R.id.singleNarcoticsBuy_button21);
        final Button buyAllNarcotics = findViewById(R.id.allNarcoticBuy_button);

        buySingleNarcotic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentPlanet.getNarcoticQuant() > 0 && MarketPlaceViewModel.canBuy(currentPlanet.getNarcoticPrice(), 1)) {
                    currentPlanet.setNarcoticQuant(currentPlanet.getNarcoticQuant() - 1);
                    buySingleWater.setText("" + currentPlanet.getNarcoticQuant());
                }
                MarketPlaceViewModel.buyOneNarcotic(currentPlanet);
                credits.setText(""+MarketPlaceViewModel.money);
                int used = storageCapacity - MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText(""+used);
            }
        });

        buyAllNarcotics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MarketPlaceViewModel.remainingStorageCapacity > 0 && MarketPlaceViewModel.money > 0) {
                    currentPlanet.setNarcoticQuant(currentPlanet.getNarcoticQuant() - 1);
                    MarketPlaceViewModel.buyOneNarcotic(currentPlanet);
                }
                buySingleNarcotic.setText("" + currentPlanet.getNarcoticQuant());
                credits.setText("" + MarketPlaceViewModel.money);
                int used = storageCapacity - MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText("" + used);
            }
        });


        final Button buySingleRobot = findViewById(R.id.singleRobotBuy_button);
        final Button buyAllRobot = findViewById(R.id.allRobotBuy_button);

        buySingleRobot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentPlanet.getRobotQuant() > 0 && MarketPlaceViewModel.canBuy(currentPlanet.getRobotPrice(), 1)) {
                    currentPlanet.setRobotQuant(currentPlanet.getRobotQuant() - 1);
                    buySingleWater.setText("" + currentPlanet.getRobotQuant());
                }
                MarketPlaceViewModel.buyOneRobot(currentPlanet);
                credits.setText(""+MarketPlaceViewModel.money);
                int used = storageCapacity - MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText(""+used);
            }
        });

        buyAllRobot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MarketPlaceViewModel.remainingStorageCapacity > 0 && MarketPlaceViewModel.money > 0) {
                    currentPlanet.setRobotQuant(currentPlanet.getRobotQuant() - 1);
                    MarketPlaceViewModel.buyOneRobot(currentPlanet);
                }
                buySingleRobot.setText("" + currentPlanet.getRobotQuant());
                credits.setText("" + MarketPlaceViewModel.money);
                int used = storageCapacity - MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText("" + used);
            }
        });


/**
 * SELLING
 */

        final Button sellSingleWater = findViewById(R.id.singleWaterSell_button);
        final Button sellAllWater = findViewById(R.id.allWaterSell_button);

        sellSingleWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MarketPlaceViewModel.buyOneWater(currentPlanet);
                credits.setText(""+MarketPlaceViewModel.money);
                int used = storageCapacity - 1;
                usedBays.setText(""+used);
            }
        });

        sellAllWater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MarketPlaceViewModel.remainingStorageCapacity > 0 && MarketPlaceViewModel.money > 0) {
                    MarketPlaceViewModel.buyOneWater(currentPlanet);
                }
                credits.setText("" + MarketPlaceViewModel.money);
                int used = storageCapacity + MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText("" + used);
            }
        });

        final Button sellSingleFur = findViewById(R.id.singleFurSell_button);
        final Button sellAllFur = findViewById(R.id.allFurSell_button);

        sellSingleFur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MarketPlaceViewModel.buyOneFur(currentPlanet);
                credits.setText(""+MarketPlaceViewModel.money);
                int used = storageCapacity + MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText(""+used);
            }
        });

        sellAllFur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MarketPlaceViewModel.remainingStorageCapacity > 0 && MarketPlaceViewModel.money > 0) {
                    MarketPlaceViewModel.buyOneFur(currentPlanet);
                }
                credits.setText("" + MarketPlaceViewModel.money);
                int used = storageCapacity + MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText("" + used);
            }
        });

        final Button sellSingleFood = findViewById(R.id.singleFoodSell_button);
        final Button sellAllFood = findViewById(R.id.allFoodSell_button);

        sellSingleFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MarketPlaceViewModel.buyOneFood(currentPlanet);
                credits.setText(""+MarketPlaceViewModel.money);
                int used = storageCapacity + MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText(""+used);
            }
        });

        sellAllFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MarketPlaceViewModel.remainingStorageCapacity > 0 && MarketPlaceViewModel.money > 0) {
                    MarketPlaceViewModel.buyOneFood(currentPlanet);
                }
                credits.setText("" + MarketPlaceViewModel.money);
                int used = storageCapacity + MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText("" + used);
            }
        });

        final Button sellSingleOre = findViewById(R.id.singleOreSell_button);
        final Button sellAllOre = findViewById(R.id.allOreSell_button);

        sellSingleOre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MarketPlaceViewModel.buyOneOre(currentPlanet);
                credits.setText(""+MarketPlaceViewModel.money);
                int used = storageCapacity + MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText(""+used);
            }
        });

        sellAllOre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MarketPlaceViewModel.remainingStorageCapacity > 0 && MarketPlaceViewModel.money > 0) {
                    MarketPlaceViewModel.buyOneOre(currentPlanet);
                }
                credits.setText("" + MarketPlaceViewModel.money);
                int used = storageCapacity + MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText("" + used);
            }
        });


        final Button sellSingleGame = findViewById(R.id.singleGameSell_button);
        final Button sellAllGame = findViewById(R.id.allGamesSell_button);

        sellSingleGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MarketPlaceViewModel.buyOneGame(currentPlanet);
                credits.setText(""+MarketPlaceViewModel.money);
                int used = storageCapacity + MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText(""+used);
            }
        });

        sellAllGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MarketPlaceViewModel.remainingStorageCapacity > 0 && MarketPlaceViewModel.money > 0) {
                    MarketPlaceViewModel.buyOneGame(currentPlanet);
                }
                credits.setText("" + MarketPlaceViewModel.money);
                int used = storageCapacity + MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText("" + used);
            }
        });


        final Button sellSingleFirearm = findViewById(R.id.singleFirearmSell_button);
        final Button sellAllFirearms = findViewById(R.id.allFirearmsSell_button);

        sellSingleFirearm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MarketPlaceViewModel.buyOneFirearm(currentPlanet);
                credits.setText(""+MarketPlaceViewModel.money);
                int used = storageCapacity + MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText(""+used);
            }
        });

        sellAllFirearms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MarketPlaceViewModel.remainingStorageCapacity > 0 && MarketPlaceViewModel.money > 0) {
                    MarketPlaceViewModel.buyOneFirearm(currentPlanet);
                }
                credits.setText("" + MarketPlaceViewModel.money);
                int used = storageCapacity + MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText("" + used);
            }
        });


        final Button sellSingleMedicine = findViewById(R.id.singleMedicineSell_button);
        final Button sellAllMedicine = findViewById(R.id.allMedicineSell_button);

        sellSingleMedicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MarketPlaceViewModel.buyOneMedicine(currentPlanet);
                credits.setText(""+MarketPlaceViewModel.money);
                int used = storageCapacity + MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText(""+used);
            }
        });

        sellAllMedicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MarketPlaceViewModel.remainingStorageCapacity > 0 && MarketPlaceViewModel.money > 0) {
                    MarketPlaceViewModel.buyOneMedicine(currentPlanet);
                }
                credits.setText("" + MarketPlaceViewModel.money);
                int used = storageCapacity + MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText("" + used);
            }
        });


        final Button sellSingleMachine = findViewById(R.id.singleMachineSell_button);
        final Button sellAllMachines = findViewById(R.id.allMedicineSell_button2);

        sellSingleMachine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MarketPlaceViewModel.buyOneMachine(currentPlanet);
                credits.setText(""+MarketPlaceViewModel.money);
                int used = storageCapacity + MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText(""+used);
            }
        });

        sellAllMachines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MarketPlaceViewModel.remainingStorageCapacity > 0 && MarketPlaceViewModel.money > 0) {
                    MarketPlaceViewModel.buyOneMachine(currentPlanet);
                }
                credits.setText("" + MarketPlaceViewModel.money);
                int used = storageCapacity + MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText("" + used);
            }
        });


        final Button sellSingleNarcotic = findViewById(R.id.singleNarcoticSell_button);
        final Button sellAllNarcotics = findViewById(R.id.allNarcoticSell_button);

        sellSingleNarcotic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MarketPlaceViewModel.buyOneNarcotic(currentPlanet);
                credits.setText(""+MarketPlaceViewModel.money);
                int used = storageCapacity + MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText(""+used);
            }
        });

        sellAllNarcotics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MarketPlaceViewModel.remainingStorageCapacity > 0 && MarketPlaceViewModel.money > 0) {
                    MarketPlaceViewModel.buyOneNarcotic(currentPlanet);
                }
                credits.setText("" + MarketPlaceViewModel.money);
                int used = storageCapacity + MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText("" + used);
            }
        });


        final Button sellSingleRobot = findViewById(R.id.singleRobotSell_button);
        final Button sellAllRobot = findViewById(R.id.allMedicineSell_button4);

        sellSingleRobot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MarketPlaceViewModel.buyOneRobot(currentPlanet);
                credits.setText(""+MarketPlaceViewModel.money);
                int used = storageCapacity + MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText(""+used);
            }
        });

        sellAllRobot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                while (MarketPlaceViewModel.remainingStorageCapacity > 0 && MarketPlaceViewModel.money > 0) {
                    MarketPlaceViewModel.buyOneRobot(currentPlanet);
                }
                credits.setText("" + MarketPlaceViewModel.money);
                int used = storageCapacity + MarketPlaceViewModel.remainingStorageCapacity;
                usedBays.setText("" + used);
            }
        });



    }
}
