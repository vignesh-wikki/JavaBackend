// Create a
// class Employee
// with attributes id,name,
// and salary.
// Use the this
// keyword to
// resolve naming
// conflicts between
// local variables
// and instance variables.

package Day2.ThisAndOverloading;

public class Employee {
    public int id;
    public String name;
    public int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, "Vignesh", 500000);
        System.out.println(emp.id + " " + emp.name + " " + emp.salary);
    }

}
