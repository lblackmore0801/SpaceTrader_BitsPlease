package com.example.spacetrader_bitsplease.entity;

public enum Condition {
    NOSPECIALRESOURCES("No Special Resources"),
    MINERALRICH("Mineral Rich"),
    MINERALPOOR("Mineral Poor"),
    DESERT("Desert"),
    LOTSOFWATER("Lots of Water"),
    RICHSOIL("Rich Soil"),
    POORSOIL("Poor Soil"),
    RICHFAUNA("Rich Fauna"),
    LIFELESS("Lifeless"),
    WEIRDMUSHROOMS("Weird Mushrooms"),
    LOTSOFHERBS("Lots of Herbs"),
    ARTISTIC("Artistic"),
    WARLIKE("Warlike");

    private final String resource;

    Condition(String resource) {
        this.resource = resource;
    }

    public String toString() {
        return resource;
    }
}
