package javaOOP.lesson1.homework08.Services;

import javaOOP.lesson1.homework08.Domen.Product;

import java.util.List;
public class VendingMachine {
    private Holder holder;
    private CoinDispenser dispenser;
    private List<Product> productList;

    public VendingMachine(Holder holder, CoinDispenser dispenser, List<Product> productList) {
        this.holder = holder;
        this.dispenser = dispenser;
        this.productList = productList;
    }

    public Product buyProduct(int index) {
        return productList.get(index);
    }
    public void release() {

    }

    public List<Product> getProductList() {
        return productList;
    }
}
