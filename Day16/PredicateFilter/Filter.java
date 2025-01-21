package Day16.PredicateFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filter {

    List<Integer> result;

    public Filter() {
        result = new ArrayList<>();
    }

    public List<Integer> filterEvenNumber(List<Integer> list, Predicate<Integer> predicate) {
        list.forEach((data) -> {
            if (predicate.test(data))
                result.add(data);
        });

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 45, 22, 35, 60);
        Predicate<Integer> p1 = (integer) -> integer % 2 == 0;

        Filter obj = new Filter();
        System.out.println(obj.filterEvenNumber(list, p1));
    }
}
