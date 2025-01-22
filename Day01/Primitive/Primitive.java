package Day01.Primitive;
// Declare variables of all primitive types and print them.
// Convert a double to an int and print the result.


public class Primitive {
    public static void main(String[] args)
     {
        byte num1 = 127;
        short num2 = 32767;
        int num3 = 2147483647;
        long num4 = 9223372036854775807L;
        float num5 = 3.44f;
        double num6 = 3.44;
        char str1 = 'A';
        boolean istrue = false;

        System.out.print(num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+str1+" "+ istrue);
        System.out.println();
        int doubleToInt =(int) num6;

        System.out.println(doubleToInt);
    }
    
}
