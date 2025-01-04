package Day1.Arithmethic;
// Write a program that takes two integers from the user and performs all arithmetic operations, printing each result.

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the num2: ");
        int num2 = sc.nextInt();
        sc.close();

        System.out.println("Addition of " + num1 + " and " + num2 + " number is :" + (num1 + num2));
        System.out.println("Substarction of " + num1 + " and " + num2 + " number is :" + (num1 - num2));
        System.out.println("Multiplication of " + num1 + " and " + num2 + " number is :" + (num1 * num2));
        System.out.println("Division of " + num1 + " and " + +num2 + " number is :" + (num1 / num2));
        System.out.println("Modulas of " + num1 + " and " + num2 + " number is :" + (num1 % num2));

    }
}
