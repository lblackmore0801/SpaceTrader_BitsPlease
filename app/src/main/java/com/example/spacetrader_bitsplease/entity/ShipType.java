package com.example.spacetrader_bitsplease.entity;

public enum ShipType {
    GNAT("Gnat", 50),
    FIREFLY("Firefly", 55),
    MOSQUITO("Mosquito", 60),
    BUMBLEBEE("Bumblebee", 65),
    BEETLE("Beetle", 70),
    HORNET("Hornet", 75),
    GRASSHOPPER("Grasshopper", 80),
    TERMITE("Termite", 85),
    WASP("Wasp", 90);

    private final String type;
    private int storageCapacity;

    ShipType(String ptype, int storageCapacity) {
        this.type = ptype;
        this.storageCapacity = storageCapacity;
    }

    public String getType() {
        return type;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }


    public String toString() {
        return type;
    }
}

