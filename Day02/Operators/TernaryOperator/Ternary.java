// Write a program to find the largest of three numbers using the ternary operator.

package Day02.Operators.TernaryOperator;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the number2: ");
        int number2 = sc.nextInt();
        System.out.print("Enter the number3: ");
        int number3 = sc.nextInt();
        sc.close();

        System.out.print((number1 > number2) ? (number1 > number3 ? number1 : number3): (number2 > number3 ? number2 : number3));
    }
}
