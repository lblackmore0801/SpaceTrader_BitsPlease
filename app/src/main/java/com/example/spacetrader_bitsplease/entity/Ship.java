package com.example.spacetrader_bitsplease.entity;

public class Ship {
    ShipType type;

    Ship() {
        type = ShipType.GNAT;
    }

    public String toString() {
        return type.toString();
    }
}
