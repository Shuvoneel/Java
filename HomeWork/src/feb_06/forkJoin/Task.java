package feb_06.forkJoin;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.Random;
import static java.util.stream.Collectors.toList;

public class Task extends RecursiveTask<Long> {

    private static final int SEQUENTIAL_THRESHOLD = 15;

    private List<Long> data;

    public Task(List<Long> data) {
        this.data = data;
    }

    @Override
    protected Long compute() {
        if (data.size() <= SEQUENTIAL_THRESHOLD) {
            long sum = computeSumDirectly();
            System.out.format("Sum of %s: %d\n", data.toString(), sum);
            return sum;
        } else { 
            
            int mid = data.size() / 2;
            Task firstSubtask
                    = new Task(data.subList(0, mid));
            Task secondSubtask
                    = new Task(data.subList(mid, data.size()));

            firstSubtask.fork();

            return secondSubtask.compute()
                    + firstSubtask.join();
        }
    }

    private long computeSumDirectly() {
        long sum = 0;
        for (Long l : data) {
            sum += l;
        }
        return sum;
    }

    public static void main(String[] args) {
        Random random = new Random();

        List<Long> data = random
                .longs(100,45, 50)
                .boxed()
                .collect(toList());

        ForkJoinPool pool = new ForkJoinPool();
        Task task = new Task(data);
        System.out.println("Sum: " + pool.invoke(task));
    }
}
