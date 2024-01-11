package org.example.chapter02_fishbread_version2;

public class FishBreadSeller {
    private int salesMoney;

    public FishBreadSeller() {
        this.salesMoney = 0;
    }

    public int getSalesMoney() {
        return salesMoney;
    }

    public void receiveMoney(int amount) {
        salesMoney += amount;
    }
}
