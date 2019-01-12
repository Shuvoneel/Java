
package jan_12.chapter_11.inheritence.DynamicBinding;

public class Test {

    public static void main(String[] args) {
        m(new Student());
        m(new Person());
        m(new Object());
    }

    public static void m(Object obj) {
        System.out.println(obj.toString());
    }
}
