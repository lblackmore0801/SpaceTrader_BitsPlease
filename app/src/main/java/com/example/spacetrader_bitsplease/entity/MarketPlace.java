package com.example.spacetrader_bitsplease.entity;

public class MarketPlace {

    private int remainingStorageCapacity;
    private int money;

    public MarketPlace(int money, int remainingStorageCapacity) {
        this.remainingStorageCapacity = remainingStorageCapacity;
        this.money = money;
    }


    public void buyResource(Resource resource, int price, int quantity) {

        if (price > money || quantity > remainingStorageCapacity) {
            //do not buy
        } else {
            remainingStorageCapacity -= quantity;
            money -= price * quantity;
        }

    }

}
