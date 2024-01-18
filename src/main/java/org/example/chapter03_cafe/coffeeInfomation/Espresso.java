package org.example.chapter03_cafe.coffeeInfomation;

public class Espresso implements CoffeeInfomation {

    @Override
    public String getCoffeeName() {
        return "Espresso";
    }

    @Override
    public int getPrice() {
        return 2000;
    }
}
