package org.example.chapter03_cafe.coffeeInfomation;

public class Espresso implements CoffeeInfomation {

    @Override
    public String getCoffeeName() {
        return "에스프레소";
    }

    @Override
    public int getPrice() {
        return 2000;
    }
}
