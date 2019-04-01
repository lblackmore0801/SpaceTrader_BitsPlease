package com.example.spacetrader_bitsplease.entity;

public enum ShipType {
    GNAT("Gnat", 50, 30),
    FIREFLY("Firefly", 55, 40),
    MOSQUITO("Mosquito", 60, 50),
    BUMBLEBEE("Bumblebee", 65, 60),
    BEETLE("Beetle", 70, 70),
    HORNET("Hornet", 75, 80),
    GRASSHOPPER("Grasshopper", 80, 90),
    TERMITE("Termite", 85, 100),
    WASP("Wasp", 90, 110);

    private final String type;
    private int storageCapacity;
    private int fuelCapacity;

    ShipType(String ptype, int storageCapacity, int fuelCapacity) {
        this.type = ptype;
        this.storageCapacity = storageCapacity;
        this.fuelCapacity = fuelCapacity;
    }

    public String getType() {
        return type;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public int getFuelCapacity() { return  fuelCapacity; }

    public String toString() {
        return type;
    }
}

