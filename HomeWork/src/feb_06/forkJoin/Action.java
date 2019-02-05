package feb_06.forkJoin;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import static java.util.stream.Collectors.toList;

public class Action extends RecursiveAction {

    private static final int SEQUENTIAL_THRESHOLD = 10;

    private List<Long> data;

    public Action(List<Long> data) {
        this.data = data;
    }

    @Override
    protected void compute() {
        if (data.size() <= SEQUENTIAL_THRESHOLD) {
            long sum = computeSumDirectly();
            System.out.format("Sum of %s: %d\n", data.toString(), sum);
        } else {
            int mid = data.size() / 2;
            Action firstSubtask
                    = new Action(data.subList(0, mid));
            Action secondSubtask
                    = new Action(data.subList(mid, data.size()));

            firstSubtask.fork();
            secondSubtask.compute();
            firstSubtask.join();

        }
    }

    private long computeSumDirectly() {
        long sum = 0;
        for (Long i : data) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Random random = new Random();

        List<Long> data = random
                .longs(100, 45, 50)
                .boxed()
                .collect(toList());

        ForkJoinPool pool = new ForkJoinPool();
        Action task = new Action(data);
        pool.invoke(task);
    }
}
