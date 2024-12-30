/*Create an interface Animal with methods eat() and sleep().
 Implement this interface in classes Dog and Cat. */

package Day3.Interface.BasicInterfaceImplementation;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.eat();
        dog.sleep();

        cat.eat();
        cat.sleep();
    }

}

interface Animal {
    void eat();

    void sleep();

}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eating bones .....");
    }

    public void sleep() {
        System.out.println("Dog sleeping .....");
    }
}

class Cat implements Animal {
    public void eat() {
        System.out.println("Cat eating fishes .....");

    }

    public void sleep() {
        System.out.println("Cat sleeping .....");

    }
}
