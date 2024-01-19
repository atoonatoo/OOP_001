package org.example.chapter03_cafe;

import org.example.chapter03_cafe.coffeeInfomation.*;

import java.util.Scanner;

public class CoffeeMenu {
    public String menuChoose(CoffeeType coffeeType) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Menu--------");
        System.out.println("1. 아메리카노 : 1500원");
        System.out.println("2. 카푸치노 : 2000원");
        System.out.println("3. 카라멜 마끼아또 : 2500원");
        System.out.println("4. 에스프레소 : 2500원");
        System.out.println("--------------------");
        System.out.println(" 메뉴를 선택해 주세요.");

        CoffeeInfomation coffeeInfomation = null;
        switch (coffeeType){
            case AMERICANO -> coffeeInfomation = new Americano();
            case Cappuccino -> coffeeInfomation = new Cappuccino();
            case Macchiatto -> coffeeInfomation = new Macchiatto();
            case Espresso -> coffeeInfomation = new Espresso();
        }
        return coffeeInfomation.getCoffeeName() + coffeeInfomation.getPrice();
    }
}
