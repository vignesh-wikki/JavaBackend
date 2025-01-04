/*Use Math class methods like sqrt() and pow() in a program to calculate the hypotenuse of a right-angled triangle using static imports.
 */

package Day5.JavaImportsAndPackages.StaticImports;

import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

public class MathClass {

    public void HypotenuseOfRightAngleTrinangle(double base, double height) {
        System.out.println("Hypotenuse of rightangle Trinangle is: " + (sqrt(pow(base, 2) + pow(height, 2))));
    }

    public static void main(String[] args) {
        MathClass math = new MathClass();

        math.HypotenuseOfRightAngleTrinangle(20.56, 25.87);
    }

}
