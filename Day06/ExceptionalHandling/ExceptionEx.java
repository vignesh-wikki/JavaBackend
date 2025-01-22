/*Write a program that:
Accepts two integers from the user as input.
Attempts to divide the first integer by the second.
Implements exception handling to manage the following scenarios:
Division by zero: Display an error message "Error: Division by zero is not allowed.".
Invalid input: Display an error message "Error: Please enter valid integers.".
Any other exceptions: Display "An unexpected error occurred.".
 */

package Day06.ExceptionalHandling;

import java.util.Scanner;

public class ExceptionEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter the number: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        } finally {
            sc.close();
            System.out.println("Completed");
        }
    }

}
