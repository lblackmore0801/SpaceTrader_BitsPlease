package com.example.spacetrader_bitsplease.entity;

public class Planet {
    int xcoordinate;
    int ycoordinate;
    PlanetName planetName;
    Resource resource;
    TechLevel techLevel;

    Planet() {
        xcoordinate = 100;
        ycoordinate = 100;
        planetName = PlanetName.ANDEVIAN;
        resource = Resource.ARTISTIC;
        techLevel = TechLevel.AGRICULTURE;
    }

    public String toString() {
        return String.format("Coordinates: (%d,%d)\nPlanet: %s\n,Resources: %s,Tech Level: %s",
                xcoordinate, ycoordinate, planetName.toString(), resource.toString(), techLevel.toString());
    }
}
