/*Create a package shapes with two classes:
Circle with a method to calculate the area of a circle.
Rectangle with a method to calculate the area of a rectangle.
Write a Main class in the default package to import and use these classes.
 */

package Day05.JavaImportsAndPackages;

import Day05.JavaImportsAndPackages.shapes.*;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getAreaOfCircle(38);

        Reactangle reactangle = new Reactangle();
        reactangle.getAreaOfReactangle(20, 50);

    }
}
