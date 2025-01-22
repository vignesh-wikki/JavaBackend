package Day05.JavaAccessModifiers.AnotherPackage;

import Day05.JavaAccessModifiers.AccessModifier.Person;

public class TestAccess {
    public static void main(String[] args) {
        Person person = new Person("Bangalore", 21, "Vignesh", 800000.00);
        System.out.println("Public access modifier: " + person.name);
        // System.out.println("Protected access modifier: " + person.age);
        // System.out.println("Default access modifier: " + person.address);
        // System.out.println("Private access modifier: " + person.salary);
        System.out.println("Private access modifier: " + person.getSalary());
    }

}
