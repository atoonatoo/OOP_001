package org.example.chapter02_fishbread_version3;

public class Vault {
    private static int saveMoney = 0;
    Fishbread fishbread = new Fishbread();
    Customer customer = new Customer();

    public static void amount(int money) {
       saveMoney += money;
    }

    public void showAmount(){
        System.out.println("총매출액 : " + saveMoney + "원" );
    }

    public int getSaveMoney() {
        return this.saveMoney = saveMoney;
    }
}

