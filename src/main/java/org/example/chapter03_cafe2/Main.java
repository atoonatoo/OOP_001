package org.example.chapter03_cafe2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean menu = true;

        while (menu){
            System.out.println("1.메뉴 주문 | 2.구매 목록 | 3. 손님 소지금 | 4. 바리스타 소지금 | 0. 종료 |");
            int menuchoice = sc.nextInt();
            switch (menuchoice){
                case 1:
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
            }
        }
    }
}
