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

    PlanetName(String planetname) {
        this.planetname = planetname;
    }

    public String toString() {
        return planetname;
    }
}
