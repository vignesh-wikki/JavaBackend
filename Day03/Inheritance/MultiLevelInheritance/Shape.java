/*Create a class Shape with a method area(). 
Derive a class Rectangle with attributes length and breadth, and override the area() method. 
Further, derive a class Square from Rectangle and demonstrate multilevel inheritance. */

package Day03.Inheritance.MultiLevelInheritance;

public class Shape {
    public void area() {
        System.out.println("Here i am giving Shape to my sub classes ");
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape rectangle = new Rectangle();
        Shape square = new Square();

        shape.area();
        rectangle.area();
        square.area();

    }
}

class Rectangle extends Shape {
    public int length;
    public int breadth;

    public Rectangle() {
        this.length = 20;
        this.breadth = 50;
    }

    public void area() {
        System.out.println("Area of rectangle: " + length * breadth);
    }

}

class Square extends Rectangle {
    public void area() {
        System.out.println("Area of square: " + Math.pow(length, 2));
    }
}