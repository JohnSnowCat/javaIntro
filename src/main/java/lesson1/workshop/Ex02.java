package lesson1.workshop;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int num1 = sc.nextInt();

        for (int i = 1; i < n; i++) {
            int num2 = sc.nextInt();

            if (isNumberPositive(num1, num2)) {
                count++;
            }
            num1 = num2;
        }

        System.out.println("count = " + count);
    }

    /**
     * @apiNote Checks if number is valid.
     * @param a previous number.
     * @param b next number.
     * @return is previous number less than 0 and next number
     * is greater or equal 0
     */
    public static boolean isNumberPositive(int a, int b) {
        return a >= 0 && b < 0;
    }
}

/**
 * Дана последовательность N целых чисел. Найти количество положительных чисел,
 * после которых следует отрицательное число.
 */