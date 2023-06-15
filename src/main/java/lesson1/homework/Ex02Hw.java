package lesson1.homework;

import java.util.Scanner;

/**
 * @apiNote Дана последовательность целых чисел, оканчивающаяся нулем.
 * Найти сумму положительных чисел, после которых следует отрицательное число.
 * Пример ввода:
 * 1 2 1 2 -1 1 3 1 3 -1 0
 * Логика расчета:
 * 2 -1 переход -> 2 в сумму
 * 3 -1 переход -> 3 в сумму
 * Пример вывода: 5
 */
public class Ex02Hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the sequence of numbers: ");

        int numPrevious = sc.nextInt();

        for (int numNext = sc.nextInt(); numNext != 0; numNext = sc.nextInt()) {

            if (isNumberPositive(numPrevious, numNext)) {
                sum += numPrevious;
            }
            numPrevious = numNext;
        }

        System.out.println("sum = " + sum);
    }

    /**
     * @param a previous number.
     * @param b next number.
     * @return is previous number less than 0 and next number is greater 0.
     * @apiNote Checks if number is valid.
     */
    public static boolean isNumberPositive(int a, int b) {
        return a > 0 && b < 0;
    }
}