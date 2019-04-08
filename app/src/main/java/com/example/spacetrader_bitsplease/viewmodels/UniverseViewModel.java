package com.example.spacetrader_bitsplease.viewmodels;

import com.example.spacetrader_bitsplease.entity.Ship;
import com.example.spacetrader_bitsplease.entity.ShipType;
import com.example.spacetrader_bitsplease.entity.Planet;
import java.lang.Math;


public class UniverseViewModel {
    private static double currentX;
    private static double currentY;
    private static double targetX;
    private static double targetY;
    private static double distance;

    public static double distance(Planet currentPlanet, Planet targetPlanet) {
        currentX = currentPlanet.getXcoordinate();
        currentY = currentPlanet.getYcoordinate();
        targetX = targetPlanet.getXcoordinate();
        targetY = targetPlanet.getYcoordinate();
        distance = Math.sqrt(Math.pow(targetX - currentX, 2) + Math.pow(targetY - currentY, 2));
        distance = Math.round(distance * 100.00) / 100.00;
        return distance;
    }

    public static int fuelRange(Ship ship) {
        return ship.getFuel();
    }

    public static boolean inRange(Planet currentPlanet, Planet targetPlanet, Ship ship) {
        if (fuelRange(ship) >= distance(currentPlanet, targetPlanet)) {
            ship.decrementFuel(distance);
            return true;
        }
        return false;
    }

    public static boolean copEncounter() {
        int random = (int) (Math.random() * 100 + 1);
        if (random > 10) {
            return true;
        }
        return false;
    }

    public static boolean checkForIllegals() {
        if (MarketPlaceViewModel.getNarcoticResourceinHold() > 0 ||
            MarketPlaceViewModel.getFirearmsResourceinHold() > 0) {
            return true;
        }
        return false;
    }
}
