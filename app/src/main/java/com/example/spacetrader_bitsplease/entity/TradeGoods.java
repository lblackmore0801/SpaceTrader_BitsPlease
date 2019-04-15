package com.example.spacetrader_bitsplease.entity;

import java.util.ArrayList;
import java.util.List;

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

    private static final List<TradeGoods> goods;

    private final String tradeGood;
    private final int mtlp;
    private final int mtlu;
    private final int ttp;
    private final int basePrice;
    private final int ipl;
    private final int var;

    static {
        goods = new ArrayList<>();
        for (TradeGoods good : TradeGoods.values()) {
            goods.add(good);
        }
    }

    /**
     * constructor for the shipType enum
     * @param tradeGood type of tradeGood
     * @param mTLP mimimum tech level to produce
     * @param mTLU minimum tech level to use
     * @param ttp tech level which produces this item
     * @param basePrice int value of a base price of a resource
     * @param ipl price increase per tech level
     * @param var max variance above or below base price
     */
    TradeGoods(String tradeGood, int mTLP, int mTLU, int ttp, int basePrice, int ipl, int var) {
        this.tradeGood = tradeGood;
        this.mtlp = mTLP;
        this.mtlu = mTLU;
        this.ttp = ttp;
        this.basePrice = basePrice;
        this.ipl = ipl;
        this.var = var;
    }

    /**
     * getter for the minimum tech level to produce
     * @return int of the minimum tech level to produce
     */
    public int getMtlp() {
        return mtlp;
    }

    /**
     * getter for the price increase per tech level
     * @return int of the minimum tech level to produce
     */
    public int getIpl() {
        return ipl;
    }

    /**
     * getter for the tech level which produces this item
     * @return int of the tech level which produces this item
     */
    public int getTtp() {
        return ttp;
    }

    /**
     * getter for the base price
     * @return int of the base price of a resource
     */
    public int getBasePrice() {
        return basePrice;
    }

    /**
     * toString method for a tradeGood
     * @return String representation of the tradegood
     */
    public String toString() {
        return tradeGood;
    }

    /**
     * getter for all of the goods
     * @return List of TradeGoods that is static
     */
    public static List<TradeGoods> getGoods() {
        return goods;
    }

}


