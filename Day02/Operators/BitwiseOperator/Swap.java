// Write a program to swap two numbers without using a third variable(use XOR).

package Day02.Operators.BitwiseOperator;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number2: ");
        int num2 = sc.nextInt();
        sc.close();
        System.out.println("Before Swaping: " + num1 + " " + num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("After Swaping: " + num1 + " " + num2);
    }
}
