/*Create a class Vehicle with a method start(). 
Derive a class Car that overrides the start() method. 
Write a program to demonstrate method overriding.
 */

package Day03.Inheritance.BasicInheritance;

public class Vehicle {
    public void start() {
        System.out.println("Vehcile started .....");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();

        vehicle.start();
        car.start();
    }

}

class Car extends Vehicle {
    public void start() {
        System.out.println("Car started .....");
    }
}
