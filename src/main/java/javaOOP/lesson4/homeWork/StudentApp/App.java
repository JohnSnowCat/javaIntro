package javaOOP.lesson4.homeWork.StudentApp;

import javaOOP.lesson4.homeWork.StudentApp.Controllers.AccountController;
import javaOOP.lesson4.homeWork.StudentApp.Domen.PersonComparator;
import javaOOP.lesson4.homeWork.StudentApp.Domen.Student;
import javaOOP.lesson4.homeWork.StudentApp.Domen.StudentGroup;
import javaOOP.lesson4.homeWork.StudentApp.Domen.Teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  23);

        List<Student> listStud = new ArrayList<>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);


        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        System.out.println(group4580);

        for(Student std : group4580)
        {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        Collections.sort(group4580.getGroup());

        for(Student std: group4580.getGroup())
        {
            System.out.println(std);
        }

        Teacher t1 = new Teacher("Галина", 55, "Docent");
        Teacher t2 = new Teacher("Татьяна", 57, "Docent");
        Teacher t3 = new Teacher("Олег", 36, "Professor");

        System.out.println(new PersonComparator<Student>().compare(s1, s3));

        // AccountController controller = new AccountController();
        // controller.paySalary(t1, 50000);
        // controller.paySalary(s1, 50000);

        AccountController.paySalary(t1, 50000);

        System.out.println(AccountController.averageAge(listStud));

        List<Teacher> teacherList1= new ArrayList<Teacher>();
        teacherList1.add(t1);
        teacherList1.add(t2);
        teacherList1.add(t3);
        System.out.println(AccountController.averageAge(teacherList1));


    }
}