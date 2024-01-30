package org.example.chapter03_cafe2;

import org.example.chapter03_cafe.Barista;
import org.example.chapter03_cafe.CoffeeType;
import org.example.chapter03_cafe2.CoffeeMenu.*;

import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);

    Barista barista = new Barista();

    public void menuBoard(){
        System.out.println("--------Menu--------");
        System.out.println("1. Americano : 1500원");
        System.out.println("2. Cappuccino : 2000원");
        System.out.println("3. Macchiatto : 2500원");
        System.out.println("4. Espresso : 2500원");
        System.out.println("--------------------");
        System.out.println(" 메뉴를 선택해 주세요.");
    }

    public void orderMenu() {
        Customer customer = new Customer();
        String userInput = sc.nextLine();
        org.example.chapter03_cafe.CoffeeType coffeeType = CoffeeType.valueOf(userInput);
        CoffeeList coffeeList;
        switch (coffeeType) {
            case Americano -> coffeeList = new Americano();
            case Cappuccino -> coffeeList = new Cappuccino();
            case Macchiatto -> coffeeList = new Macchiatto();
            case Espresso -> coffeeList = new Espresso();
            default -> throw new IllegalStateException("다시 주문해주세요" + coffeeType);
        }
        customer.orderCoffeeMenu(coffeeList.getCoffeeName(), coffeeList.getCoffeePrice());
    }
}
