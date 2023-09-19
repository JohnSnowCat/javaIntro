package javaOOP.lesson4.homeWork.StudentApp.Services;

import java.util.ArrayList;
import java.util.List;

import javaOOP.lesson4.homeWork.StudentApp.Domen.PersonComparator;
import javaOOP.lesson4.homeWork.StudentApp.Domen.Teacher;

/**
 * Включает в себя методы создания, сортировки и вывода учителей.
 */

public class TeacherService implements iPersonService<Teacher> {
    /**
     * кол-во учителей
     */
    private int count;
    /**
     * список учителей
     */
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    /**
     * Сортировка по фамилии
     */
    public void sortByFIO()
    {
        PersonComparator<Teacher> persComp = new PersonComparator<Teacher>();
        teachers.sort(persComp);
    }

    /**
     * Выводит отсортированный список учителей
     */
    public void print() {
        sortByFIO();
        for (Teacher teacher : this.teachers) {
            System.out.println(teacher);
        }
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, int age) {
        Teacher teach = new Teacher(firstName, age, "teacher");
        count++;
        teachers.add(teach);
    }
}
