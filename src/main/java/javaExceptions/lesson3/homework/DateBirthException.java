package javaExceptions.lesson3.homework;

public class DateBirthException extends IllegalArgumentException {
    public DateBirthException(String s) {
        super(s);
    }
}
