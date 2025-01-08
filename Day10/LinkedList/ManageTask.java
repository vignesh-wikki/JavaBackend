package Day10.LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ManageTask {

    List<String> tasks = new LinkedList<>();

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task Added...");
    }

    public String removeTaskByName(String task) {
        if (tasks.isEmpty())
            return "task is empty!";
        tasks.remove(task);
        return "Removed...";
    }

    public void display() {
        for (String task : tasks) {
            System.out.println(task);
        }
    }

    public static void main(String[] args) {
        ManageTask obj = new ManageTask();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 to Add Task: ");
            System.out.println("Enter 2 to Remove Task: ");
            System.out.println("Enter 3 to display: ");
            System.out.println("Enter 4 to exit: ");

            int selection = sc.nextInt();
            sc.nextLine();
            switch (selection) {
                case 1 -> {
                    System.out.print("Enter the Task name: ");
                    String taskName = sc.nextLine();
                    obj.addTask(taskName);
                }
                case 2 -> {
                    System.out.print("Enter the Task name: ");
                    String taskName = sc.nextLine();
                    System.out.println(obj.removeTaskByName(taskName));
                    obj.display();
                }
                case 3 -> obj.display();
                case 4 -> {
                    System.out.println("The exited.. ");
                    sc.close();
                    System.exit(0);
                }
            }

        }
    }
}
