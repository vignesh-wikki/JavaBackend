/*Create a class Calculator with overloaded methods 
add(int, int), add(double, double), and add(int, int, int). Test all methods.
 */

package Day03.Polymorphism.CompileTimePolymorphism;

public class Calculator {
    public void add(int a, int b) {
        System.out.println("Adding of " + a + " and " + b + " is: " + (a + b));
    }

    public void add(double a, double b) {
        System.out.println("Adding of " + a + " and " + b + " is: " + (a + b));

    }

    public void add(int a, int b, int c) {
        System.out.println("Adding of " + a + " and  " + b + " and  " + c + " is: " + (a + b));

    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(5, 2);
        calc.add(5.5, 2.6);
        calc.add(876, 6546554, 7686);
    }

}
