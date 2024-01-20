package org.example.chapter03_cafe2;

import org.example.chapter03_cafe.coffeeInfomation.CoffeeInfomation;
import org.example.chapter03_cafe2.CoffeeMenu.CoffeeList;

import java.util.List;

public class Customer {
    private String CustomerName;
    private int CustomerMoney;

    public int getCustomerMoney() {
        return CustomerMoney;
    }

    public Customer(String customerName, int customerMoney) {
        CustomerName = customerName;
        CustomerMoney = customerMoney;
    }

    public Customer() {
    }

    CoffeeMenuBoard coffeeMenuBoard = new CoffeeMenuBoard();
    Barista barista = new Barista();

    public void orderCoffee(int choice) {
        coffeeMenuBoard.menuBoard();

        List<String> coffeeInfomations = barista.makingCoffee(choice, CustomerMoney);
    }


}
