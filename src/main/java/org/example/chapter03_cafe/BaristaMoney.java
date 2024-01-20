package org.example.chapter03_cafe;

public class BaristaMoney {

    public int getBalance() {
        return balance;
    }

    private int balance;

    public BaristaMoney() {
    }

    public void safe(int orderCoffeePrice) {
        balance += orderCoffeePrice;
    }
}
