/*Define an interface Vehicle with a method start(). 
Derive two interfaces FourWheeler and TwoWheeler from it, each adding its specific methods.
 Implement these in relevant classes. */

package Day03.Interface.InterfaceInheritance;

public class InterfaceInheritence {
    public static void main(String[] args) {
        Vehicle motorVehicle = new MotorVehicle();
        Vehicle motorTwoWheeler = new MotorTwoWheeler();
        Vehicle motorFourWheeler = new MotorFourWheeler();

        motorVehicle.start();
        motorTwoWheeler.start();
        motorFourWheeler.start();
    }
}

class MotorVehicle implements Vehicle {
    public void start() {
        System.out.println("MotorVehicle starting .....");
    }
}

class MotorFourWheeler implements FourWheeler {
    public void start() {
        System.out.println("MotorFourWheeler starting .....");

    }
}

class MotorTwoWheeler implements TwoWheeler {
    public void start() {
        System.out.println("MotorTwoWheeler starting .....");

    }
}

interface Vehicle {
    void start();
}

interface FourWheeler extends Vehicle {
    void start();

}

interface TwoWheeler extends Vehicle {
    void start();

}