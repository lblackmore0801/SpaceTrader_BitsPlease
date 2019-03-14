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

    public void sellResource(TradeGoods good, int price, int quantity) {
        if (((price * quantity) <= money) && (quantity <= remainingStorageCapacity)) {
            remainingStorageCapacity -= quantity;
            money += price * quantity;
        }
    }
}
