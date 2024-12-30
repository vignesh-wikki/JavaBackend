// Write a program to print a pyramid pattern using nested loops.


package Day2.ProgramControl.Loops;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        sc.close();

        for (int i = 1; i <= number; i++) {
            for (int j = number - i; j > 0; j--)
                System.out.print(' ');

            for (int k = 0; k < 2 * i - 1; k++)
                System.out.print('*');

            System.out.println();
        }
    }
}
