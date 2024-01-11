package org.example.chapter02_fishbread_version2;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int money;
    private List<FishBread> ownedFishBreads;

    public Customer(int initialMoney) {
        this.money = initialMoney;
        this.ownedFishBreads = new ArrayList<>();
    }

    public int getMoney() {
        return money;
    }

    public List<FishBread> getOwnedFishBreads() {
        return ownedFishBreads;
    }

    public void pay(int amount) {
        if (amount > money) {
            System.out.println("돈이 부족합니다.");
        } else {
            money -= amount;
        }
    }

    public void eatFishBread(FishBread fishBread) {
        if (fishBread.isAvailable()) {
            ownedFishBreads.add(fishBread);
            fishBread.reduceQuantity(1);
            System.out.println("아이 맛있다~ " + fishBread.getType() + " 맛이네~");
        } else {
            System.out.println("해당 붕어빵이 품절되었습니다.");
        }
    }
}
