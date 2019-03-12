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

    int waterSell;
    int furSell;
    int foodSell;
    int oreSell;
    int gameSell;
    int firearmSell;
    int medicineSell;
    int machineSell;
    int narcoticSell;
    int robotSell;

    public Planet() {
        xcoordinate = 100;
        ycoordinate = 100;
        size = Size.MEDIUM;
        planetName = PlanetName.ANDEVIAN;
        condition = Condition.ARTISTIC;
        techLevel = TechLevel.AGRICULTURE;
    }
    public Planet(PlanetName name) {
        this(name, Repository.xCoordinate(name),Repository.yCoordinate(name),Repository.size(name),
                Repository.condition(name),Repository.techLevel(name));
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

    public void setWaterPrice(int water) { this.waterPrice = water; }
    public int getWaterPrice() { return waterPrice; }

    public void setFoodPrice(int food) { this.foodPrice = food; }
    public int getFoodPrice() { return foodPrice; }

    public void setFurPrice(int fur) { this.furPrice = fur; }
    public int getFurPrice() { return furPrice; }

    public void setOrePrice(int ore) { this.orePrice = ore; }
    public int getOrePrice() { return orePrice; }

    public void setGamePrice(int game) { this.gamePrice = game; }
    public int getGamePrice() { return gamePrice; }

    public void setFirearmPrice(int firearm) { this.firearmPrice = firearm; }
    public int getFirearmPrice() { return firearmPrice; }

    public void setMedicinePrice(int medicine) { this.medicinePrice = medicine; }
    public int getMedicinePrice() { return medicinePrice; }

    public void setMachinePrice(int machine) { this.machinePrice = machine; }
    public int getMachinePrice() { return machinePrice; }

    public void setNarcoticPrice(int narcotic) { this.narcoticPrice = narcotic; }
    public int getNarcoticPrice() { return narcoticPrice; }

    public void setRobotPrice(int robot) { this.robotPrice = robot; }
    public int getRobotPrice() { return robotPrice; }

    public void setWaterSell(int water) { this.waterSell = water; }
    public int getWaterSell() { return waterSell; }

    public void setFoodSell(int food) { this.foodSell = food; }
    public int getFoodSell() { return foodSell; }

    public void setFurSell(int fur) { this.furSell = fur; }
    public int getFurSell() { return furSell; }

    public void setOreSell(int ore) { this.oreSell = ore; }
    public int getOreSell() { return oreSell; }

    public void setGameSell(int game) { this.gameSell = game; }
    public int getGameSell() { return gameSell; }

    public void setFirearmSell(int firearm) { this.firearmSell = firearm; }
    public int getFirearmSell() { return firearmSell; }

    public void setMedicineSell(int medicine) { this.medicineSell = medicine; }
    public int getMedicineSell() { return medicineSell; }

    public void setMachineSell(int machine) { this.machineSell = machine; }
    public int getMachineSell() { return machineSell; }

    public void setNarcoticSell(int narcotic) { this.narcoticSell = narcotic; }
    public int getNarcoticSell() { return narcoticSell; }

    public void setRobotSell(int robot) { this.robotSell = robot; }
    public int getRobotSell() { return robotSell; }

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
