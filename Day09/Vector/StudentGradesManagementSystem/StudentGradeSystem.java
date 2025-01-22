package Day09.Vector.StudentGradesManagementSystem;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class StudentGradeSystem {

    Vector<Integer> grades = new Vector<>();

    public void addGrade(int grade) {
        grades.add(grade);
        System.out.println("Grade Added");
    }

    public int highestGrade() {
        if (grades.isEmpty())
            System.out.println("Grades Empty!");
        return Collections.max(grades);
    }

    public int lowestGrade() {
        if (grades.isEmpty())
            System.out.println("Grades Empty!");
        return Collections.min(grades);
    }

    public int averageGrade() {
        if (grades.isEmpty())
            System.out.println("Grades Empty!");
        int average = 0;
        for (Integer grade : grades) {
            average += grade;
        }
        return average / grades.size();
    }

    public String removeAtIndex(int index) {
        if (grades.size() < index)
            return "Worng index";
        grades.remove(index);
        return "Removed...";
    }

    public void display() {

        System.out.println("Grades: " + grades.toString());
    }

    public static void main(String[] args) {
        StudentGradeSystem obj = new StudentGradeSystem();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 to Add Grade: ");
            System.out.println("Enter 2 to Get Highest Grade: ");
            System.out.println("Enter 3 to Get Lowest Grade: ");
            System.out.println("Enter 4 to Get Average Grade: ");
            System.out.println("Enter 5 to Display Grades: ");
            System.out.println("Enter 6 to Exit: ");

            int selection = sc.nextInt();
            switch (selection) {
                case 1 -> {
                    System.out.print("Enter the Grade: ");
                    int value = sc.nextInt();
                    obj.addGrade(value);
                }
                case 2 -> System.out.println("The Highest Grade is: " + obj.highestGrade());
                case 3 -> System.out.println("The Lowest Grade is: " + obj.lowestGrade());
                case 4 -> System.out.println("The Average Grade is: " + obj.averageGrade());
                case 5 -> obj.display();
                case 6 -> {
                    System.out.println("The exited.. ");
                    sc.close();
                    System.exit(0);
                }
            }

        }
    }

}
