package com.example.spacetrader_bitsplease.entity;

public enum Size {
    SMALL("Small"),
    MEDIUM ("Mediium"),
    LARGE("Large");

    private final String size;

    Size(String size) {
        this.size = size;
    }

    public String toString() {
        return size;
    }
}
