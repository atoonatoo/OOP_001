package org.example.chapter03_cafe2;

import org.example.chapter02_fishbread_version3.Fishbread;
import org.example.chapter03_cafe.coffeeInfomation.*;
import org.example.chapter03_cafe2.CoffeeMenu.CoffeeList;

import java.util.ArrayList;
import java.util.List;

public class Barista {
    private String Americano;
    private String Cappuccino;
    private String Macchiatto;
    private String Espresso;

    public String getAmericano() {
        return Americano;
    }

    public String getCappuccino() {
        return Cappuccino;
    }

    public String getMacchiatto() {
        return Macchiatto;
    }

    public String getEspresso() {
        return Espresso;
    }

    public List<String> makingCoffee(int choice, int customerMoney) {
        List<String> coffeeLists = new ArrayList<>();
        switch (choice) {
            case 1:
                coffeeLists.add(Americano);
                break;
            case 2:
                coffeeLists.add(Cappuccino);
                break;
            case 3:
                coffeeLists.add(Macchiatto);
                break;
            case 4:
                coffeeLists.add(Espresso);
                break;
            default:
        }


        return coffeeLists;
    }
}
