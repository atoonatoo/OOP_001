package org.example.chapter03_cafe;

import org.example.chapter03_cafe.coffeeInfomation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Barista {
    Scanner sc = new Scanner(System.in);
    private int baristaMoney = 0;

    public void makingCoffee(CoffeeMenu coffeeMenu, int money) {
            Customer customer = new Customer(10000);
            int customerMoney = customer.getMoney();
        String inputOrder = sc.nextLine();
        CoffeeType coffeeType = CoffeeType.valueOf(inputOrder);
        CoffeeInfomation coffeeInfomation1;
        switch (coffeeType) {
            case Americano -> coffeeInfomation1 = new Americano();
            case Cappuccino -> coffeeInfomation1 = new Cappuccino();
            case Macchiatto -> coffeeInfomation1 = new Macchiatto();
            case Espresso -> coffeeInfomation1 = new Espresso();
            default -> throw new IllegalStateException("다시 주문해주세요" + coffeeType);
        }
        if (coffeeInfomation1.getPrice() > customerMoney){
            System.out.println("고객님 금액이 부족합니다.");
            return;
        }
        customer.pay(coffeeInfomation1.getPrice());
        baristaBank(coffeeInfomation1.getPrice());
        System.out.println("주문하신" + coffeeInfomation1.getCoffeeName() + "나왔습니다." + coffeeInfomation1.getPrice() + "원 되겠습니다.");

    }

    private void baristaBank(int price) {
        baristaMoney += price;
    }
}


