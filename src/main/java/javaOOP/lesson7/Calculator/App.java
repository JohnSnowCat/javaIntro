package javaOOP.lesson7.Calculator;

import java.util.Scanner;

import javaOOP.lesson7.Calculator.models.operations.ComCal;
import javaOOP.lesson7.Calculator.models.operations.ComplexNumbers;
import javaOOP.lesson7.Calculator.models.interfaces.ICalculator;
import javaOOP.lesson7.Calculator.logger.FL;
import javaOOP.lesson7.Calculator.logger.Log;

public class App {
    public static void main(String[] args) throws Exception {

        Log log = new FL("log.txt");
        ICalculator cal = new ComCal(log);
        Scanner iScanner = new Scanner(System.in);

        System.out.println("Введите действительную часть:");
        double material = iScanner.nextDouble();
        System.out.println("Введите мнимую часть:");
        double imaginary1 = iScanner.nextDouble();
        ComplexNumbers n1 = new ComplexNumbers(material, imaginary1);

        System.out.print("Введите действие (+,*,/): ");
        char oper = iScanner.next().charAt(0);

        // Просим пользователя ввести второе комплексное число
        System.out.println("Введите действительную часть:");
        double material2 = iScanner.nextDouble();
        System.out.println("Введите мнимую часть:");
        double imaginary2 = iScanner.nextDouble();
        ComplexNumbers n2 = new ComplexNumbers(material2, imaginary2);

        switch (oper) {
            case '+':
                ComplexNumbers sum = cal.add(n1, n2);
                System.out.println("Сумма: " + sum);
                break;
            case '*':
                ComplexNumbers prod = cal.multiply(n1, n2);
                System.out.println("Произведение: " + prod);
                break;
            case '/':
                ComplexNumbers quot = cal.divide(n1, n2);
                System.out.println("Частное: " + quot);
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
        iScanner.close();

    }

}
