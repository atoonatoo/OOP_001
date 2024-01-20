package org.example.chapter03_cafe;

import java.util.ArrayList;
import java.util.List;

public class Barista {
    private int balance = 0;
    private List<String> coffees = new ArrayList<String>();


    public List<String> getCoffees() {
        return coffees;
    }


    public int getBalance() {
        return balance;
    }


    public Barista(int balance) {
        this.balance = balance;
    }

    public Barista() {
    }


    public void makeCoffee(String orderCoffeeName, int orderCoffeePrice, int money) {
        String coffee;
        if (orderCoffeePrice > money) {
            return;
        }
        System.out.println("바리스타 : 고객님 께서 주문하신 [" + orderCoffeeName + "] [" + orderCoffeePrice + "]원 되겠습니다. 곧 준비해드리겠습니다");
        balance += orderCoffeePrice;

        System.out.println(orderCoffeeName + orderCoffeePrice);
        coffees.add(orderCoffeeName);
    }


}
