package javaOOP.lesson1.homework08.Domen;

public class Bottle extends Product {

    private double BottleVolume;

    public Bottle(String name, double price, double bottleVolume) {
        super(name, price);
        this.BottleVolume = bottleVolume;
    }

    public double getBottleVolume() {
        return this.BottleVolume;
    }

    public void setBottleVolume(float bottleVolume) {
        this.BottleVolume = bottleVolume;
    }

    @Override
    public String toString() {
        return super.toString() + " BottleVolume=" + this.BottleVolume;
    }
}
