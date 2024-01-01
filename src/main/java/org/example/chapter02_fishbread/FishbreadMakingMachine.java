package org.example.chapter02_fishbread;

import java.util.ArrayList;
import java.util.Scanner;

public class FishbreadMakingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initialDeposit = 10000;
        int totalPrice = 0;
        boolean trade = true;

        Fishbread redBeanFishBread = new Fishbread("팥 붕어빵", 1000);
        Fishbread creamFishBread = new Fishbread("크림 붕어빵", 1500);
        Fishbread hotFishBread = new Fishbread("매운 붕어빵", 2000);
        Balance balance = new Balance();

        while (trade) {
            System.out.println("1.붕어빵 구매 | 2.붕어빵 봉투 열기 | 3.붕어빵 메뉴판 | 4.내 소지금 | 5.붕어빵 장수 금고 | 0.거래 종료");
            int mainMenu = sc.nextInt();
            switch (mainMenu) {
                case 1:
                    System.out.println("1.팥 붕어빵 1000원 | 2.크림 붕어빵 1500원 | 3.매운 붕어빵 2000원");
                    int tradeMenu = sc.nextInt();
                    System.out.println("몇개를 구매하시겠습니까?");
                    int buyQuantity = sc.nextInt();
                    int tradePrice;

                    switch (tradeMenu) {
                        case 1:
                            tradePrice = redBeanFishBread.getPrice();
                            redBeanFishBread.increaseQuantity(buyQuantity);
                            initialDeposit -= tradePrice * buyQuantity;
                            totalPrice += tradePrice * buyQuantity;
                            redBeanFishBread.increaseRevenue(totalPrice);
                            break;
                        case 2:
                            tradePrice = creamFishBread.getPrice();
                            creamFishBread.increaseQuantity(buyQuantity);
                            initialDeposit -= tradePrice * buyQuantity;
                            totalPrice += tradePrice * buyQuantity;
                            creamFishBread.increaseRevenue(totalPrice);
                            break;
                        case 3:
                            tradePrice = hotFishBread.getPrice();
                            hotFishBread.increaseQuantity(buyQuantity);
                            totalPrice += tradePrice * buyQuantity;
                            initialDeposit -= tradePrice * buyQuantity;
                            hotFishBread.increaseRevenue(totalPrice);
                            break;
                    }
                    System.out.println("구매 완료");
                    break;

                case 2:
                    System.out.println(redBeanFishBread.getFishbreadName() + " " + redBeanFishBread.getQuantity() + "개");
                    System.out.println(creamFishBread.getFishbreadName() + " " + creamFishBread.getQuantity() + "개");
                    System.out.println(hotFishBread.getFishbreadName() + " " + hotFishBread.getQuantity() + "개");
                    System.out.println("무슨 붕어빵을 먹겠습니까? 1.팥 붕어빵 | 2.크림 붕어빵 | 3.매운 붕어빵");
                    int eatChoice = sc.nextInt();
                    System.out.println("몇개를 먹겠습니까");
                    int eatQuantity = sc.nextInt();
                    switch (eatChoice) {
                        case 1:
                            redBeanFishBread.decreaseQuantity(eatQuantity);
                            System.out.println("아이 맛있다~" + redBeanFishBread.getFishbreadName() + " 맛이네~ 남은 갯수 " + redBeanFishBread.getQuantity() + "개");
                            break;
                        case 2:
                            creamFishBread.decreaseQuantity(eatQuantity);
                            System.out.println("아이 맛있다~" + creamFishBread.getFishbreadName() + " 맛이네~ 남은 갯수 " + creamFishBread.getQuantity() + "개");
                            break;
                        case 3:
                            hotFishBread.decreaseQuantity(eatQuantity);
                            System.out.println("아이 맛있다~" + hotFishBread.getFishbreadName() + " 맛이네~ 남은 갯수 " + hotFishBread.getQuantity() + "개");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("-------------------------");
                    System.out.println(" 메뉴 이름  |    가격표 ");
                    System.out.println(" 팥 붕어빵      1000원 ");
                    System.out.println(" 크림 붕어빵    1500원 ");
                    System.out.println(" 매운 붕어빵    2000원 ");
                    System.out.println("-------------------------");

                    break;
                case 4:
                    System.out.println("내 남은 소지금 : " + initialDeposit + "원");
                    break;
                case 5:
                    System.out.println("총 매출액 : " + totalPrice + "원");
                    break;
                case 0:
                    trade = false;
                    System.out.println("구매해주셔서 감사합니다. 또 오세요 ~ ");
                    break;
            }
        }
    }
}