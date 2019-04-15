package com.example.spacetrader_bitsplease.entity;

import android.annotation.SuppressLint;

public class Player {
    private String username;
    private static Difficulty difficulty;
    private static int pilotSkill;
    private static int engineerSkill;
    private static int fighterSkill;
    private static int traderSkill;
    private static Ship ship;
    private static int money;

    /**
     * Constructor required for making the new object
     *
     * @param name name of the student
     */
    public Player(String name) {
        this(name, Difficulty.EASY, 0, 0, 0, 0, new Ship(), 1000);
    }


    /**
     * Constructor required for making the new object
     *
     * @param name          name of the student
     * @param tempDifficulty    Difficulty level
     * @param tempPilotSkill    pilot skill level
     * @param tempFighterSkill  fighter skill level
     * @param tempEngineerSkill engineering skill level
     * @param tempTraderSkill   trader skill level
     * @param tempShip          type of ship
     * @param tempMoney         starting money
     */
    public Player(String name, Difficulty tempDifficulty, int tempPilotSkill, int tempEngineerSkill,
                  int tempFighterSkill, int tempTraderSkill, Ship tempShip, int tempMoney) {
        this.username = name;
        difficulty = tempDifficulty;
        pilotSkill = tempPilotSkill;
        fighterSkill = tempFighterSkill;
        engineerSkill = tempEngineerSkill;
        traderSkill = tempTraderSkill;
        ship = tempShip;
        money = tempMoney;
    }

    /**
     * setter of the username of a player
     * @param name String representation of the username
     */
    public void setUsername(String name) {
        this.username = name;
    }

    /**
     * getter for the username
     * @return String representation of the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * getter for the game difficulty
     * @return difficulty Difficulty enum for the game difficulty
     */
    public Difficulty getDifficulty() {
        return difficulty;
    }

    /**
     * setter for the game difficulty
     * @param difficulty Difficulty enum for the game difficulty
     */
    public void setDifficulty(Difficulty difficulty) {
        Player.difficulty = difficulty;
    }

    /**
     * setter for the pilot skill
     * @param pilotSkill int representation of the pilot skill level
     */
    public void setPilotSkill(int pilotSkill) {
        Player.pilotSkill = pilotSkill;
    }

    /**
     * getter for the pilot skill
     * @return int representation of the pilot skill
     */
    public static int getPilotSkill() {
        return pilotSkill;
    }

    /**
     * getter for the engineering skill
     * @return int representation of the engineering skill
     */
    public static int getEngineerSkill() {
        return engineerSkill;
    }

    /**
     * setter for the engineering skill
     * @param engineerSkill int representation of the engineering skill
     */
    public void setEngineerSkill(int engineerSkill) {
        Player.engineerSkill = engineerSkill;
    }

    /**
     * setter for the trader skill
     * @param traderSkill int representation of the trader skill
     */
    public void setTraderSkill(int traderSkill) {
        Player.traderSkill = traderSkill;
    }

    /**
     * getter for the trader skill
     * @return int representation of the trader skill
     */
    public static int getTraderSkill() {
        return traderSkill;
    }

    /**
     * setter for the fighter skill
     * @param fighterSkill int representation of the trader skill
     */
    public void setFighterSkill(int fighterSkill) {
        Player.fighterSkill = fighterSkill;
    }

    /**
     * getter for the fighter skill
     * @return int representation of the fighter skill
     */
    public static int getFighterSkill() {
        return fighterSkill;
    }

    /**
     * setter for money
     * @param newMoney int representation of money
     */
    public static void setMoney(int newMoney) {
        money = newMoney;
    }

    /**
     * getter for the money
     * @return int representation of money
     */
    public static int getMoney() {
        return money;
    }

    /**
     * getter for the ship
     * @return Ship enum representation of the ship
     */
    public static Ship getShip() {
        return ship;
    }

    /**
     * toString method to display player info in string format
     * @return String representation of the player
     */

    @SuppressLint("DefaultLocale")
    public String toString() {
        return String.format("Username: %s \nDifficulty: %s \nFighter Skill: %s \nPilot Skill: %s \nEngineering Skill: %s \nTrader Skill: %s \nShip: %s \nMoney: %d",
                username, difficulty.toString(), fighterSkill, pilotSkill, engineerSkill, traderSkill, ship.toString(), money);
    }
}
