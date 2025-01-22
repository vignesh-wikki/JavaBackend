package Day07.ReflectionPrograms;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }

    private void privateDisplay() {
        System.out.println("Age: " + age);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
