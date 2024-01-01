package org.example.chapter02_fishbread;

public class Fishbread {

    private String fishbreadName;
    private int price;
    private int quantity;

    public Fishbread(String fishbreadName, int price) {
        this.fishbreadName = fishbreadName;
        this.price = price;
        this.quantity = 0;
    }

    public Fishbread() {

    }

    public String getFishbreadName() {
        return this.fishbreadName;
    }

    public int getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void increaseQuantity(int quentity) {
        this.quantity += quentity;
    }

    public void decreaseQuantity(int quantity) {
        this.quantity -= quantity;
    }

    public void increaseRevenue(int price) {
        this.price += price;
    }


}
