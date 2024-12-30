// Create a program to exit a loop if the user enters the number 0 (use break).

package Day2.ProgramControl.JumpStatements;

import java.util.Scanner;

public class usingExit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int exitValue = sc.nextInt();

            if (exitValue == 0)
                break;
        }
        sc.close();
    }
}
