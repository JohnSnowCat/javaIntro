package javaOOP.lesson5.homeWork.MVCStudentApp.Model;

import java.util.List;

import javaOOP.lesson5.homeWork.MVCStudentApp.Controller.Interfaces.iGetModel;
import javaOOP.lesson5.homeWork.MVCStudentApp.Model.Core.Student;

public class ModelClassList implements iGetModel {

    private List<Student> students;

    public ModelClassList(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
    @Override
    public void removeStudent(int index) {
        this.students.remove(index);
    }
}