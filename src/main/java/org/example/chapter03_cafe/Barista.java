package org.example.chapter03_cafe;

import org.example.chapter03_cafe.coffeeInfomation.BaristaMoney;
import org.example.chapter03_cafe.coffeeInfomation.Coffee;

import java.util.ArrayList;
import java.util.List;

public class Barista {
    private int balance = 0;

    Coffee coffee = new Coffee();
    BaristaMoney baristaMoney = new BaristaMoney();

    public int getBalance() {
        return balance;
    }

    public Barista() {
    }

    public void makeCoffee(String orderCoffeeName, int orderCoffeePrice) {
        List<CoffeeType> coffeeTypes = new ArrayList<>();
        System.out.println("바리스타 : 고객님 께서 주문하신 [" + orderCoffeeName + "] [" + orderCoffeePrice + "]원 되겠습니다. 곧 준비해드리겠습니다");
        baristaMoney.safe(orderCoffeePrice);
       coffeeTypes = coffee.coffeelist(orderCoffeeName);
        //  coffees.add(orderCoffeeName);
    }


}
