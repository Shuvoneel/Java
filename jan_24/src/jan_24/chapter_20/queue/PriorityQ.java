package jan_24.chapter_20.queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQ {

    public static void main(String[] args) {
        PriorityQueue<String> q1 = new PriorityQueue<>();
        q1.offer("Oklahoma");
        q1.offer("Indian");
        q1.offer("Georgia");
        q1.offer("Texas");
        q1.offer("Dhaka");
        q1.offer("Rangpur");

        System.out.println("Priority Queue using Comparable:");
        while (q1.size() > 0) {
            System.out.println(q1.remove() + " ");
        }

        PriorityQueue<String> q2 = new PriorityQueue(4, Collections.reverseOrder());
        q2.offer("Oklahoma");
        q2.offer("Indian");
        q2.offer("Georgia");
        q2.offer("Texas");
        q2.offer("Dhaka");
        q2.offer("Rangpur");

        System.out.println(" ");
        System.out.println("Priority Queue using Comparator:");
        while (q2.size() > 0) {
            System.out.println(q2.remove() + " ");
        }

    }
}
