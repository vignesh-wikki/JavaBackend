// Create a
// class Animal
// with a
// method speak(). Derive classes Dog and Cat and override the speak() method to display appropriate sounds.

package Day02.OopsBasics.Inheritance;

public class Animal {
    public void speak() {
        System.out.println("Animal sound....");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speak();
        Animal cat = new Cat();
        cat.speak();
        Animal dog = new Dog();
        dog.speak();

    }
}

class Dog extends Animal {
    public void speak() {
        System.out.println("wwow wwow .......");
    }
}

class Cat extends Animal {
    public void speak() {
        System.out.println("meow meow .......");
    }
}
