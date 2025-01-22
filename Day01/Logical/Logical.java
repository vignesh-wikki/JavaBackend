package Day01.Logical;
// Create a program that reads two integers and prints whether the first number is greater than the second using relational operators.
// Use logical operators to combine multiple conditions.

import java.util.Scanner;

public class Logical {
    public static void main(String[] args)
     {
        boolean isFalse = false;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the num2: ");
        int num2 = sc.nextInt();
        sc.close();

        //Relational
        if(num1 > num2) 
            System.out.println("The "+num1+" is Greater than "+num2);
        if(num1 < num2) 
            System.out.println("The " + num1 + " is Less than " + num2);
        if(num1 == num2) 
            System.out.println("The " + num2 + " is Equal to " + num1);
        if(num1 != num2)
            System.out.println("The " + num2 + " is not Equal to " + num1); 
        if(num1>=num2)    
            System.out.println("The " + num1 + " is Greater than or equal to " + num2);
        if (num1 <= num2)
            System.out.println("The " + num1 + " is Less than or equal to " + num2);

        //Logical
        if(num1+num2 > num1 && num1-num2 < num1)
            System.out.println("Two conditions passed");
        else 
            System.out.println("Two conditions are not passed");  


        if (num1 + num2 > num1 || num1 - num2 < num1)
            System.out.println("One conditions passed");
        else
            System.out.println("Atleast one conditions is not passed");


        if(!isFalse) 
            System.out.println("Condition is passed");
        else 
            System.out.println("Condition not passed");  


        
    }
}
