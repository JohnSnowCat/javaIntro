package lesson2.homework;

import java.util.Scanner;

/**
 * @apiNote Дана последовательность из N целых чисел.
 * Верно ли, что последовательность является возрастающей.
 */
public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfSequence;
        while (true) {
            System.out.println("Введи размер последовательности больше 2-х чисел: ");
            sizeOfSequence = sc.nextInt();
            if (sizeOfSequence >= 2)
                break;
        }

        System.out.println("Введи первое число: ");
        int firstNum = sc.nextInt();
        boolean flag = true;

        for (int i = 1; i < sizeOfSequence; i++) {
            System.out.println("Введи следующее число: ");
            int nextNum = sc.nextInt();
            if (firstNum >= nextNum)
                flag = false;
            firstNum = nextNum;
        }
        if (flag)
            System.out.println("Последовательность возрастающая");
        else
            System.out.println("Последовательность не возрастающая");
    }
}
