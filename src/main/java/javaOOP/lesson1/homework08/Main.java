package javaOOP.lesson1.homework08;

import javaOOP.lesson1.homework08.Domen.Bottle;
import javaOOP.lesson1.homework08.Domen.HotDrink;
import javaOOP.lesson1.homework08.Domen.Product;
import javaOOP.lesson1.homework08.Services.CoinDispenser;
import javaOOP.lesson1.homework08.Services.Holder;
import javaOOP.lesson1.homework08.Services.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> assort = new ArrayList<Product>();

        Product item1 = new Product("Lays", 100);
        Product item2 = new Product("Cola", 50);
        Product item3 = new Bottle("MineralWater", 35, 1);
        Product item4 = new HotDrink("Nescafe", 155.50, 75);

        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        assort.add(item4);

        Holder hold1 = new Holder(10, 10);
        CoinDispenser disp = new CoinDispenser(120);

        VendingMachine vendingMachine = new VendingMachine(hold1, disp, assort);

        for (Product prod : vendingMachine.getProductList()) {
            System.out.println(prod);
        }

    }
}
