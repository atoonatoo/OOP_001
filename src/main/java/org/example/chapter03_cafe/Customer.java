package org.example.chapter03_cafe;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerName = "제임스";


    private int money = 10000;
    private Barista barista;

    public Customer(Barista barista) {
        this.barista = barista;
    }

    public Customer() {

    }

    public int getMoney() {
        return money;
    }

    //메뉴판 보기
    public void orderCoffee(CoffeeMenu coffeeMenu) {
        coffeeMenu.menuChoose();
    }

    //바리스타에게 주문하기
    public void orderCoffeeFromBarista(String orderCoffeeName, int orderCoffeePrice) {
        barista.makeCoffee(orderCoffeeName, orderCoffeePrice, money);
        money -= orderCoffeePrice;
    }


    public void coffeeChecker() {
        List<String> orderCoffees = barista.getCoffees();
        System.out.println("주문한 커피 목록:");
        for (String coffee : orderCoffees) {
            System.out.println(coffee);
        }
    }
}
