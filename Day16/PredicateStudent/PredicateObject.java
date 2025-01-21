package Day16.PredicateStudent;

import Day16.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateObject {

    List<Student> result;

    public PredicateObject() {
        result = new ArrayList<>();
    }

    public List<Student> filterByLetter(List<Student> list, Predicate<Student> predicate) {
        list.forEach((data) -> {
            if (predicate.test(data))
                result.add(data);
        });

        return result;
    }

    public static void main(String[] args) {
        Student student1 = new Student("John", 75);
        Student student2 = new Student("Alice", 55);
        Student student3 = new Student("Mark", 88);

        List<Student> list = Arrays.asList(student1, student2, student3);
        Predicate<Student> p1 = (student) -> student.grade > 60;

        PredicateObject obj = new PredicateObject();
        System.out.println(obj.filterByLetter(list, p1));
    }
}
