package Day21.MiniProject.com.sms.controller;

import Day21.MiniProject.com.sms.model.Student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;

public class Controller {
    static String PATH = "/home/vignesh/Downloads/JavaBackend/Day21/MiniProject/com/sms/DAO/StudentData.json";
    Student newStudent;
    List<Student> students;
    ExecutorService service;
    private final ReentrantLock locking = new ReentrantLock(); // locking mechanism for fix the race conditions

    // initializing the services
    public Controller(ExecutorService service) {
        this.newStudent = new Student();
        this.students = new ArrayList<>();
        this.service = service;
    }

    // Adding student data
    public void add(Student student) {
        service.submit(() -> {
            locking.lock(); // locking
            //  BufferedReader for reading files
            try (BufferedReader reader = new BufferedReader(new FileReader(PATH))) {
                StringBuilder data = new StringBuilder();
                String str;
                /*  Reading JSON data from DAO/studentData.json file  */
                while ((str = reader.readLine()) != null) data.append(str).append("\n");
                //  BufferedWriter for reading files
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(PATH))) {
                    /*  Inserting new Student data in DAO/studentData.json file  */
                    if (data.isEmpty()) writer.write("[" + student.toString() + "]");
                        /*  Appending Student data in DAO/studentData.json file  */
                    else writer.write(data.substring(0, data.length() - 2) + "," + student.toString() + "]");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                locking.unlock(); // unlocking
            }
        });
    }

    // Search by student id
    public void search(int id) {
        try {
            // If there is no data is initialized the get data by calling getListOfStudent() method
            if (students.isEmpty()) students = getListOfStudent();
            // Optional class for getting rid of nullPointerException
            Optional<Student> student = students.stream().filter((s) -> s.getId() == id).findFirst();
            student.ifPresentOrElse(System.out::println, () -> System.out.println("Student not found."));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Search by student name
    public void search(String name) {
        try {
            if (students.isEmpty()) students = getListOfStudent();
            Optional<Student> student = students.stream().filter((s) -> s.getName().equals(name)).findFirst();
            student.ifPresentOrElse(System.out::println, () -> System.out.println("Student not found."));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Search by students grade and return list of students
    public void search(char grade) {
        try {
            if (students.isEmpty()) students = getListOfStudent();
            List<Student> student = students.stream().filter((s) -> s.getGrade() == grade).toList();
            if (student.isEmpty()) System.out.println("Can't get " + grade + " students data.");
            else student.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Update the student data
    public void update(Student student) {
        service.submit(() -> {
            locking.lock(); // locking
            try {
                if (students.isEmpty()) students = getListOfStudent();
                List<Student> studentList = students.stream().map((student1 -> {
                    if (student1.getId() == student.getId()) return student;
                    return student1;
                })).toList();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(PATH))) {
                    writer.write("");
                }
                for (Student data : studentList) add(data); // adding the data one by one
                System.out.println("Successfully student data updated !!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                locking.unlock(); //unlocking
            }
        });
    }

    // Delete by student id
    public void delete(int id) {
        locking.lock(); // locking
        try {
            if (students.isEmpty()) students = getListOfStudent();
            students = students.stream().filter((s) -> s.getId() != id).toList();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(PATH))) {
                writer.write("");
            }
            for (Student data : students) add(data); // adding the data one by one
            System.out.println("Successfully student data deleted !!");
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            locking.unlock(); // unlocking
        }
    }

    // Get the all student data by use of BufferReader
    public List<Student> getListOfStudent() {
        locking.lock();
        // StringBuilder for storing all JSON student data
        StringBuilder data = new StringBuilder();
        // also for retrieving and storing the JSON student data
        String str;
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH))) {
            while ((str = reader.readLine()) != null) data.append(str.trim());
            /*
             Here first removing the [ ] brackets and split the
             whole string by { } curly braces, it is like object by object.
            */
            String[] line = data.toString().replaceAll("[\\[\\]]", "").split("},\\s*\\{");
            /*
             Here iterating with line data and line data is like [{"id":"101","name":"Vignesh"}]
            */
            for (String values : line) {
                int id = 0;
                String name = "";
                int age = 0;
                char grade = 0;
                String email = "";
                /*  Again removing { } curly braces from existing data and splitting values by (,) and storing as keyPairValue  */
                String[] keyValues = values.replaceAll("[{}\"]", "").split(",");
                /*  iterating through each line pf keyValuePairs  */
                for (String pairs : keyValues) {
                    String[] keyValue = pairs.split(":");
                    // Storing key
                    String key = keyValue[0].trim();
                    // Storing value
                    String value = keyValue[1].trim();
                    switch (key) {
                        case "id" -> id = Integer.parseInt(value);
                        case "name" -> name = value;
                        case "age" -> age = Integer.parseInt(value);
                        case "grade" -> grade = value.charAt(0);
                        case "email" -> email = value;
                    }
                }
                // new student i s ready then we add it to list of student data
                students.add(new Student(id, name, age, grade, email));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            locking.unlock(); //unlocking
        }
        return students;
    }

    // get failed student details
    public void getFailedStudent() {
        if (students.isEmpty()) students = getListOfStudent();
        Optional<List<Student>> studentList = Optional.of(students.stream().filter((s) -> s.getGrade() == 'C' || s.getGrade() == 'c').toList());
        studentList.ifPresentOrElse(System.out::println, () -> System.out.println("Data not found"));
    }

    // order by name
    public void orderByName() {
        if (students.isEmpty()) students = getListOfStudent();
        Optional<List<Student>> studentList = Optional.of(students.stream().sorted((s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName())).toList());
        studentList.ifPresentOrElse(System.out::println, () -> System.out.println("Data not found"));
    }

    // order by age
    public void orderByAge() {
        if (students.isEmpty()) students = getListOfStudent();
        Optional<List<Student>> studentList = Optional.of(students.stream().sorted(Comparator.comparingInt(Student::getAge)).toList());
        studentList.ifPresentOrElse(System.out::println, () -> System.out.println("Data not found"));
    }

    // displaying whole DAO/student.json data
    public void display() {
        if (students.isEmpty()) {
            students = getListOfStudent();
        }
        try {
            students.forEach((std) -> {
                System.out.println();
                System.out.println("--------------------------------");
                System.out.println("Id: " + std.getId());
                System.out.println("Name: " + std.getName());
                System.out.println("Age: " + std.getAge());
                System.out.println("Grade: " + std.getGrade());
                System.out.println("Email: " + std.getEmail());
                System.out.println("--------------------------------");
            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}