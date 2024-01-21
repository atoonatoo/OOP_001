package org.example.chapter03_cafe2;


import java.util.ArrayList;

public class Customer {

    private String customerName;
    private int money;
    private ArrayList<Coffee> coffees = new ArrayList<>();

    public String getCustomerName() {
        return customerName;
    }

    public int getMoney() {
        return money;
    }

    public Customer(String customerName, int money) {
        this.customerName = customerName;
        this.money = money;
    }

    public Customer() {
    }
}
