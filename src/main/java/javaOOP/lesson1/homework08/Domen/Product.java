package javaOOP.lesson1.homework08.Domen;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        if (price > 0) {
            this.price = price;
        }
        else {
            this.price = 10;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product: " + "name= '" + name + "' price=" + price;
    }
}
