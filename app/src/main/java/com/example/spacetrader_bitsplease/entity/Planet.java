package com.example.spacetrader_bitsplease.entity;

import com.example.spacetrader_bitsplease.model.Repository;

public class Planet {
    private int xcoordinate;
    private int ycoordinate;
    private Size size;
    private PlanetName planetName;
    private Condition condition;
    private TechLevel techLevel;

    private int waterQuant;
    private int furQuant;
    private int foodQuant;
    private int oreQuant;
    private int gameQuant;
    private int firearmQuant;
    private int medicineQuant;
    private int machineQuant;
    private int narcoticQuant;
    private int robotQuant;

    private int waterQuantSell;
    private int furQuantSell;
    private int foodQuantSell;
    private int oreQuantSell;
    private int gameQuantSell;
    private int firearmQuantSell;
    private int medicineQuantSell;
    private int machineQuantSell;
    private int narcoticQuantSell;
    private int robotQuantSell;

    private int waterPrice;
    private int furPrice;
    private int foodPrice;
    private int orePrice;
    private int gamePrice;
    private int firearmPrice;
    private int medicinePrice;
    private int machinePrice;
    private int narcoticPrice;
    private int robotPrice;

    private int waterSell;
    private int furSell;
    private int foodSell;
    private int oreSell;
    private int gameSell;
    private int firearmSell;
    private int medicineSell;
    private int machineSell;
    private int narcoticSell;
    private int robotSell;

    /**
     * no params constructor method for a Planet object
     */
    public Planet() {
        xcoordinate = 100;
        ycoordinate = 100;
        size = Size.MEDIUM;
        planetName = PlanetName.ANDEVIAN;
        condition = Condition.ARTISTIC;
        techLevel = TechLevel.AGRICULTURE;
    }

    /**
     * constructor method for a Planet object that takes in a PlanetName enum as a param
     * @param name PlanetName which will provide information about the planet
     */
    public Planet(PlanetName name) {
        this(name, Repository.xCoordinate(name),Repository.yCoordinate(name),Repository.size(name),
                Repository.condition(name),Repository.techLevel(name));
    }

    /**
     * constructor for a Planet object with multiple params
     * @param name PlanetName which will provide information about the planet
     * @param xCoordinate the x coordinate of the planet
     * @param yCoordinate the y coordinate of the planet
     * @param size the size of the planet
     * @param condition the condition criteria of the planet
     * @param techLevel the tech level of the planet
     */
    private Planet(PlanetName name, int xCoordinate, int yCoordinate, Size size, Condition condition, TechLevel techLevel) {
        this.planetName = name;
        this.xcoordinate = xCoordinate;
        this.ycoordinate = yCoordinate;
        this.size = size;
        this.condition = condition;
        this.techLevel = techLevel;
    }

    /**
     * getter for x coordinate of a planet
     * @return int representation of the x coordinate of a planet
     */
    public int getXcoordinate() { return xcoordinate; }

    /**
     * getter for y coordinate of a planet
     * @return int representation of the y coordinate of a planet
     */
    public int getYcoordinate() { return ycoordinate; }

    /**
     * getter for the set of coordinates of a planet
     * @return String representation of the coordinates of a planet
     */
    public String getCoordinates() { return xcoordinate + ", " + ycoordinate; }

    /**
     * getter for the size of a planet
     * @return Size enum representation of a planet
     */
    public Size getSize() { return size; }

    /**
     * getter for the PlanetName of a planet
     * @return PlanetName enum representation of a planet
     */
    public PlanetName getPlanetName() { return planetName; }

    /**
     * getter for the condition of a planet
     * @return Condition enum representation of a planet
     */
    public Condition getCondition() { return condition; }

    /**
     * getter for the tech level of a planet
     * @return TechLevel enum representation of a planet
     */
    public TechLevel getTechLevel() { return techLevel; }

    /**
     * setter for the price of water on a planet
     * @param water int for the price of water
     */
    public void setWaterPrice(int water) { this.waterPrice = water; }

    /**
     * getter for the price of water on a planet
     * @return int representation of the price of water
     */
    public int getWaterPrice() { return waterPrice; }

    /**
     * setter for the price of food on a planet
     * @param food int representation of the price of food
     */
    public void setFoodPrice(int food) { this.foodPrice = food; }

    /**
     * getter for the price of food on planet
     * @return int representation of the price of food
     */
    public int getFoodPrice() { return foodPrice; }

    /**
     * setter for the price of fur on a planet
     * @param fur int representation of the price of fur
     */
    public void setFurPrice(int fur) { this.furPrice = fur; }

    /**
     * getter for the price of fur on planet
     * @return int representation of the price of fur
     */
    public int getFurPrice() { return furPrice; }

    /**
     * setter for the price of ore on a planet
     * @param ore int representation of the price of ore
     */
    public void setOrePrice(int ore) { this.orePrice = ore; }

    /**
     * getter for the price of ore on a planet
     * @return int represetation of the price of ore
     */
    public int getOrePrice() { return orePrice; }

    /**
     * setter for the price of a game on a planet
     * @param game int representation of the price of a game
     */
    public void setGamePrice(int game) { this.gamePrice = game; }

    /**
     * getter for the price of a game on a planet
     * @return int representation of the price of a game
     */
    public int getGamePrice() { return gamePrice; }

    /**
     * setter for the price of a firearm on a planet
     * @param firearm int representation of the price of a firearm
     */
    public void setFirearmPrice(int firearm) { this.firearmPrice = firearm; }

    /**
     * getter for the price of a firearm on a planet
     * @return int representation of the price of a firearm
     */
    public int getFirearmPrice() { return firearmPrice; }

    /**
     * setter for the price of medicine on a planet
     * @param medicine int representation of the price of medicine
     */
    public void setMedicinePrice(int medicine) { this.medicinePrice = medicine; }

    /**
     * getter for the price of medicine on a planet
     * @return int representation of the price of medicine
     */
    public int getMedicinePrice() { return medicinePrice; }

    /**
     * setter for the price of a machine on a planet
     * @param machine int representation of the price of a machine
     */
    public void setMachinePrice(int machine) { this.machinePrice = machine; }

    /**
     * getter for the price of a machine on a planet
     * @return int representation of the price of a machine on a planet
     */
    public int getMachinePrice() { return machinePrice; }

    /**
     * setter for the price of a narcotic on a planet
     * @param narcotic int representation of the price of a narcotic
     */
    public void setNarcoticPrice(int narcotic) { this.narcoticPrice = narcotic; }

    /**
     * getter for the price of a narcotic on a planet
     * @return int representation of the price of a narcotic
     */
    public int getNarcoticPrice() { return narcoticPrice; }

    /**
     * setter for the price of a robot on a planet
     * @param robot int representation of a the price of a robot
     */
    public void setRobotPrice(int robot) { this.robotPrice = robot; }

    /**
     * getter for the price of a robot on a planet
     * @return int representation of the price of a robot
     */
    public int getRobotPrice() { return robotPrice; }

    /**
     * setter for the price of water on a planet (to sell)
     * @param water int representation of the price of water
     */
    public void setWaterSell(int water) { this.waterSell = water; }

    /**
     * getter for the price of water on a planet (to sell)
     * @return int representation of the price of water
     */
    public int getWaterSell() { return waterSell; }

    /**
     * setter for the price of food on a planet (to sell)
     * @param food int representation of the price of food
     */
    public void setFoodSell(int food) { this.foodSell = food; }

    /**
     * getter for the price of food (to sell)
     * @return int representation of the price of food
     */
    public int getFoodSell() { return foodSell; }

    /**
     * setter for the price of fur (to sell)
     * @param fur int representation of the price of fur
     */
    public void setFurSell(int fur) { this.furSell = fur; }

    /**
     * getter for the price of fur (to sell)
     * @return int representation of the price of fur
     */
    public int getFurSell() { return furSell; }

    /**
     * setter for the price of ore (to sell)
     * @param ore int representation of the price of ore
     */
    public void setOreSell(int ore) { this.oreSell = ore; }

    /**
     * getter for the price of ore (to sell)
     * @return int representation of the price of ore
     */
    public int getOreSell() { return oreSell; }

    /**
     * setter for the price of a game (to sell)
     * @param game int representation of the price of a game
     */
    public void setGameSell(int game) { this.gameSell = game; }

    /**
     * getter for the price of a game (to sell)
     * @return int representation of the price of a game
     */
    public int getGameSell() { return gameSell; }

    /**
     * setter for the price of a firearm (to sell)
     * @param firearm int representation of the price of a firearm
     */
    public void setFirearmSell(int firearm) { this.firearmSell = firearm; }

    /**
     * getter for the price of a firearm (to sell)
     * @return int representation of the price of a firearm
     */
    public int getFirearmSell() { return firearmSell; }

    /**
     * setter for the price of medicine (to sell)
     * @param medicine int representation of the price of medicine
     */
    public void setMedicineSell(int medicine) { this.medicineSell = medicine; }

    /**
     * getter for the price of medicine (to sell)
     * @return int representation of the price of medicine
     */
    public int getMedicineSell() { return medicineSell; }

    /**
     * setter for the price of machine (to sell)
     * @param machine int representation of the price of a machine
     */
    public void setMachineSell(int machine) { this.machineSell = machine; }

    /**
     * getter for the price of a machine (to sell)
     * @return int representation of the price of a machine
     */
    public int getMachineSell() { return machineSell; }

    /**
     * setter for the price of a narcotic (to sell)
     * @param narcotic int representation of the price of a narcotic
     */
    public void setNarcoticSell(int narcotic) { this.narcoticSell = narcotic; }

    /**
     * getter for the price of a narcotic (to sell)
     * @return int representation of the price of a narcotic
     */
    public int getNarcoticSell() { return narcoticSell; }

    /**
     * setter for the price of a robot (to sell)
     * @param robot int representation of the price of a robot
     */
    public void setRobotSell(int robot) { this.robotSell = robot; }

    /**
     * getter for the price of a robot (to sell)
     * @return int representation of the price of a robot
     */
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

    public void setWaterQuantSell(int water) { this.waterQuantSell = water; }
    public int getWaterQuantSell() { return waterQuantSell; }

    public void setFoodQuantSell(int food) { this.foodQuantSell = food; }
    public int getFoodQuantSell() { return foodQuantSell; }

    public void setFurQuantSell(int fur) { this.furQuantSell = fur; }
    public int getFurQuantSell() { return furQuantSell; }

    public void setOreQuantSell(int ore) { this.oreQuantSell = ore; }
    public int getOreQuantSell() { return oreQuantSell; }

    public void setGameQuantSell(int game) { this.gameQuantSell = game; }
    public int getGameQuantSell() { return gameQuantSell; }

    public void setFirearmQuantSell(int firearm) { this.firearmQuantSell = firearm; }
    public int getFirearmQuantSell() { return firearmQuantSell; }

    public void setMedicineQuantSell(int medicine) { this.medicineQuantSell = medicine; }
    public int getMedicineQuantSell() { return medicineQuantSell; }

    public void setMachineQuantSell(int machine) { this.machineQuantSell = machine; }
    public int getMachineQuantSell() { return machineQuantSell; }

    public void setNarcoticQuantSell(int narcotic) { this.narcoticQuantSell = narcotic; }
    public int getNarcoticQuantSell() { return narcoticQuantSell; }

    public void setRobotQuantSell(int robot) { this.robotQuantSell = robot; }
    public int getRobotQuantSell() { return robotQuantSell; }

    public String toString() {
        return String.format("Coordinates: (%d,%d)\nPlanet: %s\n,Conditions: %s,Tech Level: %s",
                xcoordinate, ycoordinate, planetName.toString(), condition.toString(), techLevel.toString());
    }
}
