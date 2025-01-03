/*Create a mini-application combining these topics:
Use a package utilities containing a generic class Container<T> to store any object.
Use an enum Priority with values LOW, MEDIUM, and HIGH.
Use a Main class to demonstrate autoboxing, access modifiers, and package imports.
 */

package Day4.AdditionalQuickChallenge.com.Utilities;

import Day4.AdditionalQuickChallenge.com.Utilities.*;

public class Main1 {
    public static void main(String[] args) {
        Container<Integer> integer = new Container<>(42); // AutoBoxing
        integer.display();

        Container<String> string = new Container<>("Vignesh"); // AutoBoxing
        string.display();

        Priority priority = Priority.HIGH;
        System.out.println("Priority: " + priority);

    }

}
