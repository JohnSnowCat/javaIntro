package javaExceptions.lesson3.homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество нанимаемых работников: ");
        int numberOfWorkers = sc.nextInt();
        sc.nextLine();

        ListWorkersMaker listWorkersMaker = new ListWorkersMaker(numberOfWorkers, sc);
        System.out.println(listWorkersMaker);
//        boolean flag = true;
//        while (flag) {
//            InputString inputString = new InputString("Введите данные через пробел: ФИО, Дата рождения, номер телефона, пол.\n" +
//                    "Форматы данных:\n" + "фамилия, имя, отчество - строки\n" +
//                    "дата рождения - строка формата dd.mm.yyyy\n" +
//                    "номер телефона - целое беззнаковое число без форматирования" +
//                    "пол - символ латиницей f или m\n");
//            try {
//                flag = inputString.parseInputString();
//            } catch (FioException | PhoneException | DateBirthException | SexException e) {
//               e.printStackTrace();
//                System.out.println("Повторите ввод данных!");
//            }
//        }

        System.out.println(listWorkersMaker.listOfWorkers.get(0));
        for (int i = 0; i < listWorkersMaker.listOfWorkers.size(); i++) {
            String[] fullNameArray = listWorkersMaker.listOfWorkers.get(i).toString().split(" ");

            try (FileWriter writer = new FileWriter(fullNameArray[0] + ".txt", true)) {
                writer.write(listWorkersMaker.listOfWorkers.get(i).toString() + "\n");
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

//            String firstName = (listWorkersMaker.listOfWorkers.get(i).fullNameArray[0]);
//            System.out.println(firstName);

    }

//        try (FileWriter fileWriter = new FileWriter());

}

