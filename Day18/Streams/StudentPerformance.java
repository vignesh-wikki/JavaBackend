package Day18.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Student {
    private String name;
    private List<Integer> marks;
    private char grade;
    private String department;

    public String getName() {
        return name;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public char getGrade() {
        return grade;
    }

    public String getDepartment() {
        return department;
    }

    public Student(String name, List<Integer> marks, String department) {
        this.name = name;
        this.marks = marks;
        this.department = department;
    }

    public int avgerageMarks() {
        return marks.stream().mapToInt(Integer::intValue).sum();
    }

    public void setGrade() {
        int average = avgerageMarks();
        if (average >= 450)
            grade = 'A';
        else if (average < 449 && average >= 400)
            grade = 'B';
        else if (average < 399 && average >= 350)
            grade = 'C';
        else if (average < 349 && average >= 250)
            grade = 'D';
        else
            grade = 'F';
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", marks=" + marks + ", department=" + department + "]";
    }

}

public class StudentPerformance {
    public static void main(String[] args) {

        // computer Science department
        Student csStudent1 = new Student("Vignesh", new ArrayList<>(Arrays.asList(77, 78, 79, 76, 75)),
                "Computer Science");
        Student csStudent2 = new Student("Shivan", new ArrayList<>(Arrays.asList(97, 96, 99, 76, 85)),
                "Computer Science");
        Student csStudent3 = new Student("Wikki", new ArrayList<>(Arrays.asList(45, 35, 67, 76, 55)),
                "Computer Science");

        // Mathmatics department
        Student mtStudent1 = new Student("Vicky", new ArrayList<>(Arrays.asList(76, 75, 74, 73, 72)), "Mathematics");
        Student mtStudent2 = new Student("Raj", new ArrayList<>(Arrays.asList(91, 92, 94, 73, 89)), "Mathematics");
        Student mtStudent3 = new Student("Vishnu", new ArrayList<>(Arrays.asList(35, 45, 57, 36, 25)), "Mathematics");

        // Physics department
        Student phStudent1 = new Student("Suresh", new ArrayList<>(Arrays.asList(97, 98, 99, 76, 85)), "Physics");
        Student phStudent2 = new Student("Sasi", new ArrayList<>(Arrays.asList(87, 76, 69, 76, 85)), "Physics");
        Student phStudent3 = new Student("Mahesh", new ArrayList<>(Arrays.asList(25, 45, 37, 36, 55)), "Physics");

        List<Student> data = Arrays.asList(csStudent1, csStudent2, csStudent3, mtStudent1, mtStudent2, mtStudent3,
                phStudent1, phStudent2, phStudent3);

        // Finding the top 3 students
        System.out.println("Finding the top 3 students");
        List<Student> top3 = data.stream()
                .sorted((s1, s2) -> Integer.compare(s2.avgerageMarks(), s1.avgerageMarks())).limit(3)
                .collect(Collectors.toList());

        top3.forEach((student) -> {
            System.out.println(student);
            System.out.println("Average mark is: " + student.avgerageMarks());
        });
        System.out.println("---------------------------");
        System.out.println();
        System.out.println();

        // Assign a grade (A, B, C, D) to each student based on their average marks.
        System.out.println("Assign a grade (A, B, C, D) to each student based on their average marks.");
        Function<Student, Student> f1 = (s) -> {
            s.setGrade();
            return s;
        };
        List<Student> setGrades = data.stream().map((s) -> f1.apply(s)).collect(Collectors.toList());
        setGrades.forEach((student) -> {
            System.out.println(student);
            System.out.println("Average mark is: " + student.avgerageMarks());
            System.out.println(student.getName() + " Grade is: " + student.getGrade());
        });
        System.out.println("---------------------------");
        System.out.println();
        System.out.println();

        // Find the average marks for each department.
        System.out.println("Find the average marks for each department");
        Map<String, Double> averageMarks = data.stream().collect(
                Collectors.groupingBy(Student::getDepartment, Collectors.averagingInt(Student::avgerageMarks)));
        System.out.println(averageMarks);
        System.out.println("---------------------------");
        System.out.println();
        System.out.println();

        // Identify the top student in each department.
        System.out.println("Identify the top student in each department.");
        Comparator<Student> c = (s1, s2) -> Integer.compare(s1.avgerageMarks(), s2.avgerageMarks());
        Map<String, Optional<Student>> topStudent = data.stream()
                .collect(Collectors.groupingBy(Student::getDepartment, Collectors.maxBy(c)));
        System.out.println(topStudent);
        System.out.println("---------------------------");
        System.out.println();
        System.out.println();

        // Count how many students failed in each department (average marks < 50).
        Predicate<Student> p1 = (stud) -> {
            return stud.avgerageMarks() <= 249;
        };

        Map<String, Long> failedsStudentCount = data.stream().map((s) -> f1.apply(s))
                .collect(
                        Collectors.groupingBy(Student::getDepartment, Collectors.filtering(p1, Collectors.counting())));

        System.out.println(failedsStudentCount);
        System.out.println("---------------------------");
        System.out.println();
        System.out.println();
    }
}


