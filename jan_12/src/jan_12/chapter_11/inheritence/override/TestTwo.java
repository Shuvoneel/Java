package jan_12.chapter_11.inheritence.override;

public class TestTwo {

    public static void main(String[] args) {
        A a = new A();
        B b1 = new B();
        A b2 = new B();

        System.out.println("Runtime Polymorphism: ");
        a.sayHello();
        b1.sayHello();
        b2.sayHello();
        b1.sayHi();
    }
}
