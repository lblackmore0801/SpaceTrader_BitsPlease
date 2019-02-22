package com.example.spacetrader_bitsplease.entity;

public enum TechLevel {
    PREAGRICULTURE("Pre-Agriculture"),
    AGRICULTURE("Agriculture"),
    MEDIEVAL("Medieval"),
    RENAISSANCE("Renaissance"),
    EARLY("Early"),
    INDUSTRIAL("Industrial"),
    POSTINDUSTRIAL("Post-Industrial"),
    HITECH("Hi-Tech");

    private final String techlevel;

    TechLevel(String techlevel) {
        this.techlevel = techlevel;
    }

    public String toString() {
        return techlevel;
    }
}
