/*Write a program to add a list of integers using a List<Integer> and demonstrate how autoboxing allows seamless addition of primitive int.
*/

package Day05.AutoboxingAndVarargs.Autoboxing;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1); // Auto boxing
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Integer number = Integer.valueOf(7); // Manual Boxing

        list.add(number);

        for (int value : list) { // unboxing
            System.out.print(value + " ");
        }
    }

}
