package jan_14.page_427.array_listing;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Student> list = new ArrayList();
        list.add(new Student(100, "Mehedi", "01717677451"));
        list.add(new Student(101, "Hasan", "01717677452"));
        list.add(new Student(102, "Shuvo", "01717677453"));
        Student s1 = new Student(103, "Rony", "01717677454");

        for (Student s : list) {
            System.out.println(s.getId() + ", " +
                    s.getName() + ", " + s.getMobileNo());
            System.out.println(s);
        }
    }
}
