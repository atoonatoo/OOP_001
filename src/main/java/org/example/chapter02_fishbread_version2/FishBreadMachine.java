package org.example.chapter02_fishbread_version2;

import java.util.List;
import java.util.Scanner;

public class FishBreadMachine {
    // scanner를 클래스 변수로 선언
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // 붕어빵 종류 초기화
        FishBreadSeller seller = initializeFishBreadSeller();

        // 초기 소지금 설정
        Customer customer = new Customer(10000);

        // CLI 인터페이스 구현
        while (true) {
            System.out.println("1. 돈을 지불하고 붕어빵 구매");
            System.out.println("2. 내가 갖고 있는 붕어빵의 목록 출력");
            System.out.println("3. 판매 중인 붕어빵 목록, 가격 출력");
            System.out.println("4. 나의 소지금 확인");
            System.out.println("5. 붕어빵 먹기");
            System.out.println("6. 붕어빵 장수의 금고에 있는 돈 확인");
            System.out.println("0. 종료");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    buyFishBread(customer, seller);
                    break;
                case 2:
                    printOwnedFishBread(customer);
                    break;
                case 3:
                    printAvailableFishBread(seller);
                    break;
                case 4:
                    printCustomerMoney(customer);
                    break;
                case 5:
                    eatFishBread(customer);
                    break;
                case 6:
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

    private static FishBreadSeller initializeFishBreadSeller() {
        FishBreadSeller seller = new FishBreadSeller();

        FishBread redBeanFishBread = new FishBread("팥 붕어빵", 1000);
        FishBread creamFishBread = new FishBread("크림 붕어빵", 1500);
        FishBread spicyFishBread = new FishBread("매운 붕어빵", 2000);

        redBeanFishBread.addQuantity(10);
        creamFishBread.addQuantity(10);
        spicyFishBread.addQuantity(10);

        seller.addFishBread(redBeanFishBread);
        seller.addFishBread(creamFishBread);
        seller.addFishBread(spicyFishBread);

        return seller;
    }

    private static void buyFishBread(Customer customer, FishBreadSeller seller) {
        System.out.println("구매할 붕어빵을 선택하세요:");
        List<FishBread> availableFishBreads = seller.getAvailableFishBreads();
        for (int i = 0; i < availableFishBreads.size(); i++) {
            System.out.println((i + 1) + ". " + availableFishBreads.get(i).toDetailedString());
        }

        int choice = scanner.nextInt();
        if (choice < 1 || choice > availableFishBreads.size()) {
            System.out.println("잘못된 입력입니다.");
            return;
        }

        FishBread selectedFishBread = availableFishBreads.get(choice - 1);

        System.out.println("구매할 갯수를 입력하세요:");
        int quantityToBuy = scanner.nextInt();

        if (quantityToBuy <= 0 || quantityToBuy > selectedFishBread.getQuantity()) {
            System.out.println("잘못된 입력입니다.");
            return;
        }

        int totalCost = selectedFishBread.getPrice() * quantityToBuy;

        if (customer.getMoney() < totalCost) {
            System.out.println("돈이 부족합니다.");
            return;
        }

        customer.pay(totalCost);
        selectedFishBread.reduceQuantity(quantityToBuy);
        seller.receiveMoney(totalCost);
        for (int i = 0; i < quantityToBuy; i++) {
            // 수정된 부분: 선택한 붕어빵 객체를 새로 생성하여 추가
            customer.getOwnedFishBreads().add(new FishBread(selectedFishBread.getType(), selectedFishBread.getPrice()));
        }

        System.out.println(selectedFishBread.getType() + "을/를 " + quantityToBuy + "개 구매하였습니다.");
        System.out.println("금액: " + totalCost + "원");
        System.out.println("남은 소지금: " + customer.getMoney() + "원");
    }


    private static void printOwnedFishBread(Customer customer) {
        System.out.println("내가 갖고 있는 붕어빵 목록:");
        List<FishBread> ownedFishBreads = customer.getOwnedFishBreads();
        for (FishBread fishBread : ownedFishBreads) {
            System.out.println(fishBread.toDetailedString());
        }
    }

    private static void printAvailableFishBread(FishBreadSeller seller) {
        System.out.println("판매 중인 붕어빵 목록과 가격:");
        List<FishBread> availableFishBreads = seller.getAvailableFishBreads();
        for (FishBread fishBread : availableFishBreads) {
            System.out.println(fishBread);
        }
    }

    private static void printCustomerMoney(Customer customer) {
        System.out.println("나의 소지금: " + customer.getMoney() + "원");
    }

    private static void eatFishBread(Customer customer) {
        System.out.println("먹을 붕어빵을 선택하세요:");
        List<FishBread> ownedFishBreads = customer.getOwnedFishBreads();
        for (int i = 0; i < ownedFishBreads.size(); i++) {
            System.out.println((i + 1) + ". " + ownedFishBreads.get(i).getType());
        }

        int choice = scanner.nextInt();
        if (choice < 1 || choice > ownedFishBreads.size()) {
            System.out.println("잘못된 입력입니다.");
            return;
        }

        FishBread selectedFishBread = ownedFishBreads.get(choice - 1);
        ownedFishBreads.remove(selectedFishBread);

        System.out.println("아이 맛있다~ " + selectedFishBread.getType() + " 맛이네~");
    }

    private static void printSellerMoney(FishBreadSeller seller) {
        System.out.println("분식 장수의 금고에 있는 돈: " + seller.getSalesMoney() + "원");
    }
}
