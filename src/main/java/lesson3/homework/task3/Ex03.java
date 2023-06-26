package lesson3.homework.task3;

import java.util.ArrayList;

/**
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц,
 * фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
public class Ex03 {
    public static void main(String[] args) {
        ArrayList<Books> books = createList();
        System.out.println(searcher(books));
    }

    /**
     * @param input Входящий список книг
     * @return Возвращает список наименований книг согласно условию:
     * количество страниц - простое число,
     * фамилия автора содержит «А»,
     * год издания после 2010 г, включительно
     */
    static ArrayList<String> searcher(ArrayList<Books> input) {
        ArrayList<String> list = new ArrayList<>();
        for (Books s : input) {
            if (s.getLastNameOfAuthor().toLowerCase().contains("а") && s.getPublicationDate() >= 2010 &&
                    isSimpleNumber(s.getNumberOfPage())) {
                list.add(s.getName());
            }
        }
        return list;
    }

    /**
     * @param num Входящее число
     * @return "true" если число простое
     * @apiNote Проверка числа на простое число
     */
    static boolean isSimpleNumber(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * @return Список книг
     * @apiNote Создает исходный список книг
     */
    public static ArrayList<Books> createList() {
        Books pr1 = new Books("Грокаем алгоритмы", "Бхаргава", 1000, 2022, 288);
        Books pr2 = new Books("5 навыков высокоэффективных людей", "Кови", 2000, 1999, 350);
        Books pr3 = new Books("Я и твоя мама", "Брэнниган", 2000, 2015, 233);
        Books pr4 = new Books("Прорыв", "Васильев", 5000, 2020, 244);
        Books pr5 = new Books("Пульс", "Клыков", 3000, 2015, 133);
        Books pr6 = new Books("Вишня", "Агаров", 3000, 2012, 101);
        ArrayList<Books> listOfGoods = new ArrayList<>();
        listOfGoods.add(pr1);
        listOfGoods.add(pr2);
        listOfGoods.add(pr3);
        listOfGoods.add(pr4);
        listOfGoods.add(pr5);
        listOfGoods.add(pr6);
        return listOfGoods;
    }
}
