package org.example.chapter03_cafe2.CoffeeMenu;

public class Americano implements CoffeeList {
    @Override
    public String getCoffeeName() {
        return "아메리카노";
    }

    @Override
    public int getCoffeePrice() {
        return 1500;
    }
}
