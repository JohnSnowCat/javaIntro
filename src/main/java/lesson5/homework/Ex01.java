package lesson5.homework;

import java.util.*;

/**
 * 1) Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом),
 * вносить все слова не нужно
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 * Запрос: Россия
 * Ответ: Россия - 2
 * toLoverCase().
 * (Усложнение - игнорировать пунктуацию)
 */

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи исходный текст: ");
        String input = sc.nextLine();
        System.out.println("Введи поисковую фразу: ");
        String searchPhrase = sc.nextLine();
        System.out.println(searchPhrase + " - " + matchSearch(searchPhrase, input));
    }

    /**
     * @param phrase      Искомое слово
     * @param inputString Исходный текст для поиска количества вхождений искомого слова
     * @return Количество вхождений искомого слова в исходном тексте
     */
    static Integer matchSearch(String phrase, String inputString) {
        Map<String, Integer> result = new HashMap<>();
        result.put(phrase, 0);
        ArrayList<String> splitString = new ArrayList<>(List.of(inputString.toLowerCase().
                split("\\s*(\\s|\\.|,|-|!|\\?)\\s*")));
        for (String s : splitString) {
            if (s.equals(phrase.toLowerCase())) {
                result.put(phrase, result.get(phrase) + 1);
            }
        }
        return result.get(phrase);
    }
}