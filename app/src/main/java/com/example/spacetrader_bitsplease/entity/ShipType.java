package com.example.spacetrader_bitsplease.entity;

@SuppressWarnings("SameParameterValue")
public enum ShipType {
    GNAT("Gnat", 50, 30);
//    FIREFLY("Firefly", 55, 40),
//    MOSQUITO("Mosquito", 60, 50),
//    BUMBLEBEE("Bumblebee", 65, 60),
//    BEETLE("Beetle", 70, 70),
//    HORNET("Hornet", 75, 80),
//    GRASSHOPPER("Grasshopper", 80, 90),
//    TERMITE("Termite", 85, 100),
//    WASP("Wasp", 90, 110);

    private final String type;
    private final int fuelCapacity;

    /**
     * constructor for the shipType enum
     * @param shipType type of ship
     * @param storageCapacity storage capacity of the ship type
     * @param fuelCapacity fuel capacity of the ship type
     */
    ShipType(String shipType, int storageCapacity, int fuelCapacity) {
        this.type = shipType;
        int storageCapacity1 = storageCapacity;
        this.fuelCapacity = fuelCapacity;
    }


    /**
     * getter for Fuel Capacity of the ship type
     * @return int value associated with the fuel capacity of the ship type
     */
    public int getFuelCapacity() { return  fuelCapacity; }

    /**
     * toString method to return a string representation of the ship type
     * @return String representation of the ship type
     */
    public String toString() {
        return type;
    }
}

