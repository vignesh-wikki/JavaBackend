// Write a program that reads an integer and prints "Even" if it is even, or "Odd" if it is odd, using a ternary operator.

import java.util.Scanner;


public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        sc.close();
        
        System.out.println(number % 2 ==0 ? "Even" : " Odd");

        
    }
}
