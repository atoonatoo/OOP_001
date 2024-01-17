package org.example.chapter02_fishbread_version2;

import java.util.ArrayList;
import java.util.List;

public class FishBreadSeller {
    private int salesMoney;
    private List<FishBread> availableFishBreads;

    public FishBreadSeller() {
        this.salesMoney = 0;
        this.availableFishBreads = new ArrayList<>();
    }
    public int getSalesMoney() {
        return salesMoney;
    }

    public List<FishBread> getAvailableFishBreads() {
        return availableFishBreads;
    }

    public void receiveMoney(int amount) {
        salesMoney += amount;
    }

    public void addFishBread(FishBread fishBread) {
        availableFishBreads.add(fishBread);
    }

    public void removeFishBread(FishBread fishBread) {
        availableFishBreads.remove(fishBread);
    }
}
