package Day19.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorEx implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.print(i + " ");
    }

    public static void main(String[] args) {
        long c = System.currentTimeMillis();
        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++)
            service.submit(new ExecutorEx());
        service.shutdown();
        long e = System.currentTimeMillis();
        System.out.println(e - c);
    }
}
