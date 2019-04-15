package com.example.spacetrader_bitsplease.entity;

public enum PlanetName {
    ANDEVIAN("Andevian"),
    CASTOR("Castor"),
    ESMEE("Esmee"),
    FERRIS("Ferris"),
    HELENA("Helena"),
    MYRTHE("Myrthe"),
    OTHELLO("Othello"),
    RHYMUS("Rhymus"),
    SOL("Sol"),
    ZUUL("Zuul");

    private final String planetname;

    /**
     * single parameter constructor for the name of a planet
     * @param planetname String representation of a the planet name
     */
    PlanetName(String planetname) {
        this.planetname = planetname;
    }

    /**
     * toString method for the planet name
     * @return String representation of the planet name
     */
    public String toString() {
        return planetname;
    }
}
