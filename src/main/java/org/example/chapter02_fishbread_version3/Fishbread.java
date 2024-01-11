package org.example.chapter02_fishbread_version3;

public class Fishbread {
    private String type;
    private int price;
    private int quantity;

    Fishbread readbean = new Fishbread("readbean", 1000);
    Fishbread cream = new Fishbread("cream", 1500);
    Fishbread hot = new Fishbread("hot", 2000);

    public Fishbread(String type, int price){
        this.type = type;
        this.price = price;
        this.quantity = 10;
    }

    public Fishbread(){

    }
    public int getPrice (){
        this.price = price;
        return getPrice();
    }


}
