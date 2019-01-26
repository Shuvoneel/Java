package jan_26.chapter_21.set.page_799;

import java.util.HashSet;
import java.util.Set;

public class TestHashset {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("London");
        set.add("New York");
        set.add("Paris");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");

        System.out.println(set);

        for (String s : set) {
            System.out.println(s.toUpperCase() + " ");
        }
    }

}
