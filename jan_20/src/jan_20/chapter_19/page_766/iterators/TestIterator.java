package jan_20.chapter_19.page_766.iterators;

import java.util.*;

public class TestIterator {

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("New york");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toUpperCase() + " ");
        }
        

        System.out.println("\nUsing For-Each loop:");
        for (String element : collection) {
            System.out.println(element.toLowerCase());
        }
    }
}
