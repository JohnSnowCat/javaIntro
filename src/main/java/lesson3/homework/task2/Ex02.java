package lesson3.homework.task2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class Ex02 {
    public static void main(String[] args) {
        ArrayList<Products> bill = createList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите искомый сорт товаров: ");
        int sort = scanner.nextInt();
        System.out.println(findCheapestProducts(bill, sort));
    }

    public static ArrayList<String> findCheapestProducts(ArrayList<Products> input, int sort) {
        ArrayList<String> productsName = new ArrayList<>();
        int lowPrice = input.get(0).getPrice();

        for (int i = 0; i < input.size(); i++) {
            if (input.get(i).getPrice() < lowPrice) {
                lowPrice = input.get(i).getPrice();
            }
        }

        for (Products pr : input) {
            if (pr.getPrice() == lowPrice && pr.getSort() == sort) productsName.add(pr.getName());
        }
        return productsName;
    }

    /**
     * Создаем коллекцию товаров
     *
     * @return Новый список товаров с описанием
     */
    public static ArrayList<Products> createList() {
        Products pr1 = new Products("Bananas", "Brazil", 1000, 200, 1);
        Products pr2 = new Products("Oranges", "Egypt", 1000, 50, 2);
        Products pr3 = new Products("Apples", "Spanish", 2000, 150, 1);
        Products pr4 = new Products("Cucumber", "India", 5000, 50, 2);
        Products pr5 = new Products("Potatoes", "Egypt", 10000, 50, 1);
        Products pr6 = new Products("Cherry", "Egypt", 3000, 50, 2);
        ArrayList<Products> listOfGoods = new ArrayList<>();
        listOfGoods.add(pr1);
        listOfGoods.add(pr2);
        listOfGoods.add(pr3);
        listOfGoods.add(pr4);
        listOfGoods.add(pr5);
        listOfGoods.add(pr6);
        return listOfGoods;
    }
}

