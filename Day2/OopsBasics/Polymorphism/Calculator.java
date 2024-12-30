// Implement method overloading in a
// class Calculator
// with methods
// to add integers,doubles,
// and arrays
// of numbers.

package Day2.OopsBasics.Polymorphism;

public class Calculator {
    public void add(int num1, int num2) {
        System.out.println("Added sum: " + (num1 + num2));
    }

    public void add(double num1, double num2) {
        System.out.println("Added sum: " + (num1 + num2));
    }

    public void add(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        System.out.println("Array sum: " + sum);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(876, 657);
        calc.add(576.65, 7576.77);

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        calc.add(arr);

    }
}
