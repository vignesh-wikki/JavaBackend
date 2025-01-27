package Day19.CallableAndFuture;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FactorialTask implements Callable<Long> {
    private long factorial=1;
    private int number;

    public FactorialTask(int number) {
        this.number = number;
    }

    @Override
    public Long call() {
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        FactorialTask task = new FactorialTask(7);
        ExecutorService service = Executors.newFixedThreadPool(5);
        Future<Long> factorialResult = service.submit(task);
        service.shutdown();
        System.out.print("Future result is: " + factorialResult.get());
    }
}
