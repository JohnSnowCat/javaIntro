package javaOOP.lesson4.homeWork.StudentApp.Services;

import javaOOP.lesson4.homeWork.StudentApp.Domen.Employee;
import javaOOP.lesson4.homeWork.StudentApp.Domen.PersonComparator;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements iPersonService<Employee> {

    private int count;
    private List<Employee> employees;

    public EmployeeService() {
        this.employees = new ArrayList<>();
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void create(String name, int age) {
        Employee epls = new Employee(name, age, "basic");
        count++;
        employees.add(epls);
    }

    public void sortByFIO()
    {
        PersonComparator<Employee> persComp = new PersonComparator<Employee>();
        employees.sort(persComp);
    }
}
