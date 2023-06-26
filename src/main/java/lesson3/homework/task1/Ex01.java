package lesson3.homework.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2-го сорта среди товаров, название которых содержит «высший».
 */
public class Ex01 {
    public static void main(String[] args) {
        List<Product> productList = createArrayList();
        System.out.println("Наш список товаров:\n" + productList);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите искомый товар: ");
        String searchName = scanner.nextLine();
        System.out.println("Наибольшая цена по запросу: " + "\"" + searchName + "\" " +
                searchHighestPriceGoods(productList, searchName));
    }

    /**
     * @param input Коллекция товаров для поиска
     * @param key   Поисковая фраза
     * @return Самая высокая цена искомых товаров
     * @apiNote Находит наибольшую цену товаров 1го или 2-го сорта среди товаров,
     * название которых содержит поисковую фразу
     */
    public static int searchHighestPriceGoods(List<Product> input, String key) {

        int higherPrice = 0;
        for (int i = 0; i < input.size(); i++) {
            if (input.get(i).getNameGoods().toLowerCase().contains(key) &&
                    input.get(i).getClassGoods() > 0 && input.get(i).getClassGoods() < 3) {
                if (input.get(i).getPrice() > higherPrice)
                    higherPrice = input.get(i).getPrice();
            }
        }
        System.out.println(higherPrice);
        return higherPrice;
    }

    /**
     * @return Возвращает коллекцию товаров
     */
    public static List<Product> createArrayList() {
        List<Product> pList = new ArrayList<>();
        Product prod1 = new Product("Водка Высший валЯ", 2200, 1);
        Product prod2 = new Product("Клубника наивысшиЙ сорт", 500, 1);
        Product prod3 = new Product();
        prod3.setNameGoods("Минералка");
        prod3.setPrice(100);
        prod3.setClassGoods(2);
        Product prod4 = new Product("Квас высший класс", 200, 1);
        Product prod5 = new Product("Высший кайф", 3500, 3);
        pList.add(prod1);
        pList.add(prod2);
        pList.add(prod3);
        pList.add(prod4);
        pList.add(prod5);
        return pList;
    }
}