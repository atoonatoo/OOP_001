package org.example.chapter03_cafe;

import org.example.chapter03_cafe.coffeeInfomation.CoffeeInfomation;

public class Main {
    public static void main(String[] args) {
        CoffeeMenu coffeeMenu = new CoffeeMenu();
        Customer customer = new Customer();
        CoffeeInfomation coffeeInfomation = null;
        CoffeeType coffeeType = null;

    customer.orderCoffee(coffeeMenu, coffeeType);

    }
}
