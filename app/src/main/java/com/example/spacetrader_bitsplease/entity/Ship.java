package com.example.spacetrader_bitsplease.entity;

public class Ship {

    ShipType type;
    int storageCapacity;
    int fuelCapacity;

    Ship() {
        type = ShipType.GNAT;
        storageCapacity = type.getStorageCapacity();
        fuelCapacity = type.getFuelCapacity();
    }

    public void decrementFuel(double distance) {
        fuelCapacity -= distance;
    }

    public ShipType getType() { return type; }

    public int getFuel() { return fuelCapacity; }

    public String toString() {
        return type.toString();
    }
}
