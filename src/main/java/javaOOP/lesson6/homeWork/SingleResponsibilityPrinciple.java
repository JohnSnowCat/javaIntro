/*Базовое задние:
1) Переписать код в соответствии с Single Responsibility Principle: */

public class Employee {
 private String name;
 private Date dob;

 public Employee(String name, Date dob, int baseSalary) {
   this.name = name;
   this.dob = dob;
   this.baseSalary = baseSalary;
 }

 public String getEmpInfo() {
   return "name - " + name + " , dob - " + dob.toString();
 }
}

public class Salary {
 private int baseSalary;

 public Salary(int baseSalary) {
   this.baseSalary = baseSalary;
 }

 public int calculateNetSalary() {
   int tax = (int) (baseSalary * 0.25);//calculate in otherway
   return baseSalary - tax;
 }
}

// Подсказка: вынесите метод calculateNetSalary() в отдельный класс