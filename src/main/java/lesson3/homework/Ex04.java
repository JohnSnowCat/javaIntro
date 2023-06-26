package lesson3.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
 */
public class Ex04 {
    public static void main(String[] args) {
        ArrayList<Integer> newList = fillList();
        System.out.println(newList);
        System.out.printf("Минимальное значение: %d\n" +
                "Максимальное значение: %d\n" +
                "Среднее значение: %d\n", Collections.min(newList), Collections.max(newList), findAverage(newList));
    }

    /**
     * @return Заполненный список
     * @apiNote Заполняет список указанного размера случайными числами
     */
    static ArrayList<Integer> fillList() {
        System.out.println("Введите размер списка: ");
        Scanner sc = new Scanner((System.in));
        Random rn = new Random();
        int sizeOfList = sc.nextInt();
        ArrayList<Integer> sourceList = new ArrayList<>();
        for (int i = 0; i < sizeOfList; i++) {
            sourceList.add(rn.nextInt(0, 10));
        }
        return sourceList;
    }

    /**
     * @param input Входящий список
     * @return Среднее значение элемента из списка
     * @apiNote находит средний по значению элемент списка (не среднее арифметическое!)
     */
    static int findAverage(ArrayList<Integer> input) {
        ArrayList<Integer> temp = new ArrayList<>(input.size());
        int average = (Collections.max(input) + Collections.min(input)) / 2;
        for (int i = 0; i < input.size(); i++) {
            temp.add(average - input.get(i));
        }
        System.out.println(temp);
        return input.get(temp.indexOf(findClosestNumberByZero(temp)));
    }

    /**
     * Находит элемент списка со значением ближайшим к 0
     *
     * @param sequence преобразованный исходный список с разницей между исходным значением и среднимарифметическим min + max
     * @return ближайщее число к 0
     */
    public static int findClosestNumberByZero(ArrayList<Integer> sequence) {
        int minDistance = Integer.MAX_VALUE;
        int closestNumber = -1;

        for (int number : sequence) {
            int distance = Math.abs(number);
            if (distance < minDistance) {
                minDistance = distance;
                closestNumber = number;
            }
        }
        return closestNumber;
    }
}

