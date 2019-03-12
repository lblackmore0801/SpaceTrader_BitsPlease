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

    TradeGoods(String tradeGood, int mtlp, int mtlu, int ttp, int basePrice, int ipl, int var) {
        this.tradeGood = tradeGood;
        this.mtlp = mtlp;
        this.mtlu = mtlu;
        this.ttp = ttp;
        this.basePrice = basePrice;
        this.ipl = ipl;
        this.var = var;
    }

    public int getMtlp() {
        return mtlp;
    }

    public int getMtlu() {
        return mtlu;
    }

    public int getIpl() {
        return ipl;
    }

    public int getVar() {
        return var;
    }

    public int getTtp() {
        return ttp;
    }

    public int getBasePrice() {
        return basePrice;
    }


    public String toString() {
        return tradeGood;
    }

    public static List<TradeGoods> getGoods() {
        return goods;
    }

}


