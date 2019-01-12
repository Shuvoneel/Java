package jan_12.chapter_11.inheritence.polymorphism;

public class Overload {

    void demo(int a) {
        System.out.println("a: " + a);
    }

    void demo(int b, int c) {
        System.out.println("b & c: " + b + ", " + c);
    }

    double demo(double d) {
        System.out.println("double d: " + d);
        return d * 4;
    }
}
