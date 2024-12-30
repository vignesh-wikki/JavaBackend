// Create a program to simulate a simple calculator using switch-case.

package Day2.ProgramControl.DecisionMaking;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the number2: ");
        int number2 = sc.nextInt();
        while (true) {
            System.out.println("1.Addition");
            System.out.println("2.Subration");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Modulas");
            System.out.println("6.Exit");
            int operation = sc.nextInt();
            switch (operation) {
                case 1:
                    System.out.println("1.Addition: " + (number1 + number2));
                    break;
                case 2:
                    System.out.println("2.Subration: " + (number1 - number2));
                    break;
                case 3:
                    System.out.println("3.Multiplication: " + (number1 * number2));
                    break;
                case 4:
                    System.out.println("4.Division: " + (number1 / number2));
                    break;
                case 5:
                    System.out.println("5.Modulas: " + (number1 + number2));
                    break;
                case 6:
                    System.out.println("6.Exited");

                    System.exit(0);
                    break;

                default:
                    sc.close();
                    break;
            }
        }

    }
}
