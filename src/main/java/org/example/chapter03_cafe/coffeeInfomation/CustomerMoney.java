package org.example.chapter03_cafe.coffeeInfomation;

public class CustomerMoney {
    public int getMoney() {
        return money;
    }

    private int money = 10000;
    public CustomerMoney() {
    }

    public void pay(int orderCoffeePrice) {
        money -= orderCoffeePrice;
    }
}
