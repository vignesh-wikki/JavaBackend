// Create a program to find the count of 1s in the binary representation of a number.

package Day02.Operators.BitwiseOperator;

import java.util.Scanner;

public class BinaryRepresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        sc.close();

        if (number == 0)
            return;

        int count = 0;

        while (number > 0) {
            if (number % 2 != 0)
                count++;
            
            number /= 2;    
        }

        System.out.println(count);
    }

}
