package org.example.chapter03_cafe2;

import org.example.chapter03_cafe2.Barista;
import org.example.chapter03_cafe2.CoffeeMenuBoard;
import org.example.chapter03_cafe2.CoffeeType;
import org.example.chapter03_cafe2.Customer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer customer = new Customer("제임스", 10000);
        CoffeeMenuBoard coffeeMenuBoard = new CoffeeMenuBoard();
        Barista barista = new Barista();
        CoffeeType coffeeType = new CoffeeType();
        boolean menu = true;


        while (menu) {
            System.out.println("1.메뉴판 보기 | 2.구매한 커피 확인 | 3.손님 소지금 확인 | 4. 바리스타 소지금 확인");
            int menuchoice = sc.nextInt();
            switch (menuchoice) {
                case 1:
                    int coffeeChoice = sc.nextInt();
                    customer.orderCoffee(coffeeChoice);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    menu = false;
                    break;
                default:
            }
        }
    }
}
