package com.example.spacetrader_bitsplease.entity;

import com.example.spacetrader_bitsplease.model.Repository;

public class Planet {
    int xcoordinate;
    int ycoordinate;
    int waterCondition;
    int furCondition;
    int foodCondition;
    int oreCondition;
    int gameCondition;
    int firearmCondition;
    int medicineCondition;
    int machineCondition;
    int narcoticCondition;
    int robotCondition;
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
        waterCondition = 0;
        furCondition = 0;
        foodCondition = 0;
        oreCondition = 0;
        gameCondition = 0;
        firearmCondition = 0;
        medicineCondition = 0;
        machineCondition = 0;
        narcoticCondition = 0;
        robotCondition = 0;
    }
    public Planet(PlanetName name) {
        this.planetName = name;
        this.xcoordinate = Repository.xCoordinate(name);
        this.ycoordinate = Repository.yCoordinate(name);
        this.size = Repository.size(name);
        this.condition = Repository.condition(name);
        this.techLevel = Repository.techLevel(name);
        waterCondition = 0;
        furCondition = 0;
        foodCondition = 0;
        oreCondition = 0;
        gameCondition = 0;
        firearmCondition = 0;
        medicineCondition = 0;
        machineCondition = 0;
        narcoticCondition = 0;
        robotCondition = 0;
    }
    public Planet(PlanetName name, int xCoordinate, int yCoordinate, Size size, Condition condition, TechLevel techLevel) {
        this.planetName = name;
        this.xcoordinate = xCoordinate;
        this.ycoordinate = yCoordinate;
        this.size = size;
        this.condition = condition;
        this.techLevel = techLevel;
        waterCondition = 0;
        furCondition = 0;
        foodCondition = 0;
        oreCondition = 0;
        gameCondition = 0;
        firearmCondition = 0;
        medicineCondition = 0;
        machineCondition = 0;
        narcoticCondition = 0;
        robotCondition = 0;
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

    public void setCondition() { condition = this.condition; }
    public Condition getCondition() { return condition; }

    public void setTechLevel() { techLevel = this.techLevel; }
    public TechLevel getTechLevel() { return techLevel; }

    public void setWaterCondition(int water) { waterCondition = water; }
    public int getWaterCondition() { return waterCondition; }

    public void setFurCondition(int fur) { furCondition = fur; }
    public int getFurCondition() { return furCondition; }

    public void setFoodCondition(int food) { foodCondition = food; }
    public int getFoodCondition() { return foodCondition; }

    public void setOreCondition(int ore) { oreCondition = ore; }
    public int getOreCondition() { return oreCondition; }

    public void setGameCondition(int game) { gameCondition = game; }
    public int getGameCondition() { return gameCondition; }

    public void setFirearmCondition(int firearm) { firearmCondition = firearm; }
    public int getFirearmCondition() { return firearmCondition; }

    public void setMedicineCondition(int medicine) { medicineCondition = medicine; }
    public int getMedicineCondition() { return medicineCondition; }

    public void setMachineCondition(int machine) { machineCondition = machine; }
    public int getMachineCondition() { return machineCondition; }

    public void setNarcoticCondition(int narcotic) { narcoticCondition = narcotic; }
    public int getNarcoticCondition() { return narcoticCondition; }

    public void setRobotCondition(int robot) { robotCondition = robot; }
    public int getRobotCondition() { return robotCondition; }

    public String toString() {
        return String.format("Coordinates: (%d,%d)\nPlanet: %s\n,Conditions: %s,Tech Level: %s",
                xcoordinate, ycoordinate, planetName.toString(), condition.toString(), techLevel.toString());
    }
}
