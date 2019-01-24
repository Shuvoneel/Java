package jan_24.chapter_20.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QUsingComparator {

    public static void main(String[] args) {
        Comparator<String> lengthComparator = new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        PriorityQueue<String> priorityName = new PriorityQueue<>(lengthComparator);

        priorityName.add("Lisa");
        priorityName.add("Robert");
        priorityName.add("John");
        priorityName.add("Chris");
        priorityName.add("Angelina");
        priorityName.add("Joe");

        while (!priorityName.isEmpty()) {
            System.out.println(priorityName.remove());
        }
    }
}
