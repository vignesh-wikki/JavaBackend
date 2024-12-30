/*Create two interfaces Printer with a method print() and Scanner with a method scan(). Create a class AllInOne that implements both interfaces.
 */

package Day3.Interface.MultipleInterfaces;

interface Printerr {
    void print();
}

interface Scannerr {
    void scan();
}

public class MultipleInterfaceMethods {
    public static void main(String[] args) {
        AllInOne allInone = new AllInOne();
        allInone.print();
        allInone.scan();
    }
}

class AllInOne implements Printerr, Scannerr {
    public void print() {
        System.out.println("Printing something .......");
    }

    public void scan() {
        System.out.println("Scanning something .......");

    }
}
