package com.example.spacetrader_bitsplease.entity;

public class Player {
    private String username;
    private Difficulty difficulty;
    private int pilotSkill;
    private int engineerSkill;
    private int fighterSkill;
    private int traderSkill;
    private static Ship ship;
    private static int money;

    private int waterResourceinHold;
    private int furResourceinHold;
    private int foodResourceinHold;
    private int oreResourceinHold;
    private int gameResourceinHold;
    private int firearmsResourceinHold;
    private int medicineResourceinHold;
    private int narcoticResourceinHold;
    private int robotResourceinHold;



    /**
     * Constructor required for making the new object
     *
     * @param name name of the student
     */
    public Player(String name) {
        this(name, Difficulty.EASY, 0,0,0,0, new Ship(), 1000);
    }


    /**
     * Constructor required for making the new object
     *
     * @param name name of the student
     * @param difficulty Difficulty level
     * @param pilotSkill pilot skill level
     * @param fighterSkill fighter skill level
     * @param engineerSkill engineering skill level
     * @param traderSkill trader skill level
     * @param ship type of ship
     * @param money starting money
     */
    public Player(String name, Difficulty difficulty, int pilotSkill, int engineerSkill,
                  int fighterSkill, int traderSkill, Ship ship, int money) {
        this.username = name;
        this.difficulty = difficulty;
        this.pilotSkill = pilotSkill;
        this.fighterSkill = fighterSkill;
        this.engineerSkill = engineerSkill;
        this.traderSkill = traderSkill;
        this.ship = ship;
        this.money = money;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public String getUsername() {
        return username;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }
    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setPilotSkill(int pilotSkill) {
        this.pilotSkill = pilotSkill;
    }
    public int getPilotSkill() {
        return pilotSkill;
    }

    public int getEngineerSkill() {
        return engineerSkill;
    }
    public void setEngineerSkill(int engineerSkill) {
        this.engineerSkill = engineerSkill;
    }

    public void setTraderSkill(int traderSkill) {
        this.traderSkill = traderSkill;
    }
    public int getTraderSkill() {
        return traderSkill;
    }

    public void setFighterSkill(int fighterSkill) {
        this.fighterSkill = fighterSkill;
    }
    public int getFighterSkill() {
        return fighterSkill;
    }

    public static void setMoney(int newMoney) { money = newMoney; }
    public static int getMoney() { return money; }

    public void setShip(Ship ship) { this.ship = ship; }
    public static Ship getShip() { return ship; }

    public String toString() {
        return String.format("Username: %s \nDifficulty: %s \nFighter Skill: %s \nPilot Skill: %s \nEngineering Skill: %s \nTrader Skill: %s \nShip: %s \nMoney: %d",
                                username, difficulty.toString(), fighterSkill, pilotSkill, engineerSkill, traderSkill, ship.toString(), money);
    }


    public void setWaterinHold(int waterResourceinHold) { this.waterResourceinHold = waterResourceinHold; }
    public int getWaterinHold() { return waterResourceinHold; }

    public void setFoodinHold(int foodResourceinHold) { this.foodResourceinHold = foodResourceinHold; }
    public int setFoodinHold() { return foodResourceinHold; }

    public void setFurResourceinHold(int furResourceinHold) { this.furResourceinHold = furResourceinHold; }
    public int getFurResourceinHold() { return furResourceinHold; }

    public void setOreResourceinHold(int oreResourceinHold) { this.oreResourceinHold = oreResourceinHold; }
    public int getOreResourceinHold() { return oreResourceinHold; }

    public void setGameResourceinHold(int gameResourceinHold) { this.gameResourceinHold = gameResourceinHold; }
    public int getGameResourceinHold() { return gameResourceinHold; }

    public void setFirearmsResourceinHold(int firearmsResourceinHold) { this.firearmsResourceinHold = firearmsResourceinHold; }
    public int getFirearmsResourceinHold() { return firearmsResourceinHold; }

    public void setMedicineResourceinHold(int medicineResourceinHold) { this.medicineResourceinHold = medicineResourceinHold; }
    public int getMedicineResourceinHold() { return medicineResourceinHold; }

    public void setNarcoticResourceinHold(int narcoticResourceinHold) { this.narcoticResourceinHold = narcoticResourceinHold; }
    public int getNarcoticResourceinHold() { return narcoticResourceinHold; }

    public void setRobotResourceinHold(int robotResourceinHold) { this.robotResourceinHold = robotResourceinHold; }
    public int getRobotResourceinHold() { return robotResourceinHold; }
}
