package com.example.spacetrader_bitsplease.entity;

@SuppressWarnings("ALL")
public class Ship {

    private ShipType type;
    private int fuelCapacity;
    private int weaponDamage = 1;
    private int shipHealth;

    /**
     * no params constructor for a Ship that assigns type, storage, and fuel
     */
    public Ship() {
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
     * setter for the type of the ship
     * @param temptype ShipType enum of the type
     */
    public void setType(ShipType temptype) { type = temptype; }

    /**
     * getter for the amount of fuel able to be held by a particular ship
     * @return int representation of the fuel capacity
     */
    public int getFuel() { return fuelCapacity; }

    /**
     * setter for the amount of fuel able to be held by a particular ship
     * @param int representation of the fuel capacity
     */
    public void setFuel(int fuel) { fuelCapacity = fuel; }

    /**
     * setter for the amount of weapon damage
     * @param int representation of the weapon damage
     */
    public void setWeaponDamage(int weapon) { weaponDamage = weapon; }

    /**
     * getter for the amount of ship health
     * @param int representation of the ship health
     */
    public int getShipHealth() { return shipHealth; }

    /**
     * setter for the amount of ship health
     * @param int representation of the ship health
     */
    public void setShipHealth(int health) { shipHealth = health; }

    /**
     * getter for the amount of weapon damage
     * @param int representation of the weapon damage
     */
    public int getWeaponDamage() { return weaponDamage; }

    /**
     * toString method for ships
     * @return String representation of the type of ship
     */
    public String toString() {
        return type.toString();
    }
}
