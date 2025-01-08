/*Write a Java program to demonstrate the use of multithreading. The program should:
Create two threads:
Thread 1: Print numbers from 1 to 10 with a 500ms delay between each number.
Thread 2: Print the square of numbers from 1 to 10 with a 700ms delay between each number.
Ensure both threads run concurrently.
Use Thread class or Runnable interface for thread implementation.
*/

package Day7.ThreadExamples;

public class ThreadExample {
    public static void main(String[] args) {

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i);
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        };

        thread1.start();

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                try {
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(Math.sqrt(i));
                        Thread.sleep(700);
                    }
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        };

        thread2.start();
    }

}
