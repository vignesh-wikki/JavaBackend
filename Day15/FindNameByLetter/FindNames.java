package Day15.FindNameByLetter;

import Day15.SortAList.Student;
import java.util.List;
import java.util.stream.Collectors;

public class FindNames {
    public void findNamesByLetter(List<Student> data, char letter) {
        List<Student> student = data.stream()
                .filter((studentobj) -> studentobj.getName().startsWith(String.valueOf(letter)))
                .collect(Collectors.toList());

        student.forEach((result) -> System.out.println(result));
    }

}
