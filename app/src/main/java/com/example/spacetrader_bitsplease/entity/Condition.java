package com.example.spacetrader_bitsplease.entity;

public enum Condition {
    //NOSPECIALRESOURCES("No Special Resources"),
    //MINERALRICH("Mineral Rich"),
    MINERALPOOR("Mineral Poor"),
    DESERT("Desert"),
    LOTSOFWATER("Lots of Water"),
    //RICHSOIL("Rich Soil"),
    POORSOIL("Poor Soil"),
    RICHFAUNA("Rich Fauna"),
    LIFELESS("Lifeless"),
    WEIRDMUSHROOMS("Weird Mushrooms"),
    LOTSOFHERBS("Lots of Herbs"),
    ARTISTIC("Artistic"),
    WARLIKE("Warlike");

    //String representation of the Condition enum
    private final String condition;

    /**
     * constructor for the Condition enum
     * @param condition String representation of the enum
     */
    Condition(String condition) {
        this.condition = condition;
    }

    /**
     * toString method for Condition enum
     * @return String representation of that enum
     */
    public String toString() {
        return condition;
    }
}
