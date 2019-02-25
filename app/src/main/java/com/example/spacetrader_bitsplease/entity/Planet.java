package com.example.spacetrader_bitsplease.entity;

public class Planet {
    int xcoordinate;
    int ycoordinate;
    Size size;
    PlanetName planetName;
    Resource resource;
    TechLevel techLevel;

    public Planet() {
        xcoordinate = 100;
        ycoordinate = 100;
        size = Size.MEDIUM;
        planetName = PlanetName.ANDEVIAN;
        resource = Resource.ARTISTIC;
        techLevel = TechLevel.AGRICULTURE;
    }
    public Planet(String name) {
        xcoordinate = 100;
        ycoordinate = 100;
        size = Size.MEDIUM;
        planetName = PlanetName.ANDEVIAN;
        resource = Resource.ARTISTIC;
        techLevel = TechLevel.AGRICULTURE;
    }



        public void setXcoordinate() { xcoordinate = this.xcoordinate; }
    public void setYcoordinate() { ycoordinate = this.ycoordinate; }
    public int getXcoordinate() { return xcoordinate; }
    public int getYcoordinate() { return ycoordinate; }
    public String getCoordinates() { return xcoordinate + ", " + ycoordinate; }

    public void setSize() { this.size = size; }
    public Size getSize() { return size; }

    public void setPlanetName(){ planetName = this.planetName; }
    public PlanetName getPlanetName() { return planetName; }

    public void setResource() { resource = this.resource; }
    public Resource getResource() { return resource; }

    public void setTechLevel() { techLevel = this.techLevel; }
    public TechLevel getTechLevel() { return techLevel; }


    public String toString() {
        return String.format("Coordinates: (%d,%d)\nPlanet: %s\n,Resources: %s,Tech Level: %s",
                xcoordinate, ycoordinate, planetName.toString(), resource.toString(), techLevel.toString());
    }
}
