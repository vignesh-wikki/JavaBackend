/*Create a class Person with:
name (public)
age (protected)
address (default)
salary (private)
Create a subclass Employee in the same package to demonstrate which members are accessible.
Create another class TestAccess in a different package to test accessibility.
 */

package Day5.JavaAccessModifiers.AccessModifier;

public class Person {
    public static String addresss;
    public String name;
    protected int age;
    String address;
    private double salary;

    public Person(String address, int age, String name, double salary) {
        this.address = address;
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.testingModifiers();
    }
}

class Employee extends Person {
    public Employee() {
        super("Chennai", 21, "Vignesh", 400000.00);
    }

    public void testingModifiers() {
        System.out.println("Public access modifier: " + name);
        System.out.println("Protected access modifier: " + age);
        System.out.println("Default access modifier: " + address);
        System.out.println("Private access modifier: " + getSalary());
    }
}
