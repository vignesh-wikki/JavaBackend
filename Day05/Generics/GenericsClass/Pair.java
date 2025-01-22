/*Create a generic class Pair<K, V> to hold a key-value pair. Write a program to store and display pairs of different data types, like <String, Integer> or <Integer, String>.
*/

package Day05.Generics.GenericsClass;

import java.util.HashMap;
import java.util.Map;

public class Pair<K, V> {
    HashMap<K, V> map = new HashMap<>();

    public void StoreData(K key, V value) {
        if (!map.containsKey(key))
            map.put(key, value);
    }

    public void displayData() {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>();
        pair.StoreData(1, "Vignesh");
        pair.StoreData(2, "Vignesh A");
        pair.StoreData(3, "Vicky");
        pair.StoreData(4, "Wikki");
        pair.StoreData(5, "Vignesh Shivan");
        pair.displayData();

        Pair<String, Integer> pair1 = new Pair<>();
        pair1.StoreData("Vignesh", 1);
        pair1.StoreData("Vignesh A", 2);
        pair1.StoreData("Vicky", 3);
        pair1.StoreData("Wikki", 4);
        pair1.StoreData("Vignesh Shivan", 5);
        pair1.displayData();
    }

}
