package com.example.spacetrader_bitsplease.entity;

public class Ship {
    ShipType type;

    public Ship() {
        type = ShipType.GNAT;
    }

    public String toString() {
        return type.toString();
    }
}
