package Day14.Debugging;

import java.util.Scanner;

public class DebuggingExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] marks = new int[numStudents];
        int totalMarks = 0;

        // Collect marks
        System.out.println("Enter marks for " + numStudents + " students:");

        // by debugging we get the user put 5 but loop runs 6 because we initializes (i <= numStudents) instead of (i < numStudents)
        // ArrayOutOfBoundException also arising
        // breask point at line 23
        /*
         * for (int i = 0; i <= numStudents; i++) {
         * System.out.print("Student " + (i + 1) + ": ");
         * marks[i] = scanner.nextInt();
         * totalMarks += marks[i];
         * }
         */

        // Corrected code, = removed
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        // Calculate average
        double averageMarks = totalMarks / numStudents;

        // Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        scanner.close();
    }
}
