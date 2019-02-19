package com.example.spacetrader_bitsplease.entity;

public enum ShipType {
    GNAT("Gnat");

    private final String type;

    ShipType(String ptype) {
        type = ptype;
    }

    public String toString() {
        return type;
    }
}

