package Day4.AdditionalQuickChallenge.com.Utilities;

import Day4.AdditionalQuickChallenge.com.Utilities.*;

public class Main1 {
    public static void main(String[] args) {
        Container<Integer> integer = new Container<>(42); // AutoBoxing
        integer.display();

        Container<String> string = new Container<>("Vignesh"); // AutoBoxing
        string.display();

        Priority priority = Priority.HIGH;
        System.out.println("Priority: ");

    }

}
