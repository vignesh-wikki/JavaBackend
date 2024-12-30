// Write a program that has multiple overloaded methods for calculating the area of a rectangle,circle,and triangle.

package Day2.ThisAndOverloading;

public class MethodOverloading {

    public double CalculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double CalculateArea(double length, double width) {
        return length * width;
    }

    public double CalculateArea(double base, double height, float half) {
        return base * height * half;
    }

    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();

        System.out.println("Area of circle: "+obj.CalculateArea(5.67));
        System.out.println("Area of rectangle: "+obj.CalculateArea(20.77, 30.88));
        System.out.println("Area of triangle: "+obj.CalculateArea(20.56, 43.78, 0.5f));

    }

}
