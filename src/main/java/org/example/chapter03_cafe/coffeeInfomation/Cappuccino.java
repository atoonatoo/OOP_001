package org.example.chapter03_cafe.coffeeInfomation;

import org.example.chapter02_fishbread.Fishbread;

public class Cappuccino implements CoffeeInfomation {
    @Override
    public String getCoffeeName() {
        return "카푸치노";
    }

    @Override
    public int getPrice() {
        return 2000;
    }
}
