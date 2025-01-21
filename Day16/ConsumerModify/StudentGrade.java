package Day16.ConsumerModify;

import Day16.Student;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StudentGrade {

    public void modifyGrade(List<Student> data, Consumer<Student> consumer) {
        data.forEach((student) -> consumer.accept(student));
    }

    public static void main(String[] args) {
        Student student1 = new Student("John", 70);
        Student student2 = new Student("Alice", 60);
        List<Student> list = Arrays.asList(student1, student2);
        Consumer<Student> p1 = (student) -> student.grade += 10;

        StudentGrade obj1 = new StudentGrade();
        obj1.modifyGrade(list, p1);

        list.forEach((students) -> System.err.println(students));

    }
}
