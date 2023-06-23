package lesson2.homework;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        int[] numbers = {1, 22, 33, 44, 5, -5, -3, 23, -7};
        int replacementNumber = findSumOfIndexTwoDigitNumber(numbers);
        System.out.println(Arrays.toString(changeArray(numbers, replacementNumber)));
    }

    /**
     * @param inputArray Исходный массив
     * @param newValue   Заменяемое число = сумме индексов отрицательных элементов исходного массива
     * @return Измененный массив
     * @apiNote Дан массив целых чисел.
     * Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
     * <p>Пример:
     * Массив = {1, 22, 33, 44, 5, -5, -3, 23, -7}
     * Сумма индексов двузначных элементов массива = 1+2+3+7 = 13 </p>
     * Массив после замены отрицательных на сумму = {1, 22, 33, 44, 5, 13, 13, 23, 13}
     */
    public static int[] changeArray(int[] inputArray, int newValue) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < 0) {
                inputArray[i] = newValue;
            }
        }
        return inputArray;
    }

    /**
     * @param array Исходный массив
     * @return Сумму индексов отрицательных элементов массива
     */
    public static int findSumOfIndexTwoDigitNumber(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isTwoDigit(array[i]))
                sum += i;
        }
        return sum;
    }

    /**
     * @param num Элемент массива
     * @return Результат проверки на двухзначность
     * @apiNote Проверка элементов массива на двухзначность
     */
    public static boolean isTwoDigit(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        if (count == 2)
            return true;
        return false;
    }
}
