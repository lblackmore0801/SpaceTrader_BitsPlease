package com.example.spacetrader_bitsplease.entity;

import com.example.spacetrader_bitsplease.model.Repository;

public class Planet {
    int xcoordinate;
    int ycoordinate;
    Size size;
    PlanetName planetName;
    Condition condition;
    TechLevel techLevel;

    public Planet() {
        xcoordinate = 100;
        ycoordinate = 100;
        size = Size.MEDIUM;
        planetName = PlanetName.ANDEVIAN;
        condition = Condition.ARTISTIC;
        techLevel = TechLevel.AGRICULTURE;
    }
    public Planet(PlanetName name) {
        this.planetName = name;
        this.xcoordinate = Repository.xCoordinate(name);
        this.ycoordinate = Repository.yCoordinate(name);
        this.size = Repository.size(name);
        this.condition = Repository.condition(name);
        this.techLevel = Repository.techLevel(name);
    }

    public Planet(PlanetName name, int xCoordinate, int yCoordinate, Size size, Condition condition, TechLevel techLevel) {
        this.planetName = name;
        this.xcoordinate = xCoordinate;
        this.ycoordinate = yCoordinate;
        this.size = size;
        this.condition = condition;
        this.techLevel = techLevel;
    }

    public void setXcoordinate() { xcoordinate = this.xcoordinate; }
    public void setYcoordinate() { ycoordinate = this.ycoordinate; }
    public int getXcoordinate() { return xcoordinate; }
    public int getYcoordinate() { return ycoordinate; }
    public String getCoordinates() { return xcoordinate + ", " + ycoordinate; }

    public void setSize(Size size) { this.size = size; }
    public Size getSize() { return size; }

    public void setPlanetName(PlanetName planetName){ this.planetName = planetName; }
    public PlanetName getPlanetName() { return planetName; }

    public void setCondition(Condition condition) { this.condition = condition; }
    public Condition getCondition() { return condition; }

    public void setTechLevel(TechLevel techLevel) { this.techLevel = techLevel; }
    public TechLevel getTechLevel() { return techLevel; }


    public String toString() {
        return String.format("Coordinates: (%d,%d)\nPlanet: %s\n,Conditions: %s,Tech Level: %s",
                xcoordinate, ycoordinate, planetName.toString(), condition.toString(), techLevel.toString());
    }
}
