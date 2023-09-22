package javaOOP.lesson5.homeWork.MVCStudentApp;
import java.util.ArrayList;
import java.util.List;

import javaOOP.lesson5.homeWork.MVCStudentApp.Controller.ControllerClass;
import javaOOP.lesson5.homeWork.MVCStudentApp.Controller.Interfaces.iGetModel;
import javaOOP.lesson5.homeWork.MVCStudentApp.Controller.Interfaces.iGetView;
import javaOOP.lesson5.homeWork.MVCStudentApp.Model.ModelClassFile;
import javaOOP.lesson5.homeWork.MVCStudentApp.Model.ModelClassHash;
import javaOOP.lesson5.homeWork.MVCStudentApp.Model.ModelClassList;
import javaOOP.lesson5.homeWork.MVCStudentApp.Model.Core.Student;
import javaOOP.lesson5.homeWork.MVCStudentApp.View.ViewClass;
import javaOOP.lesson5.homeWork.MVCStudentApp.View.ViewClassEng;

public class App {
    public static void main(String[] args) throws Exception {

        List<Student> studentsRus = new ArrayList<>();
        Student s1 = new Student("Сергей", 21);
        Student s2 = new Student("Андрей", 25);
        Student s3 = new Student("Иван", 23);
        Student s4 = new Student("Дарья", 24);
        Student s5 = new Student("Света", 22);
        Student s6 = new Student("Игорь", 21);
        Student s7 = new Student("Мария", 21);
        studentsRus.add(s1);
        studentsRus.add(s2);
        studentsRus.add(s3);
        studentsRus.add(s4);
        studentsRus.add(s5);
        studentsRus.add(s6);
        studentsRus.add(s7);

        List<Student> studentsEng = new ArrayList<>();
        Student s11 = new Student("Bob", 21);
        Student s12 = new Student("Dyllan", 25);
        Student s13 = new Student("Homer", 23);

        studentsEng.add(s11);
        studentsEng.add(s12);
        studentsEng.add(s13);

        ModelClassFile fModel = new ModelClassFile("StudentDB.csv");
        // fModel.saveAllStudentToFile(students);

        // ModelClassList modelList = new ModelClassList(students);
        // ViewClass view = new ViewClass();

        iGetModel modelListRus = new ModelClassHash(studentsRus);
        iGetModel modelListEng = new ModelClassList(studentsEng);
        // iGetModel modelFile = new ModelClassFile("StudentDB.csv");
        // ModelClassFile mFile = (ModelClassFile) modelFile;
        // mFile.saveAllStudentToFile(students);

        List<iGetView> view = new ArrayList<>();
        iGetView viewRus = new ViewClass();
        iGetView viewEng = new ViewClassEng();
        view.add(viewRus);
        view.add(viewEng);

        ControllerClass controller = new ControllerClass(view);
        controller.add(modelListRus);
        controller.add(modelListEng);

        controller.run();

    }
}
