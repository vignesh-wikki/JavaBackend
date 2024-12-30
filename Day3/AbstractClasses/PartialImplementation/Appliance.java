/*Create an abstract class Appliance with methods turnOn() (abstract) and turnOff() (non-abstract).
 Derive a class Fan and implement turnOn().
 */

package Day3.AbstractClasses.PartialImplementation;

public abstract class Appliance {

    public abstract void turnOn();

    public void turnOff() {
        System.out.println("Fan Off ....");
    }

    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.turnOn();
        fan.turnOff();
    }

}

class Fan extends Appliance {
    public void turnOn() {
        System.out.println("Fan On ....");

    }

}
