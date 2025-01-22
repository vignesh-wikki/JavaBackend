/*Create a class Person with attributes name and age. Derive a class Student that adds rollNumber and marks. 
Write methods to display both Person and Student details.
 */

package Day03.Inheritance.BasicInheritance;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Student newStudent = new Student("Vignesh", 21, 54, 70.77);
        newStudent.display();
    }

}

class Student extends Person {
    private int rollNumber;
    private double marks;

    Student(String name, int age, int rollNumber, double marks) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void display() {
        super.display();
        System.out.println(rollNumber + " " + marks);
    }
}
