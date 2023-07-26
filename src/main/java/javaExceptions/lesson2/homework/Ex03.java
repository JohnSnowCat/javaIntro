package javaExceptions.lesson2.homework;

public class Ex03 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (ArithmeticException ex) {
            System.out.println("Делить на ноль нельзя!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) { //изначально поменял на NullPointerException ex,
        // но подумав убрал,т.к. полагаю сигнатура данного метода + IDE не даст запуститься printSum(23, 234) без аргументов
        System.out.println(a + b);
    }

}
