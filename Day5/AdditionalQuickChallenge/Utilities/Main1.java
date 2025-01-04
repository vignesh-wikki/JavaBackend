/*Create a mini-application combining these topics:
Use a package utilities containing a generic class Container<T> to store any object.
Use an enum Priority with values LOW, MEDIUM, and HIGH.
Use a Main class to demonstrate autoboxing, access modifiers, and package imports.
 */

package Day5.AdditionalQuickChallenge.Utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {
        Container<Integer> integer = new Container<>(42); // Integer type
        integer.display();

        Container<Priority> constants = new Container<>(Priority.HIGH); // Enum type
        constants.display();

        Priority priority = Priority.HIGH;
        System.out.println("Priority: " + priority);

        for (Priority value : Priority.values()) {
            System.out.println(value);

        }

        int number = integer.getObj(); // Autoboxing
        System.out.println(number);

        Container<String> string = new Container<>("Vignesh");
        string.display();

        Container<Double> floating = new Container<>(7686.8876);
        floating.display();

        Container<Long> bigInteger = new Container<>(127545678765L);
        bigInteger.display();

        Container<Short> shorts = new Container<>((short) 120);
        shorts.display();

        Container<Byte> bytes = new Container<>((byte) 12);
        bytes.display();

        Container<Character> chars = new Container<>('A');
        chars.display();

        Container<List> list = new Container<>(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
        list.display();

        Container<Map<Integer, String>> map = new Container<>(new HashMap<>());
        map.getObj().put(101, "Vignesh");
        map.display();

    }
}