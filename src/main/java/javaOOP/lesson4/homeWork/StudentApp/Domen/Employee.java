package javaOOP.lesson4.homeWork.StudentApp.Domen;

public class Employee extends Person {
    private String special;
    public Employee(String firstName, int age, String special) {
        super(firstName, age);
        this.special = special;
    }
}
