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

    /**
     * constructor for the Tech Level enum
     * @param techlevel String of techLevel
     */
    TechLevel(String techlevel) {
        this.techlevel = techlevel;
    }

    /**
     * toString method that return string representation of techLevel
     * @return String representation of techLevel
     */
    public String toString() {
        return techlevel;
    }
}
