package com.example.spacetrader_bitsplease.entity;

import com.example.spacetrader_bitsplease.model.Repository;

public class Planet {
    int xcoordinate;
    int ycoordinate;
    Size size;
    PlanetName planetName;
    Condition condition;
    TechLevel techLevel;

    int waterQuant;
    int furQuant;
    int foodQuant;
    int oreQuant;
    int gameQuant;
    int firearmQuant;
    int medicineQuant;
    int machineQuant;
    int narcoticQuant;
    int robotQuant;

    int waterPrice;
    int furPrice;
    int foodPrice;
    int orePrice;
    int gamePrice;
    int firearmPrice;
    int medicinePrice;
    int machinePrice;
    int narcoticPrice;
    int robotPrice;

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

    public void setWaterQuant(int water) { this.waterQuant = water; }
    public int getWaterQuant() { return waterQuant; }

    public void setFoodQuant(int food) { this.foodQuant = food; }
    public int getFoodQuant() { return foodQuant; }

    public void setFurQuant(int fur) { this.furQuant = fur; }
    public int getFurQuant() { return furQuant; }

    public void setOreQuant(int ore) { this.oreQuant = ore; }
    public int getOreQuant() { return oreQuant; }

    public void setGameQuant(int game) { this.gameQuant = game; }
    public int getGameQuant() { return gameQuant; }

    public void setFirearmQuant(int firearm) { this.firearmQuant = firearm; }
    public int getFirearmQuant() { return firearmQuant; }

    public void setMedicineQuant(int medicine) { this.medicineQuant = medicine; }
    public int getMedicineQuant() { return medicineQuant; }

    public void setMachineQuant(int machine) { this.machineQuant = machine; }
    public int getMachineQuant() { return machineQuant; }

    public void setNarcoticQuant(int narcotic) { this.narcoticQuant = narcotic; }
    public int getNarcoticQuant() { return narcoticQuant; }

    public void setRobotQuant(int robot) { this.robotQuant = robot; }
    public int getRobotQuant() { return robotQuant; }

    public String toString() {
        return String.format("Coordinates: (%d,%d)\nPlanet: %s\n,Conditions: %s,Tech Level: %s",
                xcoordinate, ycoordinate, planetName.toString(), condition.toString(), techLevel.toString());
    }
}
