package org.example.chapter03_cafe;

import org.example.chapter03_cafe.coffeeInfomation.CoffeeInfomation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("제임스", 10000);
        Barista barista = new Barista(0);
        Scanner sc = new Scanner(System.in);
        CoffeeMenu coffeeMenu = new CoffeeMenu();
        boolean cafe = true;
        while (cafe) {
            System.out.println("1. 커피주문 | 2. 내가 갖고 있는 커피 확인 | 3. 바리스타의 소지금 | 4. 내 소지금 | 0. 거래종료");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    customer.orderCoffee(coffeeMenu, barista);
                    break;
                case 2:
                    break;
                case 3:
                    barista.remainingBaristaMoney();
                    break;
                case 4:
                    customer.remainingMoney();
                    break;
                case 0:
                    System.out.println("이용해주셔서 감사합니다.");
                    cafe = false;
                    break;
            }
        }

    }
}
