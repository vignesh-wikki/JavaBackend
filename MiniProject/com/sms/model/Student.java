package MiniProject.com.sms.model;

public class Student {
    private int id;
    private String name;
    private int age;
    private char grade;
    private String email;

    public Student(int id, String name, int age, char grade, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.email = email;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGrade() {
        return grade;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return "{\n" + "  \"id\": \"" + id + "\",\n" + "  \"name\": \"" + name + "\",\n" + "  \"grade\": \"" + grade + "\",\n" + "  \"age\": " + age + ",\n" + "  \"email\": \"" + email + "\"\n" + "}";
    }
}
