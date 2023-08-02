package javaExceptions.lesson3.homework;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputString {
    public String inputStringData;
    List<String> inputStringAsList;
    public String fullName;
    public String[] fullNameArray;
    String dateOfBirth;
    String phoneNumber;
    String sex;

    public InputString(String info, Scanner sc) {
        System.out.println(info);
        this.inputStringData = sc.nextLine();
        inputStringAsList = Arrays.asList(
                inputStringData.trim().replaceAll("\\s{2,}", " ").split(" "));
    }

    /**
     * @return 0 если верно или отрицательное число (код ошибки), если данные введены некорректно
     * @api Проверка введенной строки на корректность данных по количеству.
     */
    public int checkInput() {
        if (inputStringAsList == null)
            return -1;
        if (inputStringAsList.size() < 6)
            return -2;
        if (inputStringAsList.size() > 6)
            return -3;
        return 0;
    }

    public boolean checkInputString() {
        int count = 0;
        for (String s : inputStringAsList) {
            if ((s.length() == 1) && s.equals("m") || s.equals("f")) {
                this.sex = s;
                count++;
            } else if (s.matches("\\d{2}.\\d{2}.\\d{4}")) {
                this.dateOfBirth = s;
                count++;
            } else if (s.matches("[0-9]+")) {
                this.phoneNumber = s;
                count++;
            } else if (s.toLowerCase().matches("[а-яa-z]+")) {
                fullName += fullName;
                count++;
            }
        }
        return (count == 6) ? true : false;
    }

    /**
     * Парсер полученных значений и выделение их в поля класса.
     * @return !true если все прошло успешно, !false или Exception при неверном вводе данных пользователем
     */
    public boolean parseInputString() {
        int countParam = 0;
        for (String s : inputStringAsList) {
            if ((s.length() == 1) && s.equals("m") || s.equals("f")) {
                this.sex = s;
                countParam++;
            } else if (s.matches("\\d{2}.\\d{2}.\\d{4}")) {
                this.dateOfBirth = s;
                countParam++;
            } else if (s.matches("[0-9]+")) {
                this.phoneNumber = s;
                countParam++;
            } else if (s.toLowerCase().matches("[а-яa-z]+")) {
                fullName += fullName;
                countParam++;
            } else {
                System.out.println(s + " -введены неверные данные, повторите ввод");
                countParam++;
            }
        }
        if (countParam == 6 && checkInput() == 0) {
            if (fullName == null) {
                throw new FioException("Данные Фамилии имя и отчества введены некорректно!" +
                        "Требуется 3 параметра, введено: " + Arrays.asList(fullName.split(" ")).size());
            } else if (dateOfBirth == null) {
                throw new DateBirthException(("Данные дня рождения введены некорректно!" +
                        "Требуются данные формата dd.mm.yyyy"));
            } else if (phoneNumber == null) {
                throw new PhoneException("Данные телефонного номера введены некорректно!" +
                        "Требуется строка с целыми беззнаковыми числами");
            } else if (sex == null) {
                throw new SexException("Данные пола введены некорректно!" +
                        "Требуется строка с одним значением (f или m");
            } else {
//                fullNameArray = fullName.split(" "); // делатель ФИО эррэй
                return !true;
            }
        } else if (checkInput() == -1) {
            System.out.println("Данные не введены! Повторите ввод.");
            return !false;
        } else if (checkInput() == -2) {
            System.out.println("Введены неполные данные. Требуется 6, введено " + countParam);
            return !false;
        } else if (checkInput() == -3) {
            System.out.println("Введены избыточные данные. Требуется 6, введено " + countParam);
            return !false;
        }
        return !true;
    }

    @Override
    public String toString() {
        return inputStringData;
    }
}
