package org.example.chapter02_fishbread_version3;

import java.util.List;
import java.util.Scanner;

public class Customer {
   Scanner sc = new Scanner(System.in);
   private int money = 10000;
   Fishbread fishbread = new Fishbread();
   Celler celler = new Celler();


   public void order (Fishbread fishbread, int orderQuantity){
      int totalMoney = orderQuantity * fishbread.getPrice();
      if(totalMoney > money){
         System.out.println("돈이 없어요 !");
         return;
      }
      money -= totalMoney;
      List<Fishbread> fishbreads = celler.makeFishBread(orderQuantity);
      System.out.println("아이 맛있다 ~ " + fishbread.getType() + "맛이네 ~" + "판매 남은 수량" + "개");
   }
}
