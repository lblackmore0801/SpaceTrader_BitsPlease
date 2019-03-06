package com.example.spacetrader_bitsplease.entity;

public enum TradeGoods {

    WATER("Water", 0, 0, 2, 30, 3, 4),
    FURS("Furs", 0, 0, 0, 250, 10, 10),
    FOOD("Food", 1, 0, 1, 100, 5, 5),
    ORE("Ore", 2, 2, 3, 350, 20, 10),
    GAMES("Games", 3, 1, 6, 250, -10, 5),
    FIREARMS("Firearms", 3, 1, 5, 1250, -75, 100),
    MEDICINE("Medicine", 4, 1, 6, 650, -20, 10),
    MACHINES("Machines", 4, 3, 5, 900, -30, 5),
    NARCOTICS("Narcotics", 5, 0, 5, 3500, -125, 150),
    ROBOTS("Robots", 6, 4, 7, 5000, -150, 100);

    private final String tradeGood;

    TradeGoods(String tradeGood, int mtlp, int mtlu, int ttp, int basePrice, int ipl, int var) {
        this.tradeGood = tradeGood;
    }

    public String toString() {
        return tradeGood;
    }

}

