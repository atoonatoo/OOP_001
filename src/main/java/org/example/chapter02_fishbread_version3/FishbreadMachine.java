package org.example.chapter02_fishbread_version3;

import java.util.List;
import java.util.Scanner;

public class FishbreadMachine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Customer customer = new Customer();
        Fishbread fishbread = new Fishbread();
        Vault vault = new Vault();
        boolean trade = true;

        while (trade){
            System.out.println("1. 붕어빵 구매");
            int menu = sc.nextInt();
            switch (menu){
                case 1:
                   customer.order(menu);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    vault.showAmount();
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
