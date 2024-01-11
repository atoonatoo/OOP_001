package org.example.chapter02_fishbread_version2;

public class FishBread {
    private String type;
    private int price;
    private int quantity;

    public FishBread(String type, int price) {
        this.type = type;
        this.price = price;
        this.quantity = 0;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int amount) {
        this.quantity += amount;
    }

    public void reduceQuantity(int amount) {
        this.quantity -= amount;
        if (this.quantity < 0) {
            this.quantity = 0;
        }
    }

    public boolean isAvailable() {
        return quantity > 0;
    }

    @Override
    public String toString() {
        return type + " - 가격: " + price + "원";
    }

    public String toDetailedString() {
        return type + " - 가격: " + price + "원, 수량: " + quantity + "개";
    }
}
