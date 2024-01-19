package org.example.chapter03_cafe;

public class Barista {
    Customer customer = new Customer();


    public void makeCoffee(String orderCoffeeName, int orderCoffeePrice) {
        System.out.println("바리스타 : 고객님 께서 주문하신 [" + orderCoffeeName + "] [" + orderCoffeePrice + "]원 되겠습니다. 곧 준비해드리겠습니다");

    }
}
