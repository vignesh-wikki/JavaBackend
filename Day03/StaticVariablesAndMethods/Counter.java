/*Write a program with a
class Counter
that has a
static variable to
count the
number of
objects created.
Create three
objects and
print the
count using a static method.
*/

package Day03.StaticVariablesAndMethods;

public class Counter {
    static int count;

    public Counter() {
        count += 1;
    }

    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        System.out.print("Number of Objects created: " + count);

    }
}
