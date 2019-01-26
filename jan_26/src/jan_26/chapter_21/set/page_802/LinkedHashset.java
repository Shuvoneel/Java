package jan_26.chapter_21.set.page_802;

import java.util.*;

public class LinkedHashset {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("London");
        set.add("New York");
        set.add("Paris");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");

        System.out.println(set);

        for (Object element : set) {
            System.out.print(element.toString().toLowerCase() + " ");
        }
        
//        for(String element: set){
//            System.out.println(element.toLowerCase());
//        }
    }
}
