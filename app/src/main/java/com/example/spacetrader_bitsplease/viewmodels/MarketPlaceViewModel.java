package com.example.spacetrader_bitsplease.viewmodels;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

import com.example.spacetrader_bitsplease.R;
import com.example.spacetrader_bitsplease.entity.Condition;
import com.example.spacetrader_bitsplease.entity.Planet;
import com.example.spacetrader_bitsplease.entity.Player;
import com.example.spacetrader_bitsplease.entity.Condition;
import com.example.spacetrader_bitsplease.entity.TradeGoods;
import com.example.spacetrader_bitsplease.views.CreatePlayerActivity;
import com.example.spacetrader_bitsplease.views.PlanetSelectionActivity;

public class MarketPlaceViewModel {

    public static int remainingStorageCapacity = 15;
    public static int money = 1000;

    public MarketPlaceViewModel(int money, int remainingStorageCapacity) {
        this.remainingStorageCapacity = remainingStorageCapacity;
        this.money = Player.getMoney();
    }


    //only buy a resource if you have sufficient funds and storage capacity

    public static boolean canBuy(int price, int quantity) {
        if (((price * quantity) <= money) && (remainingStorageCapacity > 0)) {
            return true;
        }
        return false;
    }

    public static void buyOneWater(Planet currentPlanet) {
        if (canBuy(currentPlanet.getWaterPrice(), 1)) {
            money -= currentPlanet.getWaterPrice();
            remainingStorageCapacity -= 1;
        }
    }

    public static void buyOneFur(Planet currentPlanet) {
        if (canBuy(currentPlanet.getFurPrice(), 1)) {
            money -= currentPlanet.getFurPrice();
            remainingStorageCapacity -= 1;
        }
    }

    public static void buyOneFood(Planet currentPlanet) {
        if (canBuy(currentPlanet.getFoodPrice(), 1)) {
            money -= currentPlanet.getFoodPrice();
            remainingStorageCapacity -= 1;
        }
    }

    public static void buyOneOre(Planet currentPlanet) {
        if (canBuy(currentPlanet.getOrePrice(), 1)) {
            money -= currentPlanet.getOrePrice();
            remainingStorageCapacity -= 1;
        }
    }

    public static void buyOneGame(Planet currentPlanet) {
        if (canBuy(currentPlanet.getGamePrice(), 1)) {
            money -= currentPlanet.getGamePrice();
            remainingStorageCapacity -= 1;
        }
    }

    public static void buyOneFirearm(Planet currentPlanet) {
        if (canBuy(currentPlanet.getFirearmPrice(), 1)) {
            money -= currentPlanet.getFirearmPrice();
            remainingStorageCapacity -= 1;
        }
    }

    public static void buyOneMedicine(Planet currentPlanet) {
        if (canBuy(currentPlanet.getMedicinePrice(), 1)) {
            money -= currentPlanet.getMedicinePrice();
            remainingStorageCapacity -= 1;
        }
    }

    public static void buyOneMachine(Planet currentPlanet) {
        if (canBuy(currentPlanet.getMachinePrice(), 1)) {
            money -= currentPlanet.getMachinePrice();
            remainingStorageCapacity -= 1;
        }
    }

    public static void buyOneNarcotic(Planet currentPlanet) {
        if (canBuy(currentPlanet.getNarcoticPrice(), 1)) {
            money -= currentPlanet.getNarcoticPrice();
            remainingStorageCapacity -= 1;
        }
    }

    public static void buyOneRobot(Planet currentPlanet) {
        if (canBuy(currentPlanet.getRobotPrice(), 1)) {
            money -= currentPlanet.getRobotPrice();
            remainingStorageCapacity -= 1;
        }
    }

    /*
    * Selling stuff
     */

    public static void sellWater(Planet currentPlanet, Planet targetPlanet) {
        if (currentPlanet.getWaterQuant() > 0) {
            int currentWaterQuant = currentPlanet.getWaterQuant();
            currentPlanet.setWaterQuant(currentWaterQuant - 1);
            remainingStorageCapacity += (currentWaterQuant - currentPlanet.getWaterQuant());
            money += currentPlanet.getWaterSell();
        }
    }

    public static void sellFur(Planet currentPlanet) {
        if (currentPlanet.getFurQuant() > 0) {
            int currentFurQuant = currentPlanet.getFurQuant();
            currentPlanet.setFurQuant(currentFurQuant - 1);
            remainingStorageCapacity += (currentFurQuant - currentPlanet.getFurQuant());
            money += currentPlanet.getFurSell();
        }
    }

    public static void sellFood(Planet currentPlanet) {
        if (currentPlanet.getFoodQuant() > 0) {
            int currentFoodQuant = currentPlanet.getFoodQuant();
            currentPlanet.setFoodQuant(currentFoodQuant - 1);
            remainingStorageCapacity += (currentFoodQuant - currentPlanet.getFoodQuant());
            money += currentPlanet.getFoodSell();
        }
    }

    public static void sellOre(Planet currentPlanet) {
        if (currentPlanet.getOreQuant() > 0) {
            int currentOreQuant = currentPlanet.getOreQuant();
            currentPlanet.setOreQuant(currentOreQuant - 1);
            remainingStorageCapacity += (currentOreQuant - currentPlanet.getOreQuant());
            money += currentPlanet.getOreSell();
        }
    }

    public static void sellGame(Planet currentPlanet) {
        if (currentPlanet.getFoodQuant() > 0) {
            int currentGameQuant = currentPlanet.getGameQuant();
            currentPlanet.setGameQuant(currentGameQuant - 1);
            remainingStorageCapacity += (currentGameQuant - currentPlanet.getGameQuant());
            money += currentPlanet.getGameSell();
        }
    }

    public static void sellFirearm(Planet currentPlanet) {
        if (currentPlanet.getFirearmQuant() > 0) {
            int currentFirearmQuant = currentPlanet.getFirearmQuant();
            currentPlanet.setFirearmQuant(currentFirearmQuant - 1);
            remainingStorageCapacity += (currentFirearmQuant - currentPlanet.getFirearmQuant());
            money += currentPlanet.getFirearmSell();
        }
    }

    public static void sellMedicine(Planet currentPlanet) {
        if (currentPlanet.getMedicineQuant() > 0) {
            int currentMedicineQuant = currentPlanet.getMedicineQuant();
            currentPlanet.setMedicineQuant(currentMedicineQuant - 1);
            remainingStorageCapacity += (currentMedicineQuant - currentPlanet.getMedicineQuant());
            money += currentPlanet.getMedicineSell();
        }
    }

    public static void sellMachine(Planet currentPlanet) {
        if (currentPlanet.getMachineQuant() > 0) {
            int currentMachineQuant = currentPlanet.getMachineQuant();
            currentPlanet.setMachineQuant(currentMachineQuant - 1);
            remainingStorageCapacity += (currentMachineQuant - currentPlanet.getMachineQuant());
            money += currentPlanet.getMachineSell();
        }
    }

    public static void sellNarcotic(Planet currentPlanet) {
        if (currentPlanet.getNarcoticQuant() > 0) {
            int currentNarcoticQuant = currentPlanet.getNarcoticQuant();
            currentPlanet.setMedicineQuant(currentNarcoticQuant - 1);
            remainingStorageCapacity += (currentNarcoticQuant - currentPlanet.getNarcoticQuant());
            money += currentPlanet.getNarcoticSell();
        }
    }

    public static void sellRobot(Planet currentPlanet) {
        if (currentPlanet.getRobotQuant() > 0) {
            int currentRobotQuant = currentPlanet.getRobotQuant();
            currentPlanet.setRobotQuant(currentRobotQuant - 1);
            remainingStorageCapacity += (currentRobotQuant - currentPlanet.getRobotQuant());
            money += currentPlanet.getRobotSell();
        }
    }
}
