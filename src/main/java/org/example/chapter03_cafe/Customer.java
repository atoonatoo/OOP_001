package org.example.chapter03_cafe;

import org.example.chapter03_cafe.coffeeInfomation.*;

import java.util.List;
import java.util.Scanner;

public class Customer {
    private int money = 10000;

    public Customer(int money) {
        money = money;
    }

    public int getMoney() {
        return money;
    }
    CoffeeMenu coffeeMenu = new CoffeeMenu();


    public void orderCoffee(CoffeeMenu coffeeMenu, Barista barista){
            Barista barista1 = new Barista();
        coffeeMenu.menuChoose();
        barista.makingCoffee(coffeeMenu, money);

    }

    public void pay(int price) {
        money -= price;
    }
}
