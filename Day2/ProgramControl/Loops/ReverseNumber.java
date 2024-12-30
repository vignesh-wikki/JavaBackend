// Create a program to reverse a given number.

package Day2.ProgramControl.Loops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        sc.close();

        int temp = 0;
        while (number > 0) {
            temp = temp * 10 + number % 10;
            number /= 10;

        }

        System.err.print("Reversed number: " + temp);
    }
}
