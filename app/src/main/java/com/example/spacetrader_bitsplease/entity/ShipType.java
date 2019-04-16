package com.example.spacetrader_bitsplease.entity;

@SuppressWarnings("ALL")
public enum ShipType {
    GNAT("Gnat", 15, 30, 1000),
    FIREFLY("Firefly", 20, 40, 2000),
    MOSQUITO("Mosquito", 30, 50, 5000),
    BUMBLEBEE("Bumblebee", 65, 60, 10000),
    BEETLE("Beetle", 70, 70, 15000);
//    HORNET("Hornet", 75, 80),
//    GRASSHOPPER("Grasshopper", 80, 90),
//    TERMITE("Termite", 85, 100),
//    WASP("Wasp", 90, 110);

    private final String type;
    private final int fuelCapacity;
    private int storageCapacity;
    private int price;

    /**
     * constructor for the shipType enum
     * @param shipType type of ship
     * @param storageCapacity storage capacity of the ship type
     * @param fuelCapacity fuel capacity of the ship type
     */
    ShipType(String shipType, int storageCapacity, int fuelCapacity, int price) {
        this.type = shipType;
        this.storageCapacity = storageCapacity;
        this.fuelCapacity = fuelCapacity;
        this.price = price;
    }


    /**
     * getter for Fuel Capacity of the ship type
     * @return int value associated with the fuel capacity of the ship type
     */
    public int getFuelCapacity() { return  fuelCapacity; }

    /**
     * getter for Storage Capacity of the ship type
     * @return int value associated with the storage capacity of the ship type
     */
    public int getStorageCapacity() { return  storageCapacity; }

    /**
     * getter for price of the ship type
     * @return int value associated with the price of the ship type
     */
    public int getPrice() { return price; }

    /**
     * toString method to return a string representation of the ship type
     * @return String representation of the ship type
     */
    public String toString() {
        return type;
    }
}

