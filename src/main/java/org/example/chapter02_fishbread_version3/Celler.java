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

    public List<Fishbread> amount(Vault vault, Customer customer, int revenue){
      int totalRevenue = revenue += vault.getSaveMoney();
       salesMoney = totalRevenue;
       System.out.println("매출액 : " + salesMoney + "원");
       return null;
    }


}
