package org.example.chapter03_cafe;

import org.example.chapter03_cafe.coffeeInfomation.*;

import java.util.Scanner;

public class CoffeeMenu {
    Customer customer = new Customer();

    public void menuChoose() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Menu--------");
        System.out.println("1. Americano : 1500원");
        System.out.println("2. Cappuccino : 2000원");
        System.out.println("3. Macchiatto : 2500원");
        System.out.println("4. Espresso : 2500원");
        System.out.println("--------------------");
        System.out.println(" 메뉴를 선택해 주세요.");

        String userInput = sc.nextLine();
        try {
            CoffeeType coffeeType = CoffeeType.valueOf(userInput);
            CoffeeInfomation coffeeInfomation;
            coffeeInfomation = switch (coffeeType) {
                case Americano -> coffeeInfomation = new Americano();
                case Cappuccino -> coffeeInfomation = new Cappuccino();
                case Macchiatto -> coffeeInfomation = new Macchiatto();
                case Espresso -> coffeeInfomation = new Espresso();
                default -> throw new IllegalStateException("다시 주문해주세요." + coffeeType);
            };
            customer.orderCoffeeFromBarista(coffeeInfomation.getCoffeeName(), coffeeInfomation.getPrice());
        } catch (IllegalArgumentException e) {
            System.out.println("올바른 메뉴를 선택해주세요.");
        }
    }
}
