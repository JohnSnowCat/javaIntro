package lesson2.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import static java.lang.Math.sqrt;

/**
 * @apiNote Дана последовательность N целых чисел. Найти сумму простых чисел.
 */
public class Ex01 {

    public static void main(String[] args) throws IOException {
        System.out.println("Введи размер последовательности: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Сумма простых чисел в введенной последовательности = " +
                getInputSequence(Integer.parseInt(reader.readLine()), reader));
    }

    public static int getInputSequence(int sizeOfSequence, BufferedReader in) throws IOException {
        System.out.println("Введи число последовательности: ");
        int sum = 0;
        for (int i = 0; i < sizeOfSequence; i++) {
            int firstNumber = Integer.parseInt(in.readLine());
            if (isSimpleNumber(firstNumber))
                sum += firstNumber;
        }
        return sum;
    }

    public static boolean isSimpleNumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}