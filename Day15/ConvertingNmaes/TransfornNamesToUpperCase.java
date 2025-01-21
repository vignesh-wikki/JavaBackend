package Day15.ConvertingNmaes;

import Day15.SortAList.Student;
import java.util.List;
import java.util.stream.Collectors;

public class TransfornNamesToUpperCase {
    public void contvertToUpperCase(List<Student> data) {
        List<Student> list = data.stream().map(student -> {
            student.setName(student.getName().toUpperCase());
            return student;
        }).collect(Collectors.toList());

        list.forEach((datas) -> System.out.println(datas));

    }
}