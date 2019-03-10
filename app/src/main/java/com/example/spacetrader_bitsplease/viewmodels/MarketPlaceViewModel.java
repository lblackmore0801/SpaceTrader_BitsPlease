package com.example.spacetrader_bitsplease.viewmodels;

import com.example.spacetrader_bitsplease.entity.Player;
import com.example.spacetrader_bitsplease.entity.Resource;

public class MarketPlaceViewModel {

    private int remainingStorageCapacity;
    private int money;

    public MarketPlaceViewModel(int money, int remainingStorageCapacity) {
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
