package org.example.chapter02_fishbread_version2;

public class Customer {
    private int money;

    public Customer(int initialMoney) {
        this.money = initialMoney;
    }

    public int getMoney() {
        return money;
    }

    public void pay(int amount) {
        if (amount > money) {
            System.out.println("돈이 부족합니다.");
        } else {
            money -= amount;
        }
    }
}
