package org.example.chapter02_fishbread_version3;

import java.util.List;

public class Customer {
   private int money = 10000;
   Fishbread fishbread = new Fishbread();
   public void order (int quantity, Fishbread fishbread, Celler celler){
      int totalMoney = quantity * fishbread.getPrice();
      if(totalMoney > money){
         System.out.println("돈이 없어요 !");
         return;
      }
      money -= totalMoney;
      List<Fishbread> fishbreads = Celler.makeFishBread();
      System.out.println();
   }
}
