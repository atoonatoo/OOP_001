package org.example.chapter02_fishbread_version3;

import java.util.List;

public class Celler {
    private int salesMoney;
    Fishbread fishbread = new Fishbread();
    Vault vault = new Vault();
    public Celler(){

    }

    public List<Fishbread> makeFishBread(int orderQuantity) {
        fishbread.reduceQuantity(orderQuantity);

        return null;
    }







}
