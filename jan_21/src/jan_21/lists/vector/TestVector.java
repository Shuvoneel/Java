package jan_21.lists.vector;

import java.util.*;

public class TestVector {

    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("Shuvo");
        v.addElement("Mehedi");
        v.addElement("Hasan");
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
