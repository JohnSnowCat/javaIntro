package javaOOP.lesson5.homeWork.MVCStudentApp.Controller.Interfaces;

import java.util.HashMap;
import java.util.List;

import Model.Core.Student;

public interface iGetView {
    void printAllStudent(List<Student> students);

    String prompt(String msg);

    /**
     * @return возвращает словарь из фраз для меню
     */
    public HashMap<String, String> getLanguage();
}