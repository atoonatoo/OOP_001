package org.example.chapter03_cafe2.CoffeeMenu;

public class Espresso implements CoffeeList{
    @Override
    public String getCoffeeName() {
        return "에스프레소";
    }

    @Override
    public int getCoffeePrice() {
        return 1500;
    }
}
