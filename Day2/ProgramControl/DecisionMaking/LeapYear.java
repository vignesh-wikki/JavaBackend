// Write a program to determine if a given year is a leap year.

package Day2.ProgramControl.DecisionMaking;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        sc.close();

        if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0))
            System.out.println(year + " is a Leap year");
        else
            System.out.println(year + " is not a Leap year");
    }
}
