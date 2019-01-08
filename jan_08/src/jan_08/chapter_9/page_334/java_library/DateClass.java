
package jan_08.chapter_9.page_334.java_library;

import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        System.out.println(new Date());
        
        Date date = new Date();
        System.out.println("Time in MS: "+date.getTime());
    }
}
