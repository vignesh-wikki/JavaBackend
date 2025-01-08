package Day10.MapExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentManagementSystem {
    Map<String, Integer> studentStore = new HashMap<>();

    public void addStudentNameAndGrade(String name, int grade) {
        if (studentStore.containsKey(name))
            studentStore.replace(name, studentStore.get(name), grade);
        else
            studentStore.put(name, grade);
        System.out.println("Grade Added");
    }

    public int getGradeByName(String name) {
        if (studentStore.isEmpty())
            System.out.println("Student store is Empty!");
        return studentStore.get(name);
    }

    public void display() {
        System.out.println("All students and grades: ");
        System.out.println(studentStore.toString());
    }

    public static void main(String[] args) {
        StudentManagementSystem obj = new StudentManagementSystem();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 to Add name : ");
            System.out.println("Enter 2 to Update Grade: ");
            System.out.println("Enter 3 to Retrive name: ");
            System.out.println("Enter 4 to display: ");
            System.out.println("Enter 5 to exit: ");

            int selection = sc.nextInt();
            sc.nextLine();
            switch (selection) {
                case 1 -> {
                    System.out.println("Enter the name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter the grade: ");
                    int grade = sc.nextInt();
                    obj.addStudentNameAndGrade(name, grade);
                }
                case 2 -> {
                    System.out.println("Enter the name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter the grade: ");
                    int grade = sc.nextInt();
                    obj.addStudentNameAndGrade(name, grade);
                }
                case 3 -> {
                    System.out.println("Enter the name: ");
                    String name = sc.nextLine();
                    System.out.println("Retrieve: " + obj.getGradeByName(name));
                }
                case 4 -> obj.display();
                case 5 -> {
                    System.out.println("The exited.. ");
                    sc.close();
                    System.exit(0);
                }
            }

        }
    }

}
