package Day9.ArrayLists.ManageShoppingList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingSystem {
    List<String> shopingList = new ArrayList<>();

    public void addShopingItems(String item) {
        shopingList.add(item);
        System.out.println("Item Added");
    }

    public String removeItemFromList(String item) {
        if (shopingList.isEmpty())
            return "List is Empty!";
        shopingList.remove(item);
        return "Removed...";
    }

    public void display() {
        System.out.println("Shopping items: " + shopingList.toString());
    }

    public static void main(String[] args) {
        ShoppingSystem obj = new ShoppingSystem();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 to Add Item: ");
            System.out.println("Enter 2 to remove a item: ");
            System.out.println("Enter 3 to Display Shopping items: ");
            System.out.println("Enter 4 to Exit: ");

            int selection = sc.nextInt();
            sc.nextLine();
            switch (selection) {
                case 1 -> {
                    System.out.print("Enter the Item: ");
                    String item = sc.nextLine();
                    obj.addShopingItems(item);
                }
                case 2 -> {
                    System.out.print("Enter the Item: ");
                    String item = sc.nextLine();
                    obj.removeItemFromList(item);
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
