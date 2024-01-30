package org.example.chapter03_cafe;

import org.example.chapter03_cafe.coffeeInfomation.*;

import java.util.ArrayList;
import java.util.List;

public class Barista {
    public Barista(int balance) {
        this.balance = balance;
    }

    private int balance = 0;

    public int getBalance() {
        return balance;
    }

    public Barista() {
    }

    public int getbaristaMoney(int price) {
        balance += price;
        return balance;
    }

    public void remainingBaristaMoney() {
        System.out.println("바리스타 소지금 : " + balance + " 원");
    }

    ;


    //  public List<CoffeeInfomation> makeCoffee(String orderCoffeeName, int orderCoffeePrice) {
    //  System.out.println("바리스타 : 고객님 께서 주문하신 [" + orderCoffeeName + "] [" + orderCoffeePrice + "]원 되겠습니다. 곧 준비해드리겠습니다");
    //  List<CoffeeInfomation> coffeeInfomations = new ArrayList<>();

    //   for (int i = 0; i <= 3; i++) {
    //       switch (coffeeInfomations) {
    //           case Americano -> coffeeInfomations.add(new Americano());
    //           case Cappuccino -> coffeeInfomations.add(new Cappuccino());
    //           case Macchiatto -> coffeeInfomations.add(new Macchiatto());
    //          case Espresso -> coffeeInfomations.add(new Espresso());
    //      }
    //     return coffeeInfomations;

}


