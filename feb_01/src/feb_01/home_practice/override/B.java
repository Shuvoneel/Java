package feb_01.home_practice.override;

public class B extends A {

    public static void main(String[] args) {
        A a = new A() {};
        B b = new B();
        A c = new B();

       
        b.sayHello();
        c.sayHello();
    }

    @Override
    public void sayHello() {
        System.out.println("I am Shuvo !");
    }

    public void sayHi() {
        System.out.println("Are you Hasan ?");
    }
}
