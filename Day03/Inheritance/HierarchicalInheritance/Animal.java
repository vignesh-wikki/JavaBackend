/*Create a base class Animal with a method sound(). 
Derive two classes Dog and Cat from Animal. Override the sound() method to print “Bark” for Dog and “Meow” for Cat.
 */

package Day03.Inheritance.HierarchicalInheritance;

public class Animal {
    public void sound() {
        System.out.println("I am here to give a animal sound .....");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        Animal dog = new Dog();
        dog.sound();
        Animal cat = new Cat();
        cat.sound();
    }

}

class Dog extends Animal {
    public void sound() {
        System.out.println("Bark  Bark Bark .....");
    }

}

class Cat extends Animal {
    public void sound() {
        System.out.println("Meow meow meow .....");
    }

}