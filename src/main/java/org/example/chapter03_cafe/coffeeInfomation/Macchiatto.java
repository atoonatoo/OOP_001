package org.example.chapter03_cafe.coffeeInfomation;

public class Macchiatto implements CoffeeInfomation{
    @Override
    public String getCoffeeName() {
        return "Macchiatto";
    }

    @Override
    public int getPrice() {
        return 2500;
    }
}
