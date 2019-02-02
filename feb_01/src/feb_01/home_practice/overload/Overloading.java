package feb_01.home_practice.overload;

public class Overloading {
    
    public static void main(String[] args) {
        Overloading a = new Overloading();
        a.count(5);
        a.count(10, 15);
    }

    public void count(int a) {
        System.out.println("a: " + a);
    }

    public void count(int a, int b) {
        System.out.println("a: " + a + " & " + "b: " + b);
    }
}
