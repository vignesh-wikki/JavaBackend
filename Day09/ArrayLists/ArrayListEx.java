package Day09.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 15, 22, 8, 42, 17));
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        };
        System.out.println(list);
        Collections.sort(list, com);
        System.out.println(list);
    }

}
