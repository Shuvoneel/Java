package jan_12.chapter_11.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Student> list = new ArrayList();
        Student s1 = new Student(100, "Mehedi", 1);
        Student s2 = new Student(101, "Hasan", 2);
        Student s3 = new Student(102, "Shuvo", 3);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(new Student(103, "Pappu", 4));

        for (Student student : list) {
            System.out.println(student);
        }
    }
}
