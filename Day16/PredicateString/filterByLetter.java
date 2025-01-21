package Day16.PredicateString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class filterByLetter {

    List<String> result;

    public filterByLetter() {
        result = new ArrayList<>();
    }

    public List<String> filterByLetter(List<String> list, Predicate<String> predicate) {
        list.forEach((data) -> {
            if (predicate.test(data))
                result.add(data);
        });

        return result;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Avocado", "Cherry");
        Predicate<String> p1 = (str) -> str.startsWith("A");

        filterByLetter obj = new filterByLetter();
        System.out.println(obj.filterByLetter(list, p1));
    }
}