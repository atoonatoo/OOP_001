package org.example.chapter03_cafe2;



public class Coffee {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Coffee() {
    }

    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }


}
