package org.example.chapter03_cafe;

import org.example.chapter03_cafe.coffeeInfomation.CoffeeInfomation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CoffeeMenu coffeeMenu = new CoffeeMenu();
        Barista barista = new Barista();
        Customer customer = new Customer();

        CoffeeType coffeeType = null;
        boolean cafe = true;


        while (cafe){
            System.out.println("1. 커피주문 | 2. 내가 갖고 있는 커피 확인 | 3. 바리스타의 소지금 | 4. 내 소지금 | 0. 거래종료");
            int menu = sc.nextInt();
            switch (menu){
                case 1:
                    customer.orderCoffee(coffeeMenu);
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("바리스타 소지금 : " + barista.getBalance() + "원");
                    break;
                case 4:
                    System.out.println("내 소지금 :   원");
                    break;
                case 0 :
                    System.out.println("이용해주셔서 감사합니다.");
                    cafe = false;
                    break;
            }
        }

    }
}
