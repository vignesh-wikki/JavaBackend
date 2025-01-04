/*Write a generic method printArray(T[] array) to print elements of any array type. Test it with arrays of String, Integer, and Double.
*/

package Day5.Generics.GenericsMethod;

public class Methods<T> {

    public void printArray(T[] array) {
        for (T value : array) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        Methods<Integer> integer = new Methods<>();
        Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        integer.printArray(arr);
        System.out.println();
        Methods<String> string = new Methods<>();
        String[] str = { "Vignesg", " Shivan" };
        string.printArray(str);
        System.out.println();
        Methods<Double> doubles = new Methods<>();
        Double[] doubleArray = { 132.556, 2.878, 3.87, 4.876, 5.867, 6.87, 7.543, 8.432, 9.54, 10.86 };
        doubles.printArray(doubleArray);

    }
}
