package com.example.spacetrader_bitsplease.entity;

public enum Difficulty {
    BEGINNER("Beginner"),
    EASY("Easy"),
    MEDIUM ("Medium"),
    HARD("Hard"),
    IMPOSSIBLE("Impossible");

    private final String difficulty;

    Difficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String toString() {
        return difficulty;
    }
}
