package org.example.chapter03_cafe;

public class Customer {
    private String customerName = "제임스";
    private int money = 10000;
    Barista barista = new Barista();

    public Customer(String customerName, int money) {
        this.customerName = customerName;
        this.money = money;
    }

    public Customer() {

    }

    public void orderCoffee(CoffeeMenu coffeeMenu, CoffeeType coffeeType) {
        coffeeMenu.menuChoose();
    }


    public String orderCoffeeFromBarista(String orderCoffeeName, int orderCoffeePrice) {
        if (orderCoffeePrice > money){
            System.out.println(orderCoffeeName + " : 소지금이 적어 주문할 수 없어");
            return orderCoffeeName;
        }
        money -= orderCoffeePrice;
        barista.makeCoffee(orderCoffeeName, orderCoffeePrice);
        return orderCoffeeName;
    }
}
