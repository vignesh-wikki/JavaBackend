package Day17.InstanceMethodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InstanceMethodEx {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Abinesh","Bala",  "Arun", "Cowsick","Zyan", "Gokul",  "Wikki", "Vignesh","KariloKarthik");
        Collections.sort(names, String::compareToIgnoreCase);
        names.forEach(System.out::println);
    }

}
