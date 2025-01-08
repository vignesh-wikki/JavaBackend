package Day10.QueueExample;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class CustomerSupportSystem {
    Queue<String> queue = new PriorityQueue<>();

    public void addMember(String customerName) {
        queue.add(customerName);
    }

    public void service() {
        if (!queue.isEmpty())
            queue.remove();
    }

    public void display() {
        if (!queue.isEmpty())
            System.out.println("Waiting: " + queue.toString());
    }

    public static void main(String[] args) {
        CustomerSupportSystem obj = new CustomerSupportSystem();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 to Add costomer: ");
            System.out.println("Enter 2 to service: ");
            System.out.println("Enter 3 to display waiting list: ");
            System.out.println("Enter 4 to exit: ");

            int selection = sc.nextInt();
            sc.nextLine();
            switch (selection) {
                case 1 -> {
                    System.out.println("Text Editior: ");
                    String string = sc.nextLine();
                    obj.addMember(string);
                }
                case 2 -> {
                    obj.service();
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
