package Day19.ParallelStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStream {
    public void TransformNumbers(List<Integer> list) {
        List<Double> data = list.parallelStream().filter((n) -> n > 50).map(Math::sqrt).limit(10)
                .collect(Collectors.toList());
        data.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(75, 88, 65, 76, 90, 32, 51, 81, 37, 73, 39, 43, 65, 12, 27, 79);
        ParallelStream result = new ParallelStream();
        result.TransformNumbers(numbers);
    }
}
