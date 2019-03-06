package com.example.spacetrader_bitsplease.entity;

public class MarketPlace {

    private int remainingStorageCapacity;
    private int money;

    public MarketPlace(int money, int remainingStorageCapacity) {
        this.remainingStorageCapacity = remainingStorageCapacity;
        this.money = Player.getMoney();
    }

    //only buy a resource if you have sufficient funds and storage capacity
    public void buyResource(Resource resource, int price, int quantity) {
        if (((price * quantity) <= money) && (quantity <= remainingStorageCapacity)) {
            remainingStorageCapacity -= quantity;
            money -= price * quantity;
        }
    }

    public void sellResource(Resource resource, int price, int quantity) {
        if (((price * quantity) <= money) && (quantity <= remainingStorageCapacity)) {
            remainingStorageCapacity -= quantity;
            money += price * quantity;
        }
    }
}
