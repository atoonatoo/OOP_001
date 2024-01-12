package org.example.chapter02_fishbread_version3;


import java.util.ArrayList;
import java.util.List;

public class Fishbread {
    private String type;
    private int price;
    private int quantity;


   static Fishbread redbean = new Fishbread("팥붕어빵", 1000, 10);
   static Fishbread cream = new Fishbread("크림붕어빵", 1500, 10);
   static Fishbread hot = new Fishbread("매운붕어빵", 2000, 10);

    public Fishbread(String type, int price, int quantity){
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    public Fishbread(){

    }
    public int getPrice() {
        return this.price;
    }


    public int getQuantity(){
        return this.quantity;

    }
    public String getType(){
        return this.type;
    }

    public void addQuantity(int mount){
      this.quantity += mount;
    }

    public void reduceQuantity(int mount){
        this.quantity -= mount;
    }



}
