package javaExceptions.lesson2.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
необходимо повторно запросить у пользователя ввод данных.
 */
public class Ex01 {
        public static void main(String[] args) {
        float answer = input();
        System.out.println("Введенное число: " + answer);
    }

    private static float input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дробное число типа float: ");
        while (true) {
            String inputLine = sc.nextLine();
            char[] charElem = inputLine.toCharArray();
            boolean flag = false;
            for (int i = 0; i < charElem.length; i++) {
                if (charElem[i] >= '0' && charElem[i] <= '9')
                    flag = true;
                else if (charElem[i] == '.' && inputLine.matches("[0-9]"))
                    flag = true;
                else
                    flag = false;
            }
            if (flag == true) {
                sc.close();
                return Float.parseFloat(String.valueOf(charElem));
            }
            else
                System.out.println("Введите дробное число типа float: ");
        }
    }

// variation № 2
//        public static void main(String[] args) {
//            float userInput = getFloatInput("Введите дробное число: ");
//            System.out.println("Введенное число: " + userInput);
//
//        }
//
//        public static float getFloatInput(String prompt) {
//            Scanner scanner = new Scanner(System.in);
//            float value;
//            while (true) {
//                System.out.print(prompt);
//                if (scanner.hasNextFloat()) {
//                    value = scanner.nextFloat();
//                    break;
//                } else {
//                    System.out.println("Ошибка: Введите дробное число.");
//                    scanner.nextLine();
//                }
//            }
//            scanner.close();
//            return value;
//        }
//    }

// variation № 3
//    public static void main(String[] args) {
//        float userInput = getFloatInput("Введите дробное число: ");
//        System.out.println("Введенное число: " + userInput);
//    }
//
//    public static float getFloatInput(String prompt) {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        float value;
//        while (true) {
//            System.out.print(prompt);
//            try {
//                value = Float.parseFloat(reader.readLine());
//                break;
//            } catch (IOException | NumberFormatException e) {
//                System.out.println("Ошибка: Введите дробное число.");
//            }
//        }
//        return value;
//    }
}

