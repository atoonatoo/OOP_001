package org.example.chapter03_cafe;

import org.example.chapter03_cafe.coffeeInfomation.*;

import java.util.Scanner;

public class CoffeeMenu {
    Customer customer = new Customer();
    public void menuChoose() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Menu--------");
        System.out.println("1. 아메리카노 : 1500원");
        System.out.println("2. 카푸치노 : 2000원");
        System.out.println("3. 카라멜 마끼아또 : 2500원");
        System.out.println("4. 에스프레소 : 2500원");
        System.out.println("--------------------");
        System.out.println(" 메뉴를 선택해 주세요.");

        String userInput = sc.nextLine();

        CoffeeType coffeeType = CoffeeType.valueOf(userInput);
        CoffeeInfomation coffeeInfomation = null;
        switch (coffeeType){
            case Americano -> coffeeInfomation = new Americano();
            case Cappuccino -> coffeeInfomation = new Cappuccino();
            case Macchiatto -> coffeeInfomation = new Macchiatto();
            case Espresso -> coffeeInfomation = new Espresso();
            default -> throw new IllegalStateException("다시 주문해주세요." + coffeeType);
        }
        String orderCoffeeName = coffeeInfomation.getCoffeeName();
        int orderCoffeePrice = coffeeInfomation.getPrice();
        customer.orderCoffeeFromBarista(orderCoffeeName, orderCoffeePrice);
    }
}
