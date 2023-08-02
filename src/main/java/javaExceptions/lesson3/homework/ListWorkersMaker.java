package javaExceptions.lesson3.homework;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListWorkersMaker {
    List<InputString> listOfWorkers;

    ListWorkersMaker(int number, Scanner sc) {
        this.listOfWorkers = workersMaker(number, sc);
    }
    /**
     * @param num Количество создаваемых работников
     * @param sc  Scanner для ввода данных
     * @return Список работников (List<InputString>)
     * @apiNote Создает список(List) работников типа <InputString> (ФИО, День рождение, телефон, пол)
     */
    public List<InputString> workersMaker(int num, Scanner sc) {
        List<InputString> listInputStrings = new LinkedList<>();
        while (num > 0) {
            boolean flag = true;
            while (flag) {
                InputString inputString = new InputString("Введите данные через пробел:" +
                        " ФИО, Дата рождения, номер телефона, пол.\n" +
                        "Форматы данных:\n" + "фамилия, имя, отчество - строки\n" +
                        "дата рождения - строка формата dd.mm.yyyy\n" +
                        "номер телефона - целое беззнаковое число без форматирования" +
                        "пол - символ латиницей f или m\n", sc);
                try {
                    flag = inputString.parseInputString();
                } catch (FioException | PhoneException | DateBirthException | SexException e) {
                    e.printStackTrace();
                }
                if (inputString.inputStringAsList.size() == 6 && inputString.checkInputString()) //ToDo нужна проверка на отсутствие исключений
                    listInputStrings.add(inputString);
            }
            num--;
        }
        return listInputStrings;
    }

    @Override
    public String toString() {
        return listOfWorkers.toString();
    }
}