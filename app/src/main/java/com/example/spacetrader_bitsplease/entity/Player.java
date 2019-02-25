package com.example.spacetrader_bitsplease.entity;

public class Player {
    private String username;
    private Difficulty difficulty;
    private int pilotSkill;
    private int engineerSkill;
    private int fighterSkill;
    private int traderSkill;
    private Ship ship;

    /**
     * Constructor required for making the new object
     *
     * @param name name of the student
     */
    public Player(String name) {
        this(name, Difficulty.EASY, 0,0,0,0, new Ship());
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
     */
    public Player(String name, Difficulty difficulty, int pilotSkill, int engineerSkill,
                  int fighterSkill, int traderSkill, Ship ship) {
        this.username = name;
        this.difficulty = difficulty;
        this.pilotSkill = pilotSkill;
        this.fighterSkill = fighterSkill;
        this.engineerSkill = engineerSkill;
        this.traderSkill = traderSkill;
        this.ship = ship;
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

    public String toString() {
        return String.format("Username: %s \nDifficulty: %s \nFighter Skill: %s \nPilot Skill: %s \nEngineering Skill: %s \nTrader Skill: %s \nShip: %s",
                                username, difficulty.toString(), fighterSkill, pilotSkill, engineerSkill, traderSkill, ship.toString());
    }
}
