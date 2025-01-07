package Day9.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(15, 22, 8, 42, 17));

        System.out.println(list);

        System.out.println("Maximum Element: " + Collections.max(list));
    }
}
