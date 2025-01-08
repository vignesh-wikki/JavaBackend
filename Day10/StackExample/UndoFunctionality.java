package Day10.StackExample;

import java.util.Scanner;
import java.util.Stack;

public class UndoFunctionality {
    Stack<String> context = new Stack<>();
    StringBuilder text = new StringBuilder();

    public void addString(String string) {
        context.push(string);
        text.append(string);
        text.append(" ");
    }

    public void undo() {
        if (!context.isEmpty()) {
            context.pop();
            String str = context.pop();
            System.out.println(str + " " + str.length() + " " + text.length());
            text.delete(text.length() - str.length() + 1, text.length());
            display();
        }

    }

    public void display() {
        System.out.println("Current Text: " + text.toString().trim());
    }

    public static void main(String[] args) {
        UndoFunctionality obj = new UndoFunctionality();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 to Add string: ");
            System.out.println("Enter 2 to undo: ");
            System.out.println("Enter 3 to display: ");
            System.out.println("Enter 4 to exit: ");

            int selection = sc.nextInt();
            sc.nextLine();
            switch (selection) {
                case 1 -> {
                    System.out.println("Text Editior: ");
                    String string = sc.nextLine();
                    obj.addString(string);
                }
                case 2 -> {
                    obj.undo();
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
