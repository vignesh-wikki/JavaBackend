/*Write a Java program that takes two numbers as input from the user and divides the first number by the second. Handle the following exceptions:
ArithmeticException: If the second number is zero, display an error message: "Division by zero is not allowed."
InputMismatchException: If the user enters non-numeric input, display an error message: "Invalid input. Please enter numeric values."
General Exception: For any other unexpected errors, display a generic error message: "An error occurred: [error message]."
 */

package Day7.ExceptionExample;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }

}

public class MyExceptionExanmple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the number: ");
            int num2 = sc.nextInt();

            if (num2 == 0)
                throw new MyException("Division by zero is not allowed.");

            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (MyException e) {
            System.err.println(e);
        } catch (InputMismatchException e) {
            System.err.println("nvalid input. Please enter numeric values.");
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Completed");
        }
    }

}
