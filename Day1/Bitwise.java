// Implement a program that shifts an integer left and right by 2 positions and prints the result.
// Use the ^ operator to demonstrate XOR functionality between two integers.

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the num2: ");
        int num2 = sc.nextInt();
        sc.close();

        int result = num1 << num2;
        System.out.println("Left shift : "+result);

        result = num1 >> num2;
        System.out.println("Right shift : " + result);

        result = num1 >>> num2;
        System.out.println("Zero fill Right shift : " + result);

        result = num1 ^ num2;
        System.out.println("Xor : " + result);

        result = num1 & num2;
        System.out.println("And : " + result);

        result = num1 | num2;
        System.out.println("Or : " + result);

        

    }
}
