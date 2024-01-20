package org.example.chapter03_cafe;

import org.example.chapter03_cafe.coffeeInfomation.Coffee;
import org.example.chapter03_cafe.coffeeInfomation.CustomerMoney;

import java.util.List;

public class Customer {
    private String customerName = "제임스";

    Barista barista = new Barista();
    Coffee coffee = new Coffee();
    CustomerMoney customerMoney = new CustomerMoney();

    public Customer() {}

    //메뉴판 보기
    public void orderCoffee(CoffeeMenu coffeeMenu) {coffeeMenu.menuChoose();}

    //바리스타에게 주문하기
    public void orderCoffeeFromBarista(String orderCoffeeName, int orderCoffeePrice) {
        if (orderCoffeePrice > customerMoney.getMoney()) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        customerMoney.pay(orderCoffeePrice);
        barista.makeCoffee(orderCoffeeName, orderCoffeePrice);
    }


    public void coffeeChecker() {
        List<String> orderCoffees = coffee.coffeeName();
        System.out.println("주문한 커피 목록:");
        for (String coffee : orderCoffees) {
            System.out.println(coffee);
        }
    }
}
