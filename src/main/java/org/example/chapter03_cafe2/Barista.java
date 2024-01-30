package org.example.chapter03_cafe2;

public class Barista {
    private int baristaMoney = 0;


    public void makeCoffee(String coffeeName, int price, int money) {
        if (money < price){
            System.out.println("돈이 부족합니다.");
            return;
        }
            System.out.println("고객님 께서 주문하신 " + coffeeName + " " + price + "원 되겠습니다. 곧 준비해드리겠습니다");

    }
}
