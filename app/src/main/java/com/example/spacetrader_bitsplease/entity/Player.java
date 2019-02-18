package com.example.spacetrader_bitsplease.entity;

public class Player {
    private String username;
    private int difficulty;
    private int pilotSkill;
    private int engineerSkill;
    private int fighterSkill;
    private int traderSkill;

    /**
     * Constructor required for making the new object
     *
     * @param name name of the student
     */
    public Player(String name) {
        username = name;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public String getUsername() {
        return username;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
    public int getDifficulty() {
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
        return String.format("Username: %s \nDifficulty: %s \nPilot Skill: %d \nEngineering Skill: " +
                "%d \nFighter Skill: %d \nTrader Skill: %d", username, difficulty, pilotSkill,
                engineerSkill, traderSkill);
    }
}
