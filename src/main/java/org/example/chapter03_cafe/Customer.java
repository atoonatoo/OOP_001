package org.example.chapter03_cafe;

import org.example.chapter03_cafe.coffeeInfomation.CoffeeInfomation;

import java.util.List;

public class Customer {
    private String customerName;

    private int customerMoney;

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
        barista.makeCoffee(orderCoffeeName, orderCoffeePrice);

        customerMoney -= orderCoffeePrice;
    }

    public void remainingMoney() {
        System.out.println("내 소지금 : " + customerMoney + " 원");
    }
}
