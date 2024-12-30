package Day3.Interface.InterfacewithFields;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateAreaOfCircle(77);
    }

}

class Circle implements Constants {
    public void calculateAreaOfCircle(int radius) {
        System.out.println("Area of Circle is: " + (radius * PI * radius));
    }
}

interface Constants {
    double PI = 3.14;
}
