package com.example.spacetrader_bitsplease.entity;

public class Planet {
    int xcoordinate;
    int ycoordinate;
    int waterResource;
    int furResource;
    int foodResource;
    int oreResource;
    int gameResource;
    int firearmResource;
    int medicineResource;
    int machineResource;
    int narcoticResource;
    int robotResource;
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
        waterResource = 0;
        furResource = 0;
        foodResource = 0;
        oreResource = 0;
        gameResource = 0;
        firearmResource = 0;
        medicineResource = 0;
        machineResource = 0;
        narcoticResource = 0;
        robotResource = 0;
    }
    public Planet(PlanetName name) {
        this.planetName = name;
        this.xcoordinate = Game.xCoordinate(name);
        this.ycoordinate = Game.yCoordinate(name);
        this.size = Game.size(name);
        this.condition = Game.resource(name);
        this.techLevel = Game.techLevel(name);
        waterResource = 0;
        furResource = 0;
        foodResource = 0;
        oreResource = 0;
        gameResource = 0;
        firearmResource = 0;
        medicineResource = 0;
        machineResource = 0;
        narcoticResource = 0;
        robotResource = 0;
    }

    public Planet(PlanetName name, int xcoordinate, int ycoordinate, Size size, Condition condition, TechLevel techLevel) {
        this.planetName = name;
        this.xcoordinate = xcoordinate;
        this.ycoordinate = ycoordinate;
        this.size = size;
        this.condition = condition;
        this.techLevel = techLevel;
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

    public void setResource() { condition = this.condition; }
    public Condition getCondition() { return condition; }

    public void setTechLevel() { techLevel = this.techLevel; }
    public TechLevel getTechLevel() { return techLevel; }

    public void setWaterResource(int water) { waterResource = water; }
    public int getWaterResource() { return waterResource; }

    public void setFurResource(int fur) { furResource = fur; }
    public int getFurResource() { return furResource; }

    public void setFoodResource(int food) { foodResource = food; }
    public int getFoodResource() { return foodResource; }

    public void setOreResource(int ore) { oreResource = ore; }
    public int getOreResource() { return oreResource; }

    public void setGameResource(int game) { gameResource = game; }
    public int getGameResource() { return gameResource; }

    public void setFirearmResource(int firearm) { firearmResource = firearm; }
    public int getFirearmResource() { return firearmResource; }

    public void setMedicineResource(int medicine) { medicineResource = medicine; }
    public int getMedicineResource() { return medicineResource; }

    public void setMachineResource(int machine) { machineResource = machine; }
    public int getMachineResource() { return machineResource; }

    public void setNarcoticResource(int narcotic) { narcoticResource = narcotic; }
    public int getNarcoticResource() { return narcoticResource; }

    public void setRobotResource(int robot) { robotResource = robot; }
    public int getRobotResource() { return robotResource; }

    public String toString() {
        return String.format("Coordinates: (%d,%d)\nPlanet: %s\n,Resources: %s,Tech Level: %s",
                xcoordinate, ycoordinate, planetName.toString(), condition.toString(), techLevel.toString());
    }
}
