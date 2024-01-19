package org.example.chapter03_cafe;

import java.util.ArrayList;
import java.util.List;

public class Barista {
    private int balance = 0;


    private String coffee;
    private List<String> coffees = new ArrayList<String>();


    public List<Barista>(String coffee){
        this.coffee = coffee;
    }
    public int getBalance() {
        return balance;
    }

    public String getCoffee() {
        return coffee;
    }

    public Barista(int balance) {
        this.balance = balance;
    }

    public Barista() {
    }


    public void makeCoffee(String orderCoffeeName, int orderCoffeePrice, int money) {
        if (orderCoffeePrice > money) {
            return;
        }
        System.out.println("바리스타 : 고객님 께서 주문하신 [" + orderCoffeeName + "] [" + orderCoffeePrice + "]원 되겠습니다. 곧 준비해드리겠습니다");
        balance += orderCoffeePrice;

        System.out.println(orderCoffeeName + orderCoffeePrice);

        coffee = orderCoffeeName;
        coffees.add(coffee);
        System.out.println(coffee);
    }


}
