package Day15.AverageGPAFinding;

import Day15.SortAList.Student;
import java.util.List;
import java.util.stream.Collectors;

public class FindAverageGPA {
    public void findGPA(List<Student> data) {
        Double list = data.stream().collect(Collectors.averagingDouble((student -> student.getGPA())));

        System.out.println("The average GPA of all department students is: " + list);
    }
}
