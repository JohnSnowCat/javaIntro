package lesson5.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
 * Отсортировать по убыванию популярности.
 */
public class Ex02 {
    public static void main(String[] args) {
        ArrayList<String> employers = new ArrayList<>();
        employers.add("Иван Иванов");
        employers.add("Светлана Петрова");
        employers.add("Светлана Петрова");
        employers.add("Светлана Петрова");
        employers.add("Анна Мусина");
        employers.add("Анна Крутова");
        employers.add("Иван Иванов");
        employers.add("Анна Мусина");
        employers.add("Иван Иванов");
        employers.add("Иван Иванов");
        employers.add("Василий Петров");
        employers.add("Анна Мусина");
        employers.add("Степан Степнов");
        employers.add("Степан Степнов");

        System.out.println(employers);
        System.out.println(sortValues(searchRepeats(employers)));
    }

    /**
     * @param workers Список сотрудников
     * @return Map с ключем в виде сотрудника и значением в виде количества повторений в исходном списке
     */
    public static Map searchRepeats(List<String> workers) {
        Map<String, Integer> sourceMap = new HashMap<>();
        Map desiredMap = new HashMap();
        for (String worker : workers) {
            sourceMap.put(worker, sourceMap.getOrDefault(worker, 0) + 1);
        }
        for (Map.Entry<String, Integer> in : sourceMap.entrySet()) {
            if (in.getValue() >= 2)
                desiredMap.put(in.getKey(), in.getValue());
        }
        return desiredMap;
    }

    /**
     * @param unsortedMap Несортированная Map
     * @return Список ключ+значение отсортированный по убыванию
     */
    public static List<Map.Entry<String, Integer>> sortValues(Map unsortedMap) {
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(unsortedMap.entrySet());
        entryList.sort(Map.Entry.<String, Integer>comparingByValue().reversed());
        return entryList;
    }
}