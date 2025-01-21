package Day16.Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class FunctionInterfaceExample {
    List<Integer> list;

    FunctionInterfaceExample() {
        list = new ArrayList<>();
    }

    public void mapStringsToLength(List<String> strings, Function<String, Integer> fun) {
        strings.forEach((str) -> {
            list.add(fun.apply(str));
        });

        list.forEach((str) -> System.out.print(str+" "));
    }

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Hello", "World", "Java");

        Function<String, Integer> function = (str) -> str.length();

        FunctionInterfaceExample obj = new FunctionInterfaceExample();

        obj.mapStringsToLength(strings, function);
    }
}