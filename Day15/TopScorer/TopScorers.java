package Day15.TopScorer;

import Day15.SortAList.Student;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TopScorers {
   public void findTopScorer(List<Student> data) {

      Map<String, Optional<Student>> topScorers = data.stream()
            .collect(Collectors.groupingBy(student -> student.getDepartment(),
                  Collectors.maxBy((s1, s2) -> Double.compare(s1.getTotalMark(), s2.getTotalMark()))));

      topScorers.forEach((department, student) -> {
         System.out.println("Department: " + department + ", Top Scorer: " + student);
      });
   }
}
