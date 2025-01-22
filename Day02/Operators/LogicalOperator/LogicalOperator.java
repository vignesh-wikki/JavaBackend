// Create a program to check if a number is prime using logical operators.


package Day02.Operators.LogicalOperator;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        sc.close();

        // if(number < 1) return;

        boolean isPrime = true;

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0 && number >= 2)
                isPrime = false;
        }

        if(isPrime && number > 1){
            System.out.print(number+" is a Prime number");
        }else{
            System.out.print(number + " is not a Prime number");
        }
    }
}
