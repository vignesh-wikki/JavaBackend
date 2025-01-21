package Day15.ConvertingNmaes;

import Day15.SortAList.Student;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TransfornNamesToUpperCase {
    public void contvertToUpperCase(List<Student> data) {
        Function<Student, Student> f1 = (student) -> {
            student.setName(student.getName().toUpperCase());
            return student;
        };

        List<Student> list = data.stream().map(f1).collect(Collectors.toList());

        list.forEach((datas) -> System.out.println(datas));

    }
}