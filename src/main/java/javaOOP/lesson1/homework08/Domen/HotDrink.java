package javaOOP.lesson1.homework08.Domen;

public class HotDrink extends Product {
    private int temperature;

    public HotDrink(String name, double price, int temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return this.temperature;
    }

    @Override
    public String toString() {
        return super.toString() + " temperature=" + temperature;

    }
}
