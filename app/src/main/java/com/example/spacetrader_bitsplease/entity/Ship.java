package com.example.spacetrader_bitsplease.entity;

public class Ship {

    ShipType type;
    int storageCapacity;

    Ship() {
        type = ShipType.GNAT;
        storageCapacity = type.getStorageCapacity();
    }

    public String toString() {
        return type.toString();
    }
}
