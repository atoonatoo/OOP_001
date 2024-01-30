package org.example.chapter03_cafe;

import org.example.chapter03_cafe.coffeeInfomation.*;

import java.util.List;
import java.util.Scanner;

public class Customer {
    Scanner sc = new Scanner(System.in); // 스캐너

    private String customerName = "제임스";
    private int customerMoney = 10000;

    public Customer() {
    }

    public Customer(String customerName, int customerMoney) {
        this.customerName = customerName;
        this.customerMoney = customerMoney;
    }

    //메뉴판 보기
    public void orderCoffee(CoffeeMenu coffeeMenu, Barista barista) {
        coffeeMenu.menuChoose(); // 메뉴판 보기
        String userInput = sc.nextLine(); // 입력값 넣기
        CoffeeType coffeeType = CoffeeType.valueOf(userInput); //입력값과 일치하는 이넘클래스 찾기
        CoffeeInfomation coffeeInfomation; //인터페이스 초기화
        switch (coffeeType) {
            case Americano -> coffeeInfomation = new Americano();
            case Cappuccino -> coffeeInfomation = new Cappuccino();
            case Macchiatto -> coffeeInfomation = new Macchiatto();
            case Espresso -> coffeeInfomation = new Espresso();
            default -> throw new IllegalStateException("다시 주문해주세요." + coffeeType);
        }
        if (coffeeInfomation.getPrice() > customerMoney) {
            System.out.println("금액 부족");
            return;
        }
        pay(coffeeInfomation.getPrice());
        baristaMoney(coffeeInfomation.getPrice(), barista);
        takeCoffee(coffeeInfomation.getCoffeeName());
        System.out.println(coffeeInfomation.getCoffeeName() + coffeeInfomation.getPrice());
    }


    private int baristaMoney(int price, Barista barista) {

        return barista.getbaristaMoney(price);
    }

    public void pay(int orderCoffeePrice) {
        customerMoney -= orderCoffeePrice;
    }


    public void remainingMoney() {
        System.out.println("내 소지금 : " + customerMoney + " 원");
    }


    public void takeCoffee(String takeCoffee) {

        System.out.println("주문한 커피 " + takeCoffee + "를 마시겠습니까?");
        System.out.println("1. 마신다 | 2. 안마신다.");

        int drink = sc.nextInt();
        if (drink == 1) {
            System.out.println("아이 맛있다~ " + takeCoffee + " 맛이네~ + 개수");
            return ;
        }
        if (drink == 2 ){
            System.out.println("나중에 마시자..");
            return;
        }
    }


}
