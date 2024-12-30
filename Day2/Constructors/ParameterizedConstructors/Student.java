// Create a
// class Student
// with attributes
// like name
// and age.
// Initialize these
// attributes using
// a parameterized constructor.

package Day2.Constructors.ParameterizedConstructors;

public class Student {
    private String studentName;
    private int age;

    public Student(String studentName, int age) {
        this.studentName = studentName;
        this.age = age;
    }

    public static void main(String[] args) {
        Student newStudent = new Student("Vignesh", 21);

        System.out.println(newStudent.studentName);
        System.out.println(newStudent.age);
    }
}
