package com.example.spacetrader_bitsplease.entity;

//enumeration for the difficulty of the game
public enum Difficulty {
    BEGINNER("Beginner"),
    EASY("Easy"),
    MEDIUM ("Medium"),
    HARD("Hard"),
    IMPOSSIBLE("Impossible");

    //String representation of the Difficulty enum
    private final String difficulty;

    /**
     * constructor for the Difficulty enum
     * @param difficulty String representation of the enum
     */
    Difficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * toString method for Difficulty enum
     * @return String representation of that enum
     */
    public String toString() {
        return difficulty;
    }
}
