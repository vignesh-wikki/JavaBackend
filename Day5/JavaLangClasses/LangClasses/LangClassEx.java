package Day5.JavaLangClasses.LangClasses;

public class LangClassEx {
    public static void main(String[] args) {
        double num1 = 25;
        double num2 = 4;
        System.out.println("Square root " + num1 + ": " + Math.sqrt(num1));
        System.out.println("Power: " + Math.pow(num1, num2));
        System.out.println("Maximum of " + num1 + " and " + num2 + ": " + Math.max(num1, num2));
        String str = "Vignesh Shivan";
        System.out.println("Length of the string: " + str.length());
        System.out.println("Uppercase version: " + str.toUpperCase());
        System.out.println("Substring: " + str.substring(7, 11));
        long start = System.currentTimeMillis();

        int sum = 0;
        for (int i = 1; i <= 1000000; i++) {
            sum += i;
        }

        long end = System.currentTimeMillis();

        System.out.println("Time: " + (end - start));

    }

}
