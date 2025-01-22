package Day17.MethodReferenceConstructor;

import java.util.List;

class Student1 {
    String name;
    int marks;

    public Student1(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void displayStudentDetails() {
        System.out.println("Student name is: " + name + " and mark is: " + marks);
    }

}

public class StudentFactory1 {
    public static void main(String[] args) {
        List<Student1> list = List.of(new Student1("Vignesh", 77), new Student1("Shivan", 87),
                new Student1("Wikki", 97),
                new Student1("Tharun", 67), new Student1("Prasanth", 57));

        list.forEach(Student1::displayStudentDetails);
    }
}
