package lesson3.homework.task1;

public class Product {
    private String nameGoods;
    private int price;
    private int classGoods;

    public Product(String nameGoods, int price, int classGoods) {
        this.nameGoods = nameGoods;
        this.price = price;
        this.classGoods = classGoods;
    }

    public Product() {

    }

    @Override
    public String toString() {
        return "Product {" +
                "nameGoods='" + nameGoods + '\'' +
                ", price=" + price +
                ", classGoods=" + classGoods +
                '}';
    }

    public String getNameGoods() {
        return nameGoods;
    }

    public void setNameGoods(String nameGoods) {
        this.nameGoods = nameGoods;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getClassGoods() {
        return classGoods;
    }

    public void setClassGoods(int classGoods) {
        this.classGoods = classGoods;
    }
}
