package com.example.spacetrader_bitsplease.entity;

public enum Size {
    SMALL("Small"),
    MEDIUM ("Medium"),
    LARGE("Large");

    private final String size;

    /**
     * constructor for the size enum
     * @param size String of size of planet
     */
    Size(String size) {
        this.size = size;
    }

    /**
     * toString method to return string representation of size of planet
     * @return String representation of size of planet
     */
    public String toString() {
        return size;
    }
}
