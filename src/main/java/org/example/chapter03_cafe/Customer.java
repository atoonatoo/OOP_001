package org.example.chapter03_cafe;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerName = "제임스";


    private int money = 10000;
    Barista barista = new Barista();
    private final List<Barista> baristas = new ArrayList<>(); // coffees 리스트 초기화



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
        System.out.println("주문한 커피 목록:");
        for (Barista bs : baristas) {
            System.out.println(bs.getCoffee());
        }
    }
}