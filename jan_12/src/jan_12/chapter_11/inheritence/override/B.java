package jan_12.chapter_11.inheritence.override;

public class B extends A {

    @Override
    public void sayHello() {
        System.out.println("Vutta from class B");
    }

    public void sayHi() {
        super.sayHello();
        System.out.println("I'm from class B");
    }
}
