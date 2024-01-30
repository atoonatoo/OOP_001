package org.example.chapter03_cafe2;

import java.util.ArrayList;

public class Customer {

    private String customerName;
    private int money = 10000;

    private ArrayList<Coffee> coffees = new ArrayList<>();

    public String getCustomerName() {
        return customerName;
    }

    public int getMoney() {
        return money;
    }

    public Customer() {
    }

    public Customer(String customerName, int money) {
        this.customerName = customerName;
        this.money = money;
    }


    Barista barista = new Barista();

    public void order(Menu menu) {
        menu.menuBoard();
        menu.orderMenu();
    }

    public void orderCoffeeMenu(String coffeeName, int price) {
        barista.makeCoffee(coffeeName, price, money);
        money -= price;
    }

    public void pay(int price) {
        money -= price;
    }
}
