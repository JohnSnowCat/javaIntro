package javaExceptions.lesson3.homework;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество нанимаемых работников: ");
        int numberOfWorkers;
        while (true) {
            if (sc.hasNextInt()) {
                numberOfWorkers = sc.nextInt();
                sc.nextLine();
                break;
            } else {
                System.out.println("Ошибка: Введите целое число!");
                sc.next();
            }
        }

        ListWorkersMaker listWorkersMaker = new ListWorkersMaker(numberOfWorkers, sc);
        for (int i = 0; i < listWorkersMaker.listOfWorkers.size(); i++) {
            String[] fullNameArray = listWorkersMaker.listOfWorkers.get(i).toString().split(" ");

            try (FileWriter writer = new FileWriter(fullNameArray[0] + ".txt", true)) {
                writer.write(listWorkersMaker.listOfWorkers.get(i).toString() + "\n");
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

