package com.example.spacetrader_bitsplease.entity;

public class MarketPlace {

    private int remainingStorageCapacity;
    private int money;

    public MarketPlace(int money, int remainingStorageCapacity) {
        this.remainingStorageCapacity = remainingStorageCapacity;
        this.money = Player.getMoney();
    }

    //only buy a condition if you have sufficient funds and storage capacity
    public void buyResource(Condition condition, int price, int quantity) {
        if (((price * quantity) <= money) && (quantity <= remainingStorageCapacity)) {
            remainingStorageCapacity -= quantity;
            money -= price * quantity;
        }
    }

    public void sellResource(Condition condition, int price, int quantity) {
        if (((price * quantity) <= money) && (quantity <= remainingStorageCapacity)) {
            remainingStorageCapacity -= quantity;
            money += price * quantity;
        }
    }
}
