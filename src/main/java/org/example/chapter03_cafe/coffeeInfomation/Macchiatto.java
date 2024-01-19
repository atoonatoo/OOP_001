package org.example.chapter03_cafe.coffeeInfomation;

public class Macchiatto implements CoffeeInfomation{
    @Override
    public String getCoffeeName() {
        return "캬라멜마끼아또";
    }

    @Override
    public int getPrice() {
        return 2500;
    }
}
