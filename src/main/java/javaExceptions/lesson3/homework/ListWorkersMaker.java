package javaExceptions.lesson3.homework;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListWorkersMaker {
    List<InputString> listOfWorkers;
//    List<String[]> fullNameList;

    public ListWorkersMaker(int number, Scanner sc) {
        this.listOfWorkers = workersMaker(number, sc);
    }

    /**
     * @apiNote
     * @param num
     * @param sc
     * @return
     */
    public List<InputString> workersMaker(int num, Scanner sc) {
        List<InputString> arrayInputStrings1 = new LinkedList<>();
        while (num > 0) {
            boolean flag = true;
            while (flag) {
                InputString inputString = new InputString("Введите данные через пробел: ФИО, Дата рождения, номер телефона, пол.\n" +
                        "Форматы данных:\n" + "фамилия, имя, отчество - строки\n" +
                        "дата рождения - строка формата dd.mm.yyyy\n" +
                        "номер телефона - целое беззнаковое число без форматирования" +
                        "пол - символ латиницей f или m\n", sc);
                try {
                    flag = inputString.parseInputString();
                } catch (FioException | PhoneException | DateBirthException | SexException e) {
                    e.printStackTrace();
//                    System.out.println("Повторите ввод данных!");
                }
                if (inputString.inputStringAsList.size() == 6)
                arrayInputStrings1.add(inputString);
            }
            num--;
        }
        return arrayInputStrings1;
    }


    @Override
    public String toString() {
        return listOfWorkers.toString();
    }
}