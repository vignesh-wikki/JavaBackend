package Day17.MethodReferenceConstructor;

@FunctionalInterface
interface StudentFactory {
    Student create(String name, int marks);
}

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class ReferenceConstructor {
    public static void main(String[] args) {
        StudentFactory newStudent = Student::new;
        Student student = newStudent.create("Vignesh", 77);

        System.out.println("Student Marks is: " + student.marks + " ans name is: " + student.name);
    }
}
