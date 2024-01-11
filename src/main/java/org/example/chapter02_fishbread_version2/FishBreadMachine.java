package org.example.chapter02_fishbread_version2;

import java.util.Scanner;

public class FishBreadMachine {
    // scanner를 클래스 변수로 선언
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // 붕어빵 종류 초기화
        FishBread[] fishBreads = {
                new FishBread("팥 붕어빵", 1000),
                new FishBread("크림 붕어빵", 1500),
                new FishBread("매운 붕어빵", 2000)
        };

        // 초기 소지금 설정
        Customer customer = new Customer(10000);
        FishBreadSeller seller = new FishBreadSeller();

        // 붕어빵 재고 설정
        for (FishBread fishBread : fishBreads) {
            fishBread.addQuantity(10);
        }

        // CLI 인터페이스 구현
        while (true) {
            System.out.println("1. 붕어빵 구매");
            System.out.println("2. 내가 갖고 있는 붕어빵의 목록");
            System.out.println("3. 판매 중인 붕어빵 목록, 가격 출력");
            System.out.println("4. 나의 소지금 확인");
            System.out.println("5. 붕어빵 장수의 금고에 있는 돈 확인");
            System.out.println("0. 종료");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    buyFishBread(fishBreads, customer, seller);
                    break;
                case 2:
                    printOwnedFishBread(fishBreads);
                    break;
                case 3:
                    printAvailableFishBread(fishBreads);
                    break;
                case 4:
                    printCustomerMoney(customer);
                    break;
                case 5:
                    printSellerMoney(seller);
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }

    private static void buyFishBread(FishBread[] fishBreads, Customer customer, FishBreadSeller seller) {
        System.out.println("구매할 붕어빵을 선택하세요:");
        for (int i = 0; i < fishBreads.length; i++) {
            System.out.println((i + 1) + ". " + fishBreads[i]);
        }

        int choice = scanner.nextInt();
        if (choice < 1 || choice > fishBreads.length) {
            System.out.println("잘못된 입력입니다.");
            return;
        }

        FishBread selectedFishBread = fishBreads[choice - 1];
        if (selectedFishBread.getQuantity() == 0) {
            System.out.println("해당 붕어빵이 품절되었습니다.");
            return;
        }

        int quantityToBuy = 1;
        int totalCost = selectedFishBread.getPrice() * quantityToBuy;

        if (customer.getMoney() < totalCost) {
            System.out.println("돈이 부족합니다.");
            return;
        }

        customer.pay(totalCost);
        selectedFishBread.reduceQuantity(quantityToBuy);
        seller.receiveMoney(totalCost);

        System.out.println(selectedFishBread.getType() + "을/를 구매하였습니다.");
        System.out.println("금액: " + totalCost + "원");
    }

    private static void printOwnedFishBread(FishBread[] fishBreads) {
        System.out.println("내가 갖고 있는 붕어빵 목록:");
        for (FishBread fishBread : fishBreads) {
            System.out.println(fishBread.getType() + " 수량: " + fishBread.getQuantity());
        }
    }

    private static void printAvailableFishBread(FishBread[] fishBreads) {
        System.out.println("판매 중인 붕어빵 목록과 가격:");
        for (FishBread fishBread : fishBreads) {
            System.out.println(fishBread);
        }
    }

    private static void printCustomerMoney(Customer customer) {
        System.out.println("나의 소지금: " + customer.getMoney() + "원");
    }

    private static void printSellerMoney(FishBreadSeller seller) {
        System.out.println("분식 장수의 금고에 있는 돈: " + seller.getSalesMoney() + "원");
    }
}
