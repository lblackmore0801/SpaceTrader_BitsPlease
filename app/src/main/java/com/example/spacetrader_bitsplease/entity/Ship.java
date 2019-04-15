package com.example.spacetrader_bitsplease.entity;

public class Ship {

    private ShipType type;
    private int fuelCapacity;

    /**
     * no params constructor for a Ship that assigns type, storage, and fuel
     */
    Ship() {
        type = ShipType.GNAT;
        //int storageCapacity = type.getStorageCapacity();
        fuelCapacity = type.getFuelCapacity();
    }

    /**
     * method that decreases fuel based on the distance traveled
     * @param distance how far the ship traveled which tells how much to decrement the fuel by
     */
    public void decrementFuel(double distance) {
        fuelCapacity -= distance;
    }

    /**
     * getter for the type of the ship
     * @return ShipType enum of the type
     */
    public ShipType getType() { return type; }

    /**
     * getter for the amount of fuel able to be held by a particular ship
     * @return int representation of the fuel capacity
     */
    public int getFuel() { return fuelCapacity; }

    /**
     * toString method for ships
     * @return String representation of the type of ship
     */
    public String toString() {
        return type.toString();
    }
}
