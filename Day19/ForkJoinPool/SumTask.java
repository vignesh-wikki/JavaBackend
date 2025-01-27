package Day19.ForkJoinPool;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Long> {
    private final long startNumber;
    private final long endNumber;
    private final long Threshold = 100;

    public SumTask(long startNumber, long endNumber) {
        this.startNumber = startNumber;
        this.endNumber = endNumber;
    }

    @Override
    protected Long compute() {
        long sum = 0;
        if ((endNumber - startNumber) <= Threshold) {
            for (long i = startNumber; i <= endNumber; i++)
                sum += i;
        } else {
            long mid = (startNumber + endNumber) / 2;
            SumTask task1 = new SumTask(startNumber, mid);
            SumTask task2 = new SumTask(mid + 1, endNumber);
            task1.fork();
            long rightResult = task2.compute();
            long leftResult = task1.join();
            sum = (leftResult + rightResult);
        }
        return sum;
    }

    public static void main(String[] args) {
        SumTask task = new SumTask(1, 1000000);
        ForkJoinPool pool = new ForkJoinPool();
        long result = pool.invoke(task);
        System.out.println("ForkjoinPool result is: " + result);
    }
}
