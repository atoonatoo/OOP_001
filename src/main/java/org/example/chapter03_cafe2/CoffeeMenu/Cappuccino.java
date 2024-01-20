package org.example.chapter03_cafe2.CoffeeMenu;

public class Cappuccino implements CoffeeList{

    @Override
    public String getCoffeeName() {
        return "카푸치노";
    }

    @Override
    public int getCoffeePrice() {
        return 2000;
    }
}
