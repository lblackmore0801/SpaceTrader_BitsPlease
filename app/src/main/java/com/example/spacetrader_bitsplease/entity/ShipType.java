package com.example.spacetrader_bitsplease.entity;

public enum ShipType {
    GNAT("Gnat"),
    FIREFLY("Firefly"),
    MOSQUITO("Mosquito"),
    BUMBLEBEE("Bumblebee"),
    BEETLE("Beetle"),
    HORNET("Hornet"),
    GRASSHOPPER("Grasshopper"),
    TERMITE("Termite"),
    WASP("Wasp");

    private final String type;

    ShipType(String ptype) {
        type = ptype;
    }

    public String toString() {
        return type;
    }
}

