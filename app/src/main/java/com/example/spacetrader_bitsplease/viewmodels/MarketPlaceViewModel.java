package com.example.spacetrader_bitsplease.viewmodels;

//import android.app.AlertDialog;
//import android.content.Context;
//import android.content.DialogInterface;
//import android.content.Intent;

//import com.example.spacetrader_bitsplease.R;
//import com.example.spacetrader_bitsplease.entity.Condition;
import com.example.spacetrader_bitsplease.entity.Planet;
import com.example.spacetrader_bitsplease.entity.Player;
//import com.example.spacetrader_bitsplease.entity.Condition;
//import com.example.spacetrader_bitsplease.entity.TradeGoods;
//import com.example.spacetrader_bitsplease.views.CreatePlayerActivity;
//import com.example.spacetrader_bitsplease.views.PlanetSelectionActivity;

public class MarketPlaceViewModel {

    public static int remainingStorageCapacity = 15;
    //public static int money = 1000;
    //private static int money = Player.getMoney();

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

// --Commented out by Inspection START (4/15/2019 3:37 PM):
//    /**
//     * Constructor for MarketPlaceViewModel
//     * @param  remainingStorageCapacity1 storage remaining
//     */
//    public MarketPlaceViewModel(int remainingStorageCapacity1) {
//        remainingStorageCapacity = remainingStorageCapacity1;
//    }
// --Commented out by Inspection STOP (4/15/2019 3:37 PM)


//    public static int getNarcoticResourceinHold() {
//        return narcoticResourceinHold;
//    }
//
//    public static int getFirearmsResourceinHold() {
//        return firearmsResourceinHold;
//    }
//
//    public static void setNarcoticResourceinHold(int input) {
//        narcoticResourceinHold = input;
//    }

    //public static void setFirearmsResourceinHold(int input) {
    //    firearmsResourceinHold = input;
    //}

    //only buy a resource if you have sufficient funds and storage capacity


    /**
     * Constructor for MarketPlaceViewModel
     * @param  price price
     * @param  quantity quantity
     * @return whether can buy
     */
    public static boolean canBuy(int price, int quantity) {
        return (price * quantity) <= Player.getMoney() && remainingStorageCapacity > 0;
    }

    /**
     * Buy one quantity
     * @param  currentPlanet current Planet where player is
     */
    public static void buyOneWater(Planet currentPlanet) {
        if (canBuy(currentPlanet.getWaterPrice(), 1)) {
            Player.setMoney(Player.getMoney() - currentPlanet.getWaterPrice());
            remainingStorageCapacity -= 1;
            waterResourceinHold++;
        }
    }

    /**
     * Buy one quantity
     * @param  currentPlanet current Planet where player is
     */
    public static void buyOneFur(Planet currentPlanet) {
        if (canBuy(currentPlanet.getFurPrice(), 1)) {
            Player.setMoney(Player.getMoney() - currentPlanet.getFurPrice());
            remainingStorageCapacity -= 1;
            furResourceinHold++;
        }
    }

    /**
     * Buy one quantity
     * @param  currentPlanet current Planet where player is
     */
    public static void buyOneFood(Planet currentPlanet) {
        if (canBuy(currentPlanet.getFoodPrice(), 1)) {
            Player.setMoney(Player.getMoney() - currentPlanet.getFoodPrice());
            remainingStorageCapacity -= 1;
            foodResourceinHold++;
        }
    }

    /**
     * Buy one quantity
     * @param  currentPlanet current Planet where player is
     */
    public static void buyOneOre(Planet currentPlanet) {
        if (canBuy(currentPlanet.getOrePrice(), 1)) {
            Player.setMoney(Player.getMoney() - currentPlanet.getOrePrice());
            remainingStorageCapacity -= 1;
            oreResourceinHold++;
        }
    }

    /**
     * Buy one quantity
     * @param  currentPlanet current Planet where player is
     */
    public static void buyOneGame(Planet currentPlanet) {
        if (canBuy(currentPlanet.getGamePrice(), 1)) {
            Player.setMoney(Player.getMoney() - currentPlanet.getGamePrice());
            remainingStorageCapacity -= 1;
            gameResourceinHold++;
        }
    }

    /**
     * Buy one quantity
     * @param  currentPlanet current Planet where player is
     */
    public static void buyOneFirearm(Planet currentPlanet) {
        if (canBuy(currentPlanet.getFirearmPrice(), 1)) {
            Player.setMoney(Player.getMoney() - currentPlanet.getFirearmPrice());
            remainingStorageCapacity -= 1;
            firearmsResourceinHold++;
        }
    }

    /**
     * Buy one quantity
     * @param  currentPlanet current Planet where player is
     */
    public static void buyOneMedicine(Planet currentPlanet) {
        if (canBuy(currentPlanet.getMedicinePrice(), 1)) {
            Player.setMoney(Player.getMoney() - currentPlanet.getMedicinePrice());
            remainingStorageCapacity -= 1;
            medicineResourceinHold++;
        }
    }

    /**
     * Buy one quantity
     * @param  currentPlanet current Planet where player is
     */
    public static void buyOneMachine(Planet currentPlanet) {
        if (canBuy(currentPlanet.getMachinePrice(), 1)) {
            Player.setMoney(Player.getMoney() - currentPlanet.getMachinePrice());
            remainingStorageCapacity -= 1;
            machineResourceinHold++;
        }
    }

    /**
     * Buy one quantity
     * @param  currentPlanet current Planet where player is
     */
    public static void buyOneNarcotic(Planet currentPlanet) {
        if (canBuy(currentPlanet.getNarcoticPrice(), 1)) {
            Player.setMoney(Player.getMoney() - currentPlanet.getNarcoticPrice());
            remainingStorageCapacity -= 1;
            narcoticResourceinHold++;
        }
    }

    /**
     * Buy one quantity
     * @param  currentPlanet current Planet where player is
     */
    public static void buyOneRobot(Planet currentPlanet) {
        if (canBuy(currentPlanet.getRobotPrice(), 1)) {
            Player.setMoney(Player.getMoney() - currentPlanet.getRobotPrice());
            remainingStorageCapacity -= 1;
            robotResourceinHold++;
        }
    }

    /*
    * Selling stuff
     */

    /**
     * Sell one quantity
     * @param  currentPlanet current Planet where player is
     */
    public static void sellWater(Planet currentPlanet) {
        if (waterResourceinHold > 0 && remainingStorageCapacity >= 0) {
            int currentWaterQuant = currentPlanet.getWaterQuant();
            currentPlanet.setWaterQuant(currentWaterQuant + 1);
            waterResourceinHold--;
            remainingStorageCapacity++;
            Player.setMoney(Player.getMoney() + currentPlanet.getWaterSell());
        }
    }

    /**
     * Sell one quantity
     * @param  currentPlanet current Planet where player is
     */
    public static void sellFur(Planet currentPlanet) {
        if (furResourceinHold > 0 && remainingStorageCapacity >= 0) {
            int currentFurQuant = currentPlanet.getFurQuant();
            currentPlanet.setFurQuant(currentFurQuant + 1);
            furResourceinHold--;
            remainingStorageCapacity++;
            Player.setMoney(Player.getMoney() + currentPlanet.getFurSell());
        }
    }

    /**
     * Sell one quantity
     * @param  currentPlanet current Planet where player is
     */
    public static void sellFood(Planet currentPlanet) {
        if (foodResourceinHold > 0 && remainingStorageCapacity >= 0) {
            int currentFoodQuant = currentPlanet.getFoodQuant();
            currentPlanet.setFoodQuant(currentFoodQuant + 1);
            foodResourceinHold--;
            remainingStorageCapacity++;
            Player.setMoney(Player.getMoney() + currentPlanet.getFoodSell());
        }
    }

    /**
     * Sell one quantity
     * @param  currentPlanet current Planet where player is
     */
    public static void sellOre(Planet currentPlanet) {
        if (oreResourceinHold > 0 && remainingStorageCapacity >= 0) {
            int currentOreQuant = currentPlanet.getOreQuant();
            currentPlanet.setOreQuant(currentOreQuant + 1);
            oreResourceinHold--;
            remainingStorageCapacity++;
            Player.setMoney(Player.getMoney() + currentPlanet.getOreSell());
        }
    }

    /**
     * Sell one quantity
     * @param  currentPlanet current Planet where player is
     */
    public static void sellGame(Planet currentPlanet) {
        if (gameResourceinHold > 0 && remainingStorageCapacity >= 0) {
            int currentGameQuant = currentPlanet.getGameQuant();
            currentPlanet.setGameQuant(currentGameQuant + 1);
            gameResourceinHold--;
            remainingStorageCapacity++;
            Player.setMoney(Player.getMoney() + currentPlanet.getGameSell());
        }
    }

    /**
     * Sell one quantity
     * @param  currentPlanet current Planet where player is
     */
    public static void sellFirearm(Planet currentPlanet) {
        if (firearmsResourceinHold > 0 && remainingStorageCapacity >= 0) {
            int currentFirearmQuant = currentPlanet.getFirearmQuant();
            currentPlanet.setFirearmQuant(currentFirearmQuant + 1);
            firearmsResourceinHold--;
            remainingStorageCapacity++;
            Player.setMoney(Player.getMoney() + currentPlanet.getFirearmSell());
        }
    }

    /**
     * Sell one quantity
     * @param  currentPlanet current Planet where player is
     */
    public static void sellMedicine(Planet currentPlanet) {
        if (medicineResourceinHold > 0 && remainingStorageCapacity >= 0) {
            int currentMedicineQuant = currentPlanet.getMedicineQuant();
            currentPlanet.setMedicineQuant(currentMedicineQuant + 1);
            medicineResourceinHold--;
            remainingStorageCapacity++;
            Player.setMoney(Player.getMoney() + currentPlanet.getMedicineSell());
        }
    }

    /**
     * Sell one quantity
     * @param  currentPlanet current Planet where player is
     */
    public static void sellMachine(Planet currentPlanet) {
        if (machineResourceinHold > 0 && remainingStorageCapacity >= 0) {
            int currentMachineQuant = currentPlanet.getMachineQuant();
            currentPlanet.setMachineQuant(currentMachineQuant + 1);
            machineResourceinHold--;
            remainingStorageCapacity++;
            Player.setMoney(Player.getMoney() + currentPlanet.getMachineSell());
        }
    }

    /**
     * Sell one quantity
     * @param  currentPlanet current Planet where player is
     */
    public static void sellNarcotic(Planet currentPlanet) {
        if (narcoticResourceinHold > 0 && remainingStorageCapacity >= 0) {
            int currentNarcoticQuant = currentPlanet.getNarcoticQuant();
            currentPlanet.setNarcoticQuant(currentNarcoticQuant + 1);
            narcoticResourceinHold--;
            remainingStorageCapacity++;
            Player.setMoney(Player.getMoney() + currentPlanet.getNarcoticSell());
        }
    }

    /**
     * Sell one quantity
     * @param  currentPlanet current Planet where player is
     */
    public static void sellRobot(Planet currentPlanet) {
        if (robotResourceinHold > 0 && remainingStorageCapacity >= 0) {
            int currentRobotQuant = currentPlanet.getRobotQuant();
            currentPlanet.setRobotQuant(currentRobotQuant + 1);
            robotResourceinHold--;
            remainingStorageCapacity++;
            Player.setMoney(Player.getMoney() + currentPlanet.getRobotSell());
        }
    }

    /**
     * Getter for inHoldMaterial
     * @return int of materials
     */
    public static int getWaterResourceinHold() {
        return waterResourceinHold;
    }

    /**
     * Getter for inHoldMaterial
     * @return int of materials
     */
    public static int getFirearmsResourceinHold() {
        return firearmsResourceinHold;
    }

    /**
     * Getter for inHoldMaterial
     * @return int of materials
     */
    public static int getFoodResourceinHold() {
        return foodResourceinHold;
    }

    /**
     * Getter for inHoldMaterial
     * @return int of materials
     */
    public static int getFurResourceinHold() {
        return furResourceinHold;
    }

    /**
     * Getter for inHoldMaterial
     * @return int of materials
     */
    public static int getOreResourceinHold() {
        return oreResourceinHold;
    }

    /**
     * Getter for inHoldMaterial
     * @return int of materials
     */
    public static int getGameResourceinHold() {
        return gameResourceinHold;
    }

    /**
     * Getter for inHoldMaterial
     * @return int of materials
     */
    public static int getMachineResourceinHold() {
        return machineResourceinHold;
    }

    /**
     * Getter for inHoldMaterial
     * @return int of materials
     */
    public static int getMedicineResourceinHold() {
        return medicineResourceinHold;
    }

    /**
     * Getter for inHoldMaterial
     * @return int of materials
     */
    public static int getNarcoticResourceinHold() {
        return narcoticResourceinHold;
    }

    ///**
    // * Getter for inHoldMaterial
    // * @return int of materials
    // */
    //public static int getRemainingStorageCapacity() {
    //    return remainingStorageCapacity;
    //}

    /**
     * Getter for inHoldMaterial
     * @return int of materials
     */
    public static int getRobotResourceinHold() {
        return robotResourceinHold;
    }

    ///**
    // * Getter for inHoldMaterial
    // * @return int of materials
    // */
    //public static int getMoney() {
    //    return money;
    //}

    /**
     * Setter for inHoldMaterial
     * @param firearmsResourceinHold set material to this quantity
     */
    public static void setFirearmsResourceinHold(int firearmsResourceinHold) {
        MarketPlaceViewModel.firearmsResourceinHold = firearmsResourceinHold;
    }

    /**
     * Setter for inHoldMaterial
     * @param foodResourceinHold set material to this quantity
     */
    public static void setFoodResourceinHold(int foodResourceinHold) {
        MarketPlaceViewModel.foodResourceinHold = foodResourceinHold;
    }

    /**
     * Setter for inHoldMaterial
     * @param furResourceinHold set material to this quantity
     */
    public static void setFurResourceinHold(int furResourceinHold) {
        MarketPlaceViewModel.furResourceinHold = furResourceinHold;
    }

    /**
     * Setter for inHoldMaterial
     * @param gameResourceinHold set material to this quantity
     */
    public static void setGameResourceinHold(int gameResourceinHold) {
        MarketPlaceViewModel.gameResourceinHold = gameResourceinHold;
    }

    /**
     * Setter for inHoldMaterial
     * @param machineResourceinHold set material to this quantity
     */
    public static void setMachineResourceinHold(int machineResourceinHold) {
        MarketPlaceViewModel.machineResourceinHold = machineResourceinHold;
    }

    /**
     * Setter for inHoldMaterial
     * @param medicineResourceinHold set material to this quantity
     */
    public static void setMedicineResourceinHold(int medicineResourceinHold) {
        MarketPlaceViewModel.medicineResourceinHold = medicineResourceinHold;
    }

    /**
     * Setter for inHoldMaterial
     * @param narcoticResourceinHold set material to this quantity
     */
    public static void setNarcoticResourceinHold(int narcoticResourceinHold) {
        MarketPlaceViewModel.narcoticResourceinHold = narcoticResourceinHold;
    }

    /**
     * Setter for inHoldMaterial
     * @param oreResourceinHold set material to this quantity
     */
    public static void setOreResourceinHold(int oreResourceinHold) {
        MarketPlaceViewModel.oreResourceinHold = oreResourceinHold;
    }

    /**
     * Setter for inHoldMaterial
     * @param robotResourceinHold set material to this quantity
     */
    public static void setRobotResourceinHold(int robotResourceinHold) {
        MarketPlaceViewModel.robotResourceinHold = robotResourceinHold;
    }

    /**
     * Setter for inHoldMaterial
     * @param remainingStorageCapacity set material to this quantity
     */
    public static void setRemainingStorageCapacity(int remainingStorageCapacity) {
        MarketPlaceViewModel.remainingStorageCapacity = remainingStorageCapacity;
    }

    /**
     * Setter for inHoldMaterial
     * @param waterResourceinHold set material to this quantity
     */
    public static void setWaterResourceinHold(int waterResourceinHold) {
        MarketPlaceViewModel.waterResourceinHold = waterResourceinHold;
    }
}
