package jan_12.chapter_11.inheritence.polymorphism;

public class MethodOverloading {

    public static void main(String[] args) {
        Overload obj = new Overload();
        double result;

        System.out.println("Compile Polymorphism:");
        obj.demo(10);
        obj.demo(10, 5);
        result = obj.demo(5.5);
        System.out.println("Output: " + result);
    }
}
