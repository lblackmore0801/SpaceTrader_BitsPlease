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

    /**
     * Constructor for UniverseViewModel
     * @param  currentPlanet the current planet the player is on
     * @param  targetPlanet the planet the player wishes to travel to
     */
    public static double distance(Planet currentPlanet, Planet targetPlanet) {
        currentX = currentPlanet.getXcoordinate();
        currentY = currentPlanet.getYcoordinate();
        targetX = targetPlanet.getXcoordinate();
        targetY = targetPlanet.getYcoordinate();
        distance = Math.sqrt(Math.pow(targetX - currentX, 2) + Math.pow(targetY - currentY, 2));
        distance = Math.round(distance * 100.00) / 100.00;
        return distance;
    }

    /**
     * Method for getting the current fuel range of the ship.
     * @param  ship  the player's ship
     * @return an int denoting fuel value
     */
    public static int fuelRange(Ship ship) {
        return ship.getFuel();
    }

    /**
     * Method to check if the target planet is in travelling range.
     * @param  ship  the player's ship
     * @return boolean can travel or not
     */
    public static boolean inRange(Planet currentPlanet, Planet targetPlanet, Ship ship) {
        if (fuelRange(ship) >= distance(currentPlanet, targetPlanet)) {
            ship.decrementFuel(distance);
            return true;
        }
        return false;
    }

    /**
     * Method to check if the player encounters a cop.
     * @return boolean run into cop or not
     */
    public static boolean copEncounter() {
        int random = (int) (Math.random() * 100 + 1);
        if (random > 10) {
            return true;
        }
        return false;
    }
    /**
     * Method to check if the player has illegal items in their hold.
     * @return boolean if the player has illegal items or not
     */
    public static boolean checkForIllegals() {
        if (MarketPlaceViewModel.getNarcoticResourceinHold() > 0 ||
            MarketPlaceViewModel.getFirearmsResourceinHold() > 0) {
            return true;
        }
        return false;
    }
}
