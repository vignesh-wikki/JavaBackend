package Day10.SetExample;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StoreCollection {
    Set<String> collection = new TreeSet<>();

    public void addName(String name) {
        collection.add(name);
        System.out.println("Name Added...");
    }

    public String removeByName(String name) {
        if (collection.isEmpty())
            return "Collection is empty!";
        collection.remove(name);
        return "Removed...";
    }

    public void display() {
        System.out.println("Unique Names: " + collection.toString());
    }

    public static void main(String[] args) {
        StoreCollection obj = new StoreCollection();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 to Add Name: ");
            System.out.println("Enter 2 to Remove Name: ");
            System.out.println("Enter 3 to display: ");
            System.out.println("Enter 4 to exit: ");

            int selection = sc.nextInt();
            sc.nextLine();
            switch (selection) {
                case 1 -> {
                    System.out.print("Enter the name: ");
                    String name = sc.nextLine();
                    obj.addName(name);
                }
                case 2 -> {
                    System.out.print("Enter the name: ");
                    String name = sc.nextLine();
                    System.out.println(obj.removeByName(name));
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
