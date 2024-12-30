/*Create an abstract class Shape with an abstract method calculateArea(). Derive classes Circle and Rectangle and implement the calculateArea() method in both.
 */

package Day3.AbstractClasses.AbstractClass;

public abstract class Shape {

    public abstract void calculateArea();

    public static void main(String[] args) {
        Shape circle = new Circle(77);
        Shape rectangle = new Rectangle(20, 50);

        circle.calculateArea();
        rectangle.calculateArea();

    }

}

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        System.out.println("Area of circle: " + (radius * 3.14));
    }

}

class Rectangle extends Shape {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void calculateArea() {
        System.out.println("Area of reactangle: " + (length * breadth));
    }
}
