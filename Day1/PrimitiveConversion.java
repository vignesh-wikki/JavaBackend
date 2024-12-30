// Write a program that takes a float as input, converts it to int, and displays both values.
// Try a case where narrowing conversion loses precision (e.g., casting 123.456 to int).


import java.util.Scanner;

class PrimitiveConversion {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        float floatnumber = sc.nextFloat();
        sc.close();
        int intNumber = (int) floatnumber;

        System.out.println(floatnumber+" "+intNumber);

        
    }
}