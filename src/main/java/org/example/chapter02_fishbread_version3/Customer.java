package org.example.chapter02_fishbread_version3;

import java.util.List;
import java.util.Scanner;

public class Customer {
   Scanner sc = new Scanner(System.in);
   private int money = 10000;
   Celler celler = new Celler();


public void order(){
   int orderQuantity;
   System.out.println("1. 팥붕어빵 | 2. 크림붕어빵 | 3. 매운붕어빵");
   int choice = sc.nextInt();
   System.out.println("몇개를 구매하시겠습니까?");
   switch (choice) {
      case 1:
         orderQuantity = sc.nextInt();
         orderDetail(Fishbread.redbean, orderQuantity);
         break;
      case 2:
         orderQuantity = sc.nextInt();
         orderDetail(Fishbread.cream, orderQuantity);
         break;
      case 3:
         orderQuantity = sc.nextInt();
         orderDetail(Fishbread.hot, orderQuantity);
         break;
      default:
         System.out.println("잘못된 선택입니다.");
         break;
   }
}

   private void orderDetail (Fishbread fishbread, int orderQuantity){
      int totalMoney = orderQuantity * fishbread.getPrice();
      if(totalMoney > money){
         System.out.println("돈이 없어요 !");
         return;
      }
      money -= totalMoney;
      Vault.amount(totalMoney);
      List<Fishbread> fishbreads = celler.makeFishBread(orderQuantity);

      System.out.println("아이 맛있다 ~ " + fishbread.getType() + "맛이네 ~" + "판매 남은 수량" +"보류"+ "개");
   }
}
