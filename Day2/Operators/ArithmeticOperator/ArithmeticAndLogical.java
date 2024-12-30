// Write a program to find the factorial of a number using loops and arithmetic operators.

package Day2.Operators.ArithmeticOperator;

import java.util.Scanner;

public class ArithmeticAndLogical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        sc.close();
        int factorial = 1;

        for (int i = 2; i <= number; i++)
            factorial *= i;

        System.out.print(factorial); 

        
    }
}
