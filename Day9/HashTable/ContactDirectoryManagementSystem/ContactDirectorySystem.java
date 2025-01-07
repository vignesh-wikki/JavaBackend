package Day9.HashTable.ContactDirectoryManagementSystem;

import java.util.Hashtable;
import java.util.Scanner;

public class ContactDirectorySystem {
    Hashtable<String, Long> contacts = new Hashtable<>();

    public void addNamesAndContacts(String name, long phoneNumber) {
        contacts.put(name, phoneNumber);
        System.out.println("Added...");
    }

    public void searchContactByName(String name) {
        System.out.println("Search Result for " + name + ": " + contacts.get(name));
    }

    public void removeContactByName(String name) {
        contacts.remove(name);
        System.out.println("Your contact " + name + " is removed.. ");
        System.out.println("After Removel: ");
        display();
    }

    public void display() {
        System.out.println("Contacts Directory: ");
        for (String key : contacts.keySet()) {
            System.out.println(key + " -> " + contacts.get(key));
        }
    }

    public static void main(String[] args) {
        ContactDirectorySystem obj = new ContactDirectorySystem();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 to Add Contacts: ");
            System.out.println("Enter 2 to search contact: ");
            System.out.println("Enter 3 to remove a contact: ");
            System.out.println("Enter 4 to display contact: ");
            System.out.println("Enter 5 to Exit: ");

            int selection = sc.nextInt();
            sc.nextLine();

            switch (selection) {
                case 1 -> {
                    System.out.println("Enter the name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter the phone number: ");
                    long phoneNumber = sc.nextLong();
                    obj.addNamesAndContacts(name, phoneNumber);
                }
                case 2 -> {
                    System.out.println("Enter the name: ");
                    String name = sc.nextLine();
                    obj.searchContactByName(name);
                    break;
                }
                case 3 -> {
                    System.out.println("Enter the name: ");
                    String name = sc.nextLine();
                    obj.removeContactByName(name);
                    break;
                }
                case 4 -> obj.display();
                case 5 -> {
                    System.out.println("The exited.. ");
                    System.exit(0);
                    sc.close();
                }
            }

        }
    }

}
