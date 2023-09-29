package javaOOP.lesson7.Calculator.logger;

import java.io.*;

public class FL implements Log{
    private String FN;

    /**
     * @param FN имя файла записи
     */
    public FL(String FN) {
        this.FN = FN;
    }

    /**
     * @param message
     */
    @Override
    public void log(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FN, true))) {
            writer.write("[FileLogger] " + message);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}