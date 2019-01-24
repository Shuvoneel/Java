package jan_24.chapter_20.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QExample {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            q.add(i);
        }
        System.out.println("Elements of Q: " + q);

        int removed = q.remove();
        System.out.println("Removed element: " + removed);

        System.out.println(q);
        int head = q.peek();
        System.out.println("Head of the Q: " + head);

        int size = q.size();
        System.out.println("Size of the Q: " + size);
    }
}
