/*Write a Java program to demonstrate object-level and method-level locking using multithreading. The program should:
Create a shared resource class (e.g., SharedPrinter) with two synchronized methods:
Method 1: Print a given string multiple times.
Method 2: Print a countdown from a given number.
Use two threads:
Thread 1: Calls the first synchronized method (print string).
Thread 2: Calls the second synchronized method (countdown).
Demonstrate the difference between:
Object-Level Locking: When both threads use the same instance of the shared resource.
Class-Level Locking: When both threads use a static synchronized method or block.
Show how the locks affect the execution order of the methods.
 */

package Day7.ObjectAndMethodLocking;

public class SharedPrinter {

    // Object level locking

    public static synchronized void StaticprintString(String message) {
        for (int i = 1; i <= 10; i++)
            System.out.println(message);
    }

    public static synchronized void StaticprintCountDown(int startingPointCountdown) {
        for (int i = 1; i <= 10; i++)
            System.out.println(startingPointCountdown + i);
    }

    public synchronized void printString(String message) {
        for (int i = 1; i <= 10; i++)
            System.out.println(message);
    }

    public synchronized void printCountDown(int startingPointCountdown) {
        for (int i = 1; i <= 10; i++)
            System.out.println(startingPointCountdown + i);
    }

    public static void main(String[] args) {

        SharedPrinter printer = new SharedPrinter();

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                StaticprintString("Vignesh");
            }
        };
        thread1.start();

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                StaticprintCountDown(1);
            }
        };
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Static locking Completed ......");

        Thread thread3 = new Thread() {
            @Override
            public void run() {
                printer.printString("Vignesh");
            }
        };
        thread3.start();

        Thread thread4 = new Thread() {
            @Override
            public void run() {
                printer.printCountDown(1);
            }
        };
        thread4.start();

        try {
            thread4.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Object level lock completed");
    }
}