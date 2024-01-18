package org.example.chapter03_cafe;

public class Customer {
    private String customerName;
    private int money;

    public Customer(String customerName, int money){
        this.customerName = "제임스";
        this.money = 10000;
    }

    public void orderCoffee(CoffeeMenu coffeeMenu, CoffeeType coffeeType){


        coffeeMenu.menuChoose(coffeeType);
    }

}
