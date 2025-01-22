/*Write a program with a base class Employee that has a method calculateSalary().
Derive two classes Manager and Developer, and override the calculateSalary() method in both to display different salaries. */

package Day03.Polymorphism.RunTimePolymorphism;

public class Employee {

    public void calculateSalary(int monthSalary, int workedMonths) {
        System.out.println("Employee salary is: " + monthSalary * workedMonths);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee manager = new Manager();
        Employee developer = new Developer();

        employee.calculateSalary(40000, 10);
        manager.calculateSalary(100000, 9);
        developer.calculateSalary(60000, 12);
    }

}

class Manager extends Employee {

    public void calculateSalary(int monthSalary, int workedMonths) {
        System.out.println("Manager salary is: " + monthSalary * workedMonths);
    }

}

class Developer extends Employee {

    public void calculateSalary(int monthSalary, int workedMonths) {
        System.out.println("Developer salary is: " + monthSalary * workedMonths);
    }

}
