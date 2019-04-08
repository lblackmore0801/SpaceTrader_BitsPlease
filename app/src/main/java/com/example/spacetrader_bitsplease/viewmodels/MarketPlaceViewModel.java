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
    //public static int money = 1000;
    public static int money = Player.getMoney();

    private static int waterResourceinHold;
    private static int furResourceinHold;
    private static int foodResourceinHold;
    private static int oreResourceinHold;
    private static int gameResourceinHold;
    private static int firearmsResourceinHold;
    private static int machineResourceinHold;
    private static int medicineResourceinHold;
    private static int narcoticResourceinHold;
    private static int robotResourceinHold;

    public MarketPlaceViewModel(int money, int remainingStorageCapacity) {
        this.remainingStorageCapacity = remainingStorageCapacity;
        this.money = Player.getMoney();
        this.waterResourceinHold = 0;
        this.furResourceinHold = 0;
    }


    public static int getNarcoticResourceinHold() {
        return narcoticResourceinHold;
    }

    public static int getFirearmsResourceinHold() {
        return firearmsResourceinHold;
    }

    public static void setNarcoticResourceinHold(int input) {
        narcoticResourceinHold = input;
    }

    public static void setFirearmsResourceinHold(int input) {
        firearmsResourceinHold = input;
    }

    //only buy a resource if you have sufficient funds and storage capacity

    public static boolean canBuy(int price, int quantity) {
        if (((price * quantity) <= Player.getMoney()) && (remainingStorageCapacity > 0)) {
            return true;
        }
        return false;
    }

    public static void buyOneWater(Planet currentPlanet) {
        if (canBuy(currentPlanet.getWaterPrice(), 1)) {
            Player.setMoney(Player.getMoney() - currentPlanet.getWaterPrice());
            remainingStorageCapacity -= 1;
            waterResourceinHold++;
        }
    }

    public static void buyOneFur(Planet currentPlanet) {
        if (canBuy(currentPlanet.getFurPrice(), 1)) {
            money -= currentPlanet.getFurPrice();
            remainingStorageCapacity -= 1;
            furResourceinHold++;
        }
    }

    public static void buyOneFood(Planet currentPlanet) {
        if (canBuy(currentPlanet.getFoodPrice(), 1)) {
            money -= currentPlanet.getFoodPrice();
            remainingStorageCapacity -= 1;
            foodResourceinHold++;
        }
    }

    public static void buyOneOre(Planet currentPlanet) {
        if (canBuy(currentPlanet.getOrePrice(), 1)) {
            money -= currentPlanet.getOrePrice();
            remainingStorageCapacity -= 1;
            oreResourceinHold++;
        }
    }

    public static void buyOneGame(Planet currentPlanet) {
        if (canBuy(currentPlanet.getGamePrice(), 1)) {
            money -= currentPlanet.getGamePrice();
            remainingStorageCapacity -= 1;
            gameResourceinHold++;
        }
    }

    public static void buyOneFirearm(Planet currentPlanet) {
        if (canBuy(currentPlanet.getFirearmPrice(), 1)) {
            money -= currentPlanet.getFirearmPrice();
            remainingStorageCapacity -= 1;
            firearmsResourceinHold++;
        }
    }

    public static void buyOneMedicine(Planet currentPlanet) {
        if (canBuy(currentPlanet.getMedicinePrice(), 1)) {
            money -= currentPlanet.getMedicinePrice();
            remainingStorageCapacity -= 1;
            medicineResourceinHold++;
        }
    }

    public static void buyOneMachine(Planet currentPlanet) {
        if (canBuy(currentPlanet.getMachinePrice(), 1)) {
            money -= currentPlanet.getMachinePrice();
            remainingStorageCapacity -= 1;
            machineResourceinHold++;
        }
    }

    public static void buyOneNarcotic(Planet currentPlanet) {
        if (canBuy(currentPlanet.getNarcoticPrice(), 1)) {
            money -= currentPlanet.getNarcoticPrice();
            remainingStorageCapacity -= 1;
            narcoticResourceinHold++;
        }
    }

    public static void buyOneRobot(Planet currentPlanet) {
        if (canBuy(currentPlanet.getRobotPrice(), 1)) {
            money -= currentPlanet.getRobotPrice();
            remainingStorageCapacity -= 1;
            robotResourceinHold++;
        }
    }

    /*
    * Selling stuff
     */

    public static void sellWater(Planet currentPlanet) {
        if (waterResourceinHold > 0 && remainingStorageCapacity >= 0) {
            int currentWaterQuant = currentPlanet.getWaterQuant();
            currentPlanet.setWaterQuant(currentWaterQuant + 1);
            waterResourceinHold--;
            remainingStorageCapacity++;
            money += currentPlanet.getWaterSell();
        }
    }

    public static void sellFur(Planet currentPlanet) {
        if (furResourceinHold > 0 && remainingStorageCapacity >= 0) {
            int currentFurQuant = currentPlanet.getFurQuant();
            currentPlanet.setFurQuant(currentFurQuant + 1);
            furResourceinHold--;
            remainingStorageCapacity++;
            money += currentPlanet.getFurSell();
        }
    }

    public static void sellFood(Planet currentPlanet) {
        if (foodResourceinHold > 0 && remainingStorageCapacity >= 0) {
            int currentFoodQuant = currentPlanet.getFoodQuant();
            currentPlanet.setFoodQuant(currentFoodQuant + 1);
            foodResourceinHold--;
            remainingStorageCapacity++;
            money += currentPlanet.getFoodSell();
        }
    }

    public static void sellOre(Planet currentPlanet) {
        if (oreResourceinHold > 0 && remainingStorageCapacity >= 0) {
            int currentOreQuant = currentPlanet.getOreQuant();
            currentPlanet.setOreQuant(currentOreQuant + 1);
            oreResourceinHold--;
            remainingStorageCapacity++;
            money += currentPlanet.getOreSell();
        }
    }

    public static void sellGame(Planet currentPlanet) {
        if (gameResourceinHold > 0 && remainingStorageCapacity >= 0) {
            int currentGameQuant = currentPlanet.getGameQuant();
            currentPlanet.setGameQuant(currentGameQuant + 1);
            gameResourceinHold--;
            remainingStorageCapacity++;
            money += currentPlanet.getGameSell();
        }
    }

    public static void sellFirearm(Planet currentPlanet) {
        if (firearmsResourceinHold > 0 && remainingStorageCapacity >= 0) {
            int currentFirearmQuant = currentPlanet.getFirearmQuant();
            currentPlanet.setFirearmQuant(currentFirearmQuant + 1);
            firearmsResourceinHold--;
            remainingStorageCapacity++;
            money += currentPlanet.getFirearmSell();
        }
    }

    public static void sellMedicine(Planet currentPlanet) {
        if (medicineResourceinHold > 0 && remainingStorageCapacity >= 0) {
            int currentMedicineQuant = currentPlanet.getMedicineQuant();
            currentPlanet.setMedicineQuant(currentMedicineQuant + 1);
            medicineResourceinHold--;
            remainingStorageCapacity++;
            money += currentPlanet.getMedicineSell();
        }
    }

    public static void sellMachine(Planet currentPlanet) {
        if (machineResourceinHold > 0 && remainingStorageCapacity >= 0) {
            int currentMachineQuant = currentPlanet.getMachineQuant();
            currentPlanet.setMachineQuant(currentMachineQuant + 1);
            machineResourceinHold--;
            remainingStorageCapacity++;
            money += currentPlanet.getMachineSell();
        }
    }

    public static void sellNarcotic(Planet currentPlanet) {
        if (narcoticResourceinHold > 0 && remainingStorageCapacity >= 0) {
            int currentNarcoticQuant = currentPlanet.getNarcoticQuant();
            currentPlanet.setNarcoticQuant(currentNarcoticQuant + 1);
            narcoticResourceinHold--;
            remainingStorageCapacity++;
            money += currentPlanet.getNarcoticSell();
        }
    }

    public static void sellRobot(Planet currentPlanet) {
        if (robotResourceinHold > 0 && remainingStorageCapacity >= 0) {
            int currentRobotQuant = currentPlanet.getRobotQuant();
            currentPlanet.setRobotQuant(currentRobotQuant + 1);
            robotResourceinHold--;
            remainingStorageCapacity++;
            money += currentPlanet.getRobotSell();
        }
    }
}
