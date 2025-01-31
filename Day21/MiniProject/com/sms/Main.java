package Day21.MiniProject.com.sms;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.regex.Pattern;

import Day21.MiniProject.com.sms.controller.Controller;
import Day21.MiniProject.com.sms.model.Student;

public class Main {
    Scanner getInput = new Scanner(System.in);
    Controller controller;
    public ExecutorService service;

    //Initializing the Controller and Executor Service
    public Main() {
        service = Executors.newFixedThreadPool(5);
        controller = new Controller(service);
    }

    // calling method start to get user input
    public static void main(String[] args) {
        System.out.println("--------------Welcome to Student Management System-------------");
        Main obj = new Main();
        obj.start();
    }

    public void start() {
        int option;
        do {
            menu();
            option = Integer.parseInt(getInput.nextLine());
            try {
                switch (option) {
                    case 1 -> controller.add(getInputFromUser());   // adding student data
                    case 2 -> controller.display();                 // view all student data
                    case 3 -> controller.search(getStudentId());    // search student by id
                    case 4 -> controller.search(getStudentName());  // search student by name
                    case 5 -> controller.search(getStudentGrade()); // search student by grade
                    case 6 -> {
                        controller.search(getStudentId());          // it shows the updating student data first
                        controller.update(getInputFromUser());      // this will update the student data
                    }
                    case 7 -> controller.delete(getStudentId());    // deleting the student data
                    case 8 -> controller.orderByName();             // order by name
                    case 9 -> controller.orderByAge();              // order by age
                    case 10 -> controller.getFailedStudent();       // get failed student details
                    case 11 -> System.exit(0);                // for exit
                    default -> System.out.println("Entered wrong input please enter correct number");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (option != 11);
        getInput.close();
        service.shutdown();
    }

    // menu options
    public void menu() {
        System.out.println("Menu");
        System.out.println("1. Add new Student data.");
        System.out.println("2. View all Student data.");
        System.out.println("3. Search a Student by Id.");
        System.out.println("4. Search a Student by Name.");
        System.out.println("5. Search a Student by Grade.");
        System.out.println("6. Update a Student data.");
        System.out.println("7. Delete a Student data.");
        System.out.println("8. Get student details order by name.");
        System.out.println("9. Get student details order by age.");
        System.out.println("10. Get Failed student details.");
        System.out.println("11. For exit.");
        System.out.println("Enter your choice: ");
    }

    // getting each data from user
    public Student getInputFromUser() {
        return new Student(getStudentId(), getStudentName(), getStudentAge(), getStudentGrade(), getStudentEmail());
    }

    // get and check id
    public int getStudentId() {
        System.out.println("Id must be not 0, please enter id greater than 0.");
        System.out.println("Enter the id: ");
        int id = Integer.parseInt(getInput.nextLine());
        try {
            IntPredicate check = (stdId) -> stdId > 0;
            if (!check.test(id)) getStudentId();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("The input must be Number.");
        }
        return id;
    }

    // get and check name
    public String getStudentName() {
        System.out.println("Enter the name: ");
        String name = getInput.nextLine();
        try {
            Predicate<String> check = (name1) -> name1.length() > 2;
            if (!check.test(name)) getStudentName();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return name;
    }

    // get and check age
    public int getStudentAge() {
        System.out.println("Enter the age: ");
        int age = Integer.parseInt(getInput.nextLine());
        try {
            IntPredicate check = (age1) -> age1 > 10 && age1 < 25;
            if (!check.test(age)) getStudentAge();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return age;
    }

    // get and check grade
    public char getStudentGrade() {
        System.out.println("Enter the grade: ");
        char grade = getInput.nextLine().charAt(0);
        try {
            Predicate<Character> check = (grade1) -> grade1 == 'A' || grade1 == 'B' || grade1 == 'C' || grade1 == 'F';
            if (!check.test(grade)) getStudentGrade();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return grade;
    }

    // get and check email
    public String getStudentEmail() {
        System.out.println("Enter the email: ");
        String email = getInput.nextLine();
        try {
            Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,6}$");
            if (!pattern.matcher(email).matches()) getStudentEmail();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return email;
    }
}
