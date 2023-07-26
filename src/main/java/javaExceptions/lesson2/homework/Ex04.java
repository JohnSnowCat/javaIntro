package javaExceptions.lesson2.homework;

import java.util.Scanner;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Ex04 {
    public static void main(String[] args) {
        try {
            String str = getString();
            System.out.println(str);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String getString() {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        if (str1.isEmpty()) {
            throw new RuntimeException("Строка не должна быть пустой! Введите значение заново!");
        } else return str1;
    }
}
