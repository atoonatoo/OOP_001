package org.example.chapter03_cafe.coffeeInfomation;

public class Americano implements CoffeeInfomation {


    @Override
    public String getCoffeeName() {
        return "아메리카노";
    }

    @Override
    public int getPrice() {
        return 1500;
    }
}
