package org.example.chapter02_fishbread_version3;

import java.util.List;
import java.util.Scanner;

public class FishbreadMachine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Customer customer = new Customer();
        Fishbread fishbread = new Fishbread();
        boolean trade = true;

        while (trade){
            System.out.println("1. 붕어빵 구매");
            int menu = sc.nextInt();
            switch (menu){
                case 1:
                    int orderQuantity;
                    System.out.println("1. 팥붕어빵 | 2. 크림붕어빵 | 3. 매운붕어빵");
                    int choice = sc.nextInt();
                    System.out.println("몇개를 구매하시겠습니까?");
                    switch (choice) {
                        case 1:
                            orderQuantity = sc.nextInt();
                            customer.order(Fishbread.redbean, orderQuantity);
                            break;
                        case 2:
                            orderQuantity = sc.nextInt();
                            customer.order(Fishbread.cream, orderQuantity);
                            break;
                        case 3:
                            orderQuantity = sc.nextInt();
                            customer.order(Fishbread.hot, orderQuantity);
                            break;
                        default:
                            System.out.println("잘못된 선택입니다.");
                            break;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 0:
                    trade = false;
                    break;
            }
        }
    }
}
