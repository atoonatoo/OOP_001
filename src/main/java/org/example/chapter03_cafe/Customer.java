package org.example.chapter03_cafe;

import org.example.chapter03_cafe.coffeeInfomation.CoffeeInfomation;

import java.util.List;

public class Customer {
    private String customerName = "제임스";

    private int customerMoney = 10000;

    Barista barista = new Barista();

    public int getCustomerMoney() {
        return customerMoney;
    }

    public Customer() {
    }

    public Customer(String customerName, int customerMoney) {
        this.customerName = customerName;
        this.customerMoney = customerMoney;
    }

    //메뉴판 보기
    public void orderCoffee(CoffeeMenu coffeeMenu) {
        coffeeMenu.menuChoose();
    }

    //바리스타에게 주문하기
    public void orderCoffeeFromBarista(String orderCoffeeName, int orderCoffeePrice) {
        System.out.println(orderCoffeeName + orderCoffeePrice);
        if (orderCoffeePrice > customerMoney) {
            System.out.println("금액 부족");
            return;
        }
        pay(orderCoffeePrice);
    }

    private void pay(int orderCoffeePrice) {
        customerMoney -= orderCoffeePrice;

    }

    public void remainingMoney() {
        System.out.println("내 소지금 : " + customerMoney + " 원");
    }
}
