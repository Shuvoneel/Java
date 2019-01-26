package jan_26.chapter_21.set.page_800;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        set1.add("London");
        set1.add("New York");
        set1.add("Paris");
        set1.add("San Francisco");
        set1.add("Beijing");

        System.out.println("Set 1 is: " + set1);
        System.out.println("Size of set1: " + set1.size());

        set1.remove("London");
        System.out.println("After deleting London, set1 is: " + set1);
        System.out.println("And size is: " + set1.size());

        Set<String> set2 = new HashSet<>();

        set2.add("London");
        set2.add("Shanghai");
        set2.add("Paris");
        System.out.println("Set 2 is:" + set2);
        System.out.println("Size of set 2 is: " + set2.size());

        System.out.println("Is Taipei in set2 ? " + set2.contains("Taipei"));

        set1.addAll(set2);
        System.out.println("After adding set2 to set1, set 1 is: " + set1);
        set1.removeAll(set2);
        System.out.println("After removing set2 from set1, set 1 is: " + set1);
        set1.retainAll(set2);
        System.out.println("After removing common elements in set2 from set1, set 1 is: " + set1);

    }

}
